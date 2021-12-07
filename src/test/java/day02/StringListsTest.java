package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    StringLists stringLists = new StringLists();

    @Test
    void shortestWordsTest() {
        List<String> actualSource = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        List<String> expected = Arrays.asList("aa", "bb", "dd");

        assertEquals(expected, stringLists.shortestWords(actualSource));
    }

    @Test
    void testListIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringLists.shortestWords(null));

        assertEquals("The list is null.", exception.getMessage());
    }

    @Test
    void testListIsEmpty() {
        List<String> source = new ArrayList<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringLists.shortestWords(source));

        assertEquals("The list is empty.", exception.getMessage());
    }

    @Test
    void testWordIsNull() {
        List<String> actualSource = Arrays.asList("aaa", "aa", null, "bb", "cccc", "dd");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> stringLists.shortestWords(actualSource));

        assertEquals("The word is null.", exception.getMessage());
    }
}