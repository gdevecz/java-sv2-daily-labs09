package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    List<String> words;

    public List<String> shortestWords(List<String> words) {
        if (words == null) {
            throw new IllegalArgumentException("The list is null.");
        }
        int minLength = getMinLength(words);
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() == minLength) {
                result.add(word);
            }
        }
        return result;
    }

    private int getMinLength(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("The list is empty.");
        }
        int min = words.get(0).length();
        for (String word : words) {
            if (word == null) {
                throw new IllegalArgumentException("The word is null.");
            }
            if (word.length() < min) {

                min = word.length();
            }
        }
        return min;
    }
}
