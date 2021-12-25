package Folder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CountingValleysTest {
    @Nested
    class CountValleys {
        @Test
        void oneValley() {
            int numOfSteps = 8;
            String path = "DDUUUUDD";

            Assertions.assertEquals(1, CountingValleys.countingValleys(numOfSteps, path));
        }

        @Test
        void oneValleyDifferentString() {
            int numOfSteps = 8;
            String path = "UDDDUDUU";

            Assertions.assertEquals(1, CountingValleys.countingValleys(numOfSteps, path));
        }
    }

}