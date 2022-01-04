package Folder;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {
    public static List<Integer> calculate(List<Integer> integerList, int d) {
        ArrayList<Integer> myList = new ArrayList<>(integerList);

        for (int i = 0; i < d; i++) {
            myList.add(myList.get(0));
            myList.remove(0);
        }

        return myList;
    }
}
