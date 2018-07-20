package arraysAndStrings.returnCountedChars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SolutionTest {
  @Test
  public void returnCountedCharsShouldReturnNullIfNullWasPassed() {
    assertNull(Solution.returnCountedChars(null));
  }

  @Test
  public void returnCountedCharsShouldReturnEmptyStringIfEmptyStringWasPassed() {
    assertEquals("", Solution.returnCountedChars(""));
  }

  @Test
  public void returnCountedCharsShouldReturnStringWithCountedCharacters() {
    assertEquals("a4b2c1x2", Solution.returnCountedChars("aaaabbcxx"));
    assertEquals("x4", Solution.returnCountedChars("xxxx"));
    assertEquals("x1", Solution.returnCountedChars("x"));
  }
}
