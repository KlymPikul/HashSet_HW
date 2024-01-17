import java.util.HashMap;

public class FrequencyCounter {
    public static HashMap<Character, Integer> countFrequency(String input) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }
}