package Folder;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
  @Test
  void exampleOne() {
    List<String> magazine = List.of("attack", "at", "dawn");
    List<String> note = List.of("Attack", "at", "dawn");

    assertFalse(RansomNote.checkMagazine(magazine, note));
  }

  @Test
  void exampleTwo() {
    List<String> magazine = List.of("give", "me", "one", "grand", "today", "night");
    List<String> note = List.of("give", "one", "grand", "today");

    assertTrue(RansomNote.checkMagazine(magazine, note));
  }

  @Test
  void exampleThree() {
    List<String> magazine = List.of("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
    List<String> note = List.of("ive", "got", "some", "coconuts");

    assertFalse(RansomNote.checkMagazine(magazine, note));
  }
}