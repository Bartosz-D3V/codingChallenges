package arraysAndStrings.isAnagram;

class Solution {
  static boolean isAnagram(final String text1, final String text2) {
    if ((text1 == null || text2 == null) || (text1.length() != text2.length())) {
      return false;
    }
    long product1 = 0;
    long product2 = 0;
    for (int i = 0; i < text1.length(); i++) {
      product1 += text1.charAt(i);
      product2 += text2.charAt(i);
    }
    return product1 == product2;
  }
}
