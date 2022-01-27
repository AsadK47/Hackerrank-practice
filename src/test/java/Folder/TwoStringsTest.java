package Folder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringsTest {
  @Test
  void exampleOne() {
    String s1 = "and";
    String s2 = "art";

    assertEquals(true, TwoStrings.calculateSubstringIsPresentIn(s1, s2));
  }
}