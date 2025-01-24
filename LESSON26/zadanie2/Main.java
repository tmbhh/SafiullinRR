package zadanie2;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response;
        String method = httpExchange.getRequestMethod();

        switch (method) {
            case "POST":
                response = handlePostRequest(httpExchange);
                break;
            case "GET":
                response = handleGetRequest(httpExchange);
                break;
            default:
                response = "Некорректный метод!";
                break;
        }

        httpExchange.sendResponseHeaders(200, 0);
        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }

    private static String handleGetRequest(HttpExchange httpExchange) {
        return "Здравствуйте!";
    }

    private static String handlePostRequest(HttpExchange httpExchange) throws IOException {
        String path = httpExchange.getRequestURI().getPath();
        String[] splitStrings = path.split("/");
        String profession = splitStrings[2];
        String name = splitStrings[3];

        InputStream inputStream = httpExchange.getRequestBody();
        byte[] bodyBytes = inputStream.readAllBytes();
        String body = new String(bodyBytes, StandardCharsets.UTF_8);

        String response = body + ", " + profession + " " + name + "!";

        Headers requestHeaders = httpExchange.getRequestHeaders();
        List<String> wishGoodDay = requestHeaders.get("X-Wish-Good-Day");
        if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
            response += " Хорошего дня!";
        }
        return response;
    }
}

public class Main {
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start();
        System.out.println("HTTP-сервер запущен на " + PORT + " порту!");
        httpServer.stop(2);
    }
}
