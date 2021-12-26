package Folder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {
    @Test
    void exampleOne() {
        String stringToRepeat = "abcac";

        assertEquals(4, RepeatedString.calculate(stringToRepeat, 10));
    }

    @Test
    void exampleTwo() {
        String stringToRepeat = "aba";

        assertEquals(7, RepeatedString.calculate(stringToRepeat, 10));
    }

    @Test
    void exampleThree() {
        String stringToRepeat = "a";

        assertEquals(100000, RepeatedString.calculate(stringToRepeat, 100000));
    }
}