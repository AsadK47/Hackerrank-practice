package Folder;

import java.util.List;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {
    @Nested
    class CalculateShortestDistance {
        @Test
        void exampleOne() {
            List<Integer> c = List.of(0, 1, 0, 0, 0, 1, 0);

            assertEquals(3, JumpingOnClouds.calculate(c));
        }

        @Test
        void exampleTwo() {
            List<Integer> c = List.of(0, 0, 1, 0, 0, 1, 0, 1, 0);

            assertEquals(5, JumpingOnClouds.calculate(c));
        }
    }
}