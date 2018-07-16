package arraysAndStrings.replaceEmptySpace;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void replaceSpaceShouldReplaceEmptySpaceWithSpecialString() {
    assertEquals("I%20am%20a%20developer", Solution.replaceSpace("I am a developer"));
    assertEquals("2%20+%202%20*%202%20=%206", Solution.replaceSpace("2 + 2 * 2 = 6"));
    assertEquals("", Solution.replaceSpace(""));
  }

  @Test
  public void replaceSpaceShouldReturnNullIfNullWasPassed() {
    assertNull(Solution.replaceSpace(null));
  }
}
