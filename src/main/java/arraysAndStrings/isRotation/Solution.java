package arraysAndStrings.isRotation;

class Solution {
  static boolean isRotation(final String text, final String rotation) {
    if (text == null || rotation == null || text.length() != rotation.length()) {
      return false;
    }
    for (int i = 0; i < text.length(); i++) {
      if (!rotation.contains(text.substring(i, i + 1))) {
        return false;
      }
    }
    return true;
  }
}
