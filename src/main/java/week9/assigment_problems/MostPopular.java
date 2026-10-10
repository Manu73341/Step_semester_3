
import java.util.HashMap;

public class MostPopular {

    static void mostPopular(String[] orders) {
        HashMap<String, Integer> counts = new HashMap<>();

        for (String item : orders) {
            counts.put(item, counts.getOrDefault(item, 0) + 1);
        }

        String bestItem = orders[0];
        int bestCount = counts.get(bestItem);

        for (String item : orders) {
            int count = counts.get(item);

            if (count > bestCount) {
                bestItem = item;
                bestCount = count;
            }
        }

        System.out.println("(" + bestItem + ", " + bestCount + ")");
    }

    public static void main(String[] args) {
        String[] orders = {
            "dosa", "idli", "vada", "dosa",
            "idli", "dosa", "tea"
        };

        mostPopular(orders);
    }
}
