import java.util.HashMap;

public class CachingSqrt {
    private static HashMap<Double, Double> cache = new HashMap<>();

    public static double sqrt(double num) {
        if (cache.containsKey(num)) {
            return cache.get(num);
        }

        double result = Math.sqrt(num);
        cache.put(num, result);
        return result;
    }

    public static void cacheSqrt(double num) {
        if (!cache.containsKey(num)) {
            double result = sqrt(num);
            System.out.printf("%.2f : %.2f%n", num, result);
        } else {
            System.out.printf("%.2f : %.2f%n", num, cache.get(num));
        }
    }
}