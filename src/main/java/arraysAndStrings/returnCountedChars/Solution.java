package arraysAndStrings.returnCountedChars;

import java.util.HashMap;
import java.util.Map;

class Solution {
  static String returnCountedChars(final String text) {
    if (text == null || "".equals(text)) {
      return text;
    }
    final Map<Character, Integer> chars = new HashMap<>();
    for (int i = 0; i < text.length(); i++) {
      final char currentChar = text.charAt(i);
      if (chars.containsKey(currentChar)) {
        final int charCounter = chars.get(currentChar);
        chars.put(currentChar, charCounter + 1);
      } else {
        chars.put(currentChar, 1);
      }
    }
    final StringBuilder sb = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
      sb.append(entry.getKey())
        .append(entry.getValue());
    }
    return sb.toString();
  }
}
