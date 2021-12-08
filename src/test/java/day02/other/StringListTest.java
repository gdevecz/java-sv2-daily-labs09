package day02.other;

import day02.StringLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringListTest {

    StringList stringList = new StringList();

    @Test
    void shortestWordsTest() {
        List<String> actualSource = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        List<String> expected = Arrays.asList("aa", "bb", "dd");

        assertEquals(expected, stringList.shortestWords(actualSource));
    }

    @Test
    void testListIsNull() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringList.shortestWords(null));

        assertEquals("The list is null or empty.", exception.getMessage());
    }

    @Test
    void testListIsEmpty() {
        List<String> source = new ArrayList<>();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringList.shortestWords(source));

        assertEquals("The list is null or empty.", exception.getMessage());
    }
}