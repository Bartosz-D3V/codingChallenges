package arraysAndStrings.removeDuplicatedChars;

class Solution {
  static String removeDuplicateChars(final String text) {
    if (text == null || text.length() <= 1) {
      return text;
    }
    final char[] bytes = new char[256];
    final StringBuilder newText = new StringBuilder(text);
    for (int i = 0; i < newText.length(); i++) {
      final char currentChar = newText.charAt(i);
      if (bytes[currentChar] == currentChar) {
        newText.deleteCharAt(i);
        i--;
      } else {
        bytes[currentChar] = currentChar;
      }
    }
    return newText.toString();
  }
}
