package Folder;

import java.util.List;

public class AVeryBigSum {

    public static long calculate(List<Integer> ar) {
        long sum = 0;

        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }

        return sum;
    }
}
