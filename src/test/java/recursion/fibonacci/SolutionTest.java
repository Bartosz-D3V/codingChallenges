package recursion.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void nthFibonacciNumberShouldReturnNthFibonacciNumber() {
    assertEquals(1, Solution.nthFibonacciNumber(1));
    assertEquals(5, Solution.nthFibonacciNumber(5));
    assertEquals(233, Solution.nthFibonacciNumber(13));
    assertEquals(377, Solution.nthFibonacciNumber(14));
  }
}
