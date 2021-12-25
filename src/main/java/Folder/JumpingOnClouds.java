package Folder;

import java.util.List;

public class JumpingOnClouds {

    public static int calculate(List<Integer> c) {
        int numOfJumps = 0;
        int currentIndex = 0;

        while (currentIndex < c.size() - 1) {
            if ((currentIndex + 2) == c.size() || c.get(currentIndex + 2) == 1) {
                currentIndex++;
            } else {
                currentIndex += 2;
            }
            numOfJumps++;
        }

        return numOfJumps;
    }
}
