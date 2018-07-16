package arraysAndStrings.returnFirstRepeatedChar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void getFirstRepeatedCharShouldReturnFirstRepeatedChar() {
    assertEquals('r', Solution.getFirstRepeatedChar("Programmer"));
    assertEquals('c', Solution.getFirstRepeatedChar("Bicycle"));
    assertEquals('e', Solution.getFirstRepeatedChar("Developer"));
    assertEquals('s', Solution.getFirstRepeatedChar("Thesis"));
  }

  @Test
  public void getFirstRepeatedCharShouldReturn0IfNoRepeatedCharsFound() {
    assertEquals('0', Solution.getFirstRepeatedChar("Bike"));
    assertEquals('0', Solution.getFirstRepeatedChar("Brown"));
    assertEquals('0', Solution.getFirstRepeatedChar("Pale"));
  }
}
