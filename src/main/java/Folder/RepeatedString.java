package Folder;

public class RepeatedString {

    public static long calculate(String s, int n) {
        long numOfOccurrences = s.replaceAll("[^a]", "").length();
        if (numOfOccurrences == 0) {
            return n;
        }

        long remainder = n % s.length();
        long numOfRepetitions = n / s.length();
        long finalValue = numOfRepetitions * numOfOccurrences;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                finalValue++;
            }
        }

        return finalValue;
    }
}
