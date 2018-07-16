package arraysAndStrings.reverseCStyleString;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class SolutionTest {
  @Test
  public void reverseCStyleStringShouldReturnRevertedString() {
    assertEquals("dcba", Solution.reverseCStyleString("abcd"));
    assertEquals("I am a developer", Solution.reverseCStyleString("repoleved a ma I"));
    assertEquals("A", Solution.reverseCStyleString("A"));
    assertEquals("123456 789", Solution.reverseCStyleString("987 654321"));
  }

  @Test
  public void reverseCStyleStringShouldReturnNullIfPassedNull() {
    assertNull(Solution.reverseCStyleString(null));
  }
}
