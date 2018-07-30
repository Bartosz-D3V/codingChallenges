package arraysAndStrings.resetColumnAndRow;

class Solution {
  static int[][] resetColumnAndRow(final int[][] array, final int rowSize, final int colSize) {
    final boolean[] rowBool = new boolean[rowSize];
    final boolean[] colBool = new boolean[colSize];
    for (int i = 0; i < colSize; i++) {
      for (int j = 0; j < rowSize; j++) {
        if (array[i][j] == 0) {
          colBool[i] = true;
          rowBool[j] = true;
        }
      }
    }
    for (int i = 0; i < colBool.length; i++) {
      for (int j = 0; j < rowBool.length; j++) {
        if (rowBool[j] || colBool[i]) {
          array[i][j] = 0;
        }
      }
    }
    return array;
  }
}
