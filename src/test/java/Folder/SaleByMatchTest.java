package Folder;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SaleByMatchTest {
    @Nested
    class PassingInArray {
        @Test
        void returnsTwoForGivenArray() {
            int n = 7;
            List<Integer> ar = List.of(1, 2, 1, 2, 1, 3, 2);

            Assertions.assertEquals(2, SaleByMatch.sockMerchant(n, ar));
        }

        @Test
        void returnsThreeForGivenArray() {
            int n = 9;
            List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

            Assertions.assertEquals(3, SaleByMatch.sockMerchant(n, ar));
        }
    }
}