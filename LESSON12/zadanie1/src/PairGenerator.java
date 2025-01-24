import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PairGenerator {

    private static final Random rnd = new Random();

    /**
     * Разбивает список незнакомцев по парам.
     */
    public List<List<Stranger>> splitByPairs(List<Stranger> strangers) {
        List<List<Stranger>> pairs = new ArrayList<>();
        while (!strangers.isEmpty()) {
            List<Stranger> pair = getRandomPair(strangers);
            pairs.add(pair);
        }
        return pairs;
    }

    /**
     * Возвращает одну пару и удаляет её из списка strangers
     */
    private List<Stranger> getRandomPair(List<Stranger> strangers) {
        int p1Index = rnd.nextInt(strangers.size());
        int p2Index = rnd.nextInt(strangers.size());
        while (p2Index == p1Index) {
            p2Index = rnd.nextInt(strangers.size());
        }

        Stranger strangerOne = strangers.get(p1Index);
        Stranger strangerTwo = strangers.get(p2Index);

        List<Stranger> pair = List.of(strangerOne, strangerTwo);
        List<Stranger> toRemove = new ArrayList<>(pair);
        strangers.removeAll(toRemove);

        return pair;
    }
}