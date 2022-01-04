package Folder;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    void exampleOne() {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<Integer> rotatedList = List.of(5, 1, 2, 3, 4);

        assertEquals(rotatedList, RotateArray.calculate(integerList, 4));
    }
}