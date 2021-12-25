package Folder;

import java.util.List;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AVeryBigSumTest {
    @Nested
    class ReturnSumOfAllArrayElements {
        @Test
        void testOne() {
            List<Integer> ar = List.of(1000000001, 1000000002, 1000000003, 1000000004, 1000000005);

            assertEquals(5000000015L, AVeryBigSum.calculate(ar));
        }
    }

}