package Folder;

public class RepeatedString {

    public static int calculate(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int numOfTimesToRepeat = (int) (Math.ceil((double) n / (double) s.length()));
        String infiniteString = new String(new char[numOfTimesToRepeat]).replace("\0", s);
        char[] infiniteStringCharArray = infiniteString.toCharArray();

        for (int a = 0; a < n; a++) {
            stringBuilder.append(infiniteStringCharArray[a]);
        }

        long y = stringBuilder.toString().chars().filter(character -> character == 'a').count();

        return (int) y;
    }
}
