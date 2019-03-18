package arraysAndStrings.isAnagram;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
  @Test
  public void isAnagramShouldReturnTrueIfWordsAreAnagrams() {
    assertTrue(Solution.isAnagram("break", "baker"));
    assertTrue(Solution.isAnagram("leader", "dealer"));
    assertTrue(Solution.isAnagram("rebuild", "builder"));
  }

  @Test
  public void isAnagramShouldReturnFalseIfWordsAreNotAnagrams() {
    assertFalse(Solution.isAnagram("common", "era"));
    assertFalse(Solution.isAnagram("Stone", "Tone"));
    assertFalse(Solution.isAnagram("Build", "Lucid"));
  }
}
