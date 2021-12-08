package day02.other;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    private List<String> words = new ArrayList<>();

    public List<String> shortestWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException("The list is null or empty.");
        }
        int minLength = words.get(0).length();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() < minLength) {
                result.clear();
                minLength = word.length();
            }
            if (word.length() == minLength) {
                result.add(word);
            }
        }
        return result;
    }
}
