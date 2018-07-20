package arraysAndStrings.shiftArray;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {
  @Test
  public void shiftArrayLeftShouldReturnOriginalArrayIfArrayOrShiftsWereNullOrEmpty() {
    assertNull(Solution.shiftArrayLeft(null, 2));
    assertNull(Solution.shiftArrayLeft(null, 0));
    assertEquals(5, Solution.shiftArrayLeft(new int[5], 2).length);
  }

  @Test
  public void shiftArrayLeftShouldReturnShiftedArray() {
    final int[] actualArray1 = {5, 7, 9, 1};
    final int[] expectedArray1 = {9, 1, 5, 7};
    final int[] actualArray2 = {0, 10, 4, 2, 12, 11};
    final int[] expectedArray2 = {11, 0, 10, 4, 2, 12};

    assertEquals(Arrays.toString(expectedArray1), Arrays.toString(Solution.shiftArrayLeft(actualArray1, 2)));
    assertEquals(Arrays.toString(expectedArray2), Arrays.toString(Solution.shiftArrayLeft(actualArray2, 5)));
  }
}
