package arraysAndStrings.reverseCStyleString;

class Solution {
  static String reverseCStyleString(final String text) {
    if (text == null || text.length() == 1) {
      return text;
    }
    final char[] chars = new char[text.length()];
    int counter = 0;
    for (int i = text.length() - 1; i >= 0; i--) {
      chars[counter] = text.charAt(i);
      counter++;
    }
    return String.valueOf(chars);
  }
}
