package arraysAndStrings.replaceEmptySpace;

class Solution {
  static String replaceSpace(final String text) {
    if (text == null || text.length() == 0) {
      return text;
    }
    final StringBuilder newText = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);
      if (currentChar == ' ') {
        newText.append("%20");
      } else {
        newText.append(currentChar);
      }
    }
    return newText.toString();
  }
}
