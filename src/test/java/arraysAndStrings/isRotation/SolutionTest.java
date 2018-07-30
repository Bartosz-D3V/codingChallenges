package arraysAndStrings.isRotation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
  @Test
  public void isRotationShouldReturnFalseIfParamsAreNullOrDifferentInLength() {
    assertFalse(Solution.isRotation(null, null));
    assertFalse(Solution.isRotation("test", null));
    assertFalse(Solution.isRotation(null, "test"));
    assertFalse(Solution.isRotation("123", "1"));
  }

  @Test
  public void isRotationShouldReturnFalseIfParametersAreNotRotated() {
    assertFalse(Solution.isRotation("test", "java"));
    assertFalse(Solution.isRotation("i am teapot", "teapot"));
    assertFalse(Solution.isRotation("development", "task"));
  }

  @Test
  public void isRotationShouldReturnTrueIfParametersAreRotated() {
    assertTrue(Solution.isRotation("test", "test"));
    assertTrue(Solution.isRotation("waterbottle", "erbottlewat"));
    assertTrue(Solution.isRotation("developer", "repoleved"));
  }
}
