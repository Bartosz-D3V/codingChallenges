package arraysAndStrings.removeDuplicatedChars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {
  @Test
  public void removeDuplicateCharsShouldReturnStringWithoutDuplicatedChars() {
    assertEquals("I amdevlopr", Solution.removeDuplicateChars("I am a developer"));
    assertEquals("Domin", Solution.removeDuplicateChars("Domino"));
    assertEquals("Finsh", Solution.removeDuplicateChars("Finish"));
    assertEquals("Monlitc", Solution.removeDuplicateChars("Monolitic"));
    assertEquals("A", Solution.removeDuplicateChars("A"));
    assertEquals("", Solution.removeDuplicateChars(""));
  }

  @Test
  public void removeDuplicateCharsShouldReturnNullIfNullWasPassed() {
    assertNull(Solution.removeDuplicateChars(null));
  }
}
