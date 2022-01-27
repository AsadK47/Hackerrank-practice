package Folder;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
  public static boolean calculateSubstringIsPresentIn(String s1, String s2) {
    boolean result = false;
    Set<Character> characterSet = new HashSet<>();

    for (Character character : s1.toCharArray()) {
      characterSet.add(character);
    }

    for (int i = 0; i < s2.length(); i++) {
      if (characterSet.contains(s2.charAt(i))) {
        result = true;
        break;
      }
    }

    return result;
  }
}
