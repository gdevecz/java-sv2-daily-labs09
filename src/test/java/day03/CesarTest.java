package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CesarTest {

    @Test
    void encryptsTest() {
        Cesar cesar = new Cesar(3);

        assertEquals("DE FG.ABCD+", cesar.encrypts("ab cd.wxYz+"));
    }
}