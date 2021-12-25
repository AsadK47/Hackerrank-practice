package Folder;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int numValleys = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                if (altitude == -1) {
                    numValleys++;
                }
                altitude++;
            }
            if (path.charAt(i) == 'D') {
                altitude--;
            }
        }

        return numValleys;
    }
}
