package arraysAndStrings.hasUniqueChars;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static boolean hasUniqueChars(final String text) {
    final String formattedText = text.toLowerCase().replace(" ", "");
    final List<Character> characterList = new ArrayList<>();
    boolean isUnique = true;
    for (int i = 0; i < formattedText.length(); i++) {
      char currentChar = formattedText.charAt(i);
      if (!characterList.contains(currentChar)) {
        characterList.add(currentChar);
      } else {
        isUnique = false;
        break;
      }
    }
    return isUnique;
  }

  public static boolean hasUniqueCharsImproved(final String text) {
    final String formattedText = text.toLowerCase().replace(" ", "");
    final boolean[] charactersDuplication = new boolean[256];
    for (int i = 0; i < formattedText.length(); i++) {
      if (charactersDuplication[formattedText.charAt(i)]) {
        return false;
      } else {
        charactersDuplication[formattedText.charAt(i)] = true;
      }
    }
    return true;
  }
}
