package recursion.sumFibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void sumFibonacciShouldReturnSumOfAllNumbersUpToN() {
    assertEquals(0, Solution.sumFibonacci(0));
    assertEquals(1, Solution.sumFibonacci(1));
    assertEquals(2, Solution.sumFibonacci(2));
    assertEquals(20, Solution.sumFibonacci(6));
    assertEquals(143, Solution.sumFibonacci(10));
  }
}
