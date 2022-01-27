package Folder;

import java.util.List;

public class RansomNote {

  public static boolean checkMagazine(List<String> magazine, List<String> note) {
    int counter = 0;

    for (String n : note) {
      for (String word : magazine) {
        if (n.equals(word)) {
          counter++;
        }
      }
    }

    return counter == note.size();
  }
}
