package arraysAndStrings.resetColumnAndRow;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void resetColumnAndRowShouldSetColumnAndRowTo0IfGivenElementIs0() {
    final String expectedArray = Arrays.deepToString(new int[][]{{1, 0, 3}, {0, 0, 0}, {6, 0, 8}});
    final int[][] actualArray = new int[][]{{1, 2, 3}, {4, 0, 5}, {6, 7, 8}};
    assertEquals(expectedArray, Arrays.deepToString(Solution.resetColumnAndRow(actualArray, 3, 3)));

    final String expectedArray2 = Arrays.deepToString(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}});
    final int[][] actualArray2 = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 0}};
    assertEquals(expectedArray2, Arrays.deepToString(Solution.resetColumnAndRow(actualArray2, 5, 2)));
  }
}
