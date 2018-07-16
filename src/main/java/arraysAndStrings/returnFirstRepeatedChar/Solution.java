package arraysAndStrings.returnFirstRepeatedChar;

class Solution {
  static char getFirstRepeatedChar(final String text) {
    if (text == null || text.length() == 0) {
      return '0';
    }
    final char[] chars = new char[256];
    for (int i = 0; i < text.length(); i++) {
      final char currentChar = text.charAt(i);
      if (chars[currentChar] == currentChar) {
        return currentChar;
      } else {
        chars[currentChar] = currentChar;
      }
    }
    return '0';
  }
}
