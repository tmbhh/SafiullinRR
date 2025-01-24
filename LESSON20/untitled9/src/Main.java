import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circle> circles = Arrays.asList(
                new Circle(3, 5, 12),
                new Circle(1, -2, 4),
                new Circle(8, 8, 8),
                new Circle(5, 1, 8)
        );

        Comparator<Circle> comparator = (circle1, circle2) -> {
            if (circle1.getRadius() != circle2.getRadius()) {
                return Integer.compare(circle1.getRadius(), circle2.getRadius());
            } else {
                int sumCenter1 = circle1.getCenterX() + circle1.getCenterY();
                int sumCenter2 = circle2.getCenterX() + circle2.getCenterY();
                return Integer.compare(sumCenter1, sumCenter2);
            }
        };

        circles.sort(comparator);

        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}

class Circle {
    private final int centerX;
    private final int centerY;
    private final int radius;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Радиус окружности: " + radius
                + ", координаты: "
                + centerX
                + ", "
                + centerY;
    }
}