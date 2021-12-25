package Folder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SaleByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        int finalPairValue = 0;
        Set<Integer> stringSet = new LinkedHashSet<>(ar);
        List<Integer> arWithDuplicatesRemoved = new ArrayList<>(stringSet);

        for (int i = 0; i < stringSet.size(); i++) {
            int frequencyOfNum = Collections.frequency(ar, arWithDuplicatesRemoved.get(i));
            finalPairValue += Math.round(frequencyOfNum / 2);
        }

        return finalPairValue;
    }
}
