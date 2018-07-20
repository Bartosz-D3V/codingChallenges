package arraysAndStrings.shiftArray;

class Solution {
  static int[] shiftArrayLeft(final int[] array, final int shifts) {
    if (array == null || array.length == 0 || shifts == 0) {
      return array;
    }
    final int[] shiftedArray = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      shiftedArray[i] = array[(i + shifts) % (array.length)];
    }
    return shiftedArray;
  }
}
