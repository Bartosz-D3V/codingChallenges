package arraysAndStrings.hasUniqueChars;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {
  @Test
  public void hasUniqueCharsShouldReturnTrueIfTextContainsUniqueCharacters() {
    assertTrue(Solution.hasUniqueChars("Multi"));
    assertTrue(Solution.hasUniqueChars("Eph"));
    assertTrue(Solution.hasUniqueChars("Dermatoglyphics"));
    assertTrue(Solution.hasUniqueChars("Hydropneumatics"));
    assertTrue(Solution.hasUniqueChars("Lycanthropies"));
    assertTrue(Solution.hasUniqueChars("Troublemaking"));
    assertTrue(Solution.hasUniqueChars("Lexicography"));
    assertTrue(Solution.hasUniqueChars("Unsympathized"));
    assertTrue(Solution.hasUniqueChars("  I  am  bot  "));
  }

  @Test
  public void hasUniqueCharsShouldReturnFalseIfContainsRepeatedCharacters() {
    assertFalse(Solution.hasUniqueChars("Multiplication"));
    assertFalse(Solution.hasUniqueChars("Mathematics"));
    assertFalse(Solution.hasUniqueChars("Physics"));
    assertFalse(Solution.hasUniqueChars("Information"));
    assertFalse(Solution.hasUniqueChars("Pneumonoultramicroscopicsilicovolcanoconiosis"));
    assertFalse(Solution.hasUniqueChars("Programming"));
    assertFalse(Solution.hasUniqueChars("Assertion"));
    assertFalse(Solution.hasUniqueChars("Testing"));
    assertFalse(Solution.hasUniqueChars("  I am  long sentence   with random  spaces!"));
  }

  @Test
  public void hasUniqueCharsImprovedShouldReturnTrueIfTextContainsUniqueCharacters() {
    assertTrue(Solution.hasUniqueCharsImproved("Multi"));
    assertTrue(Solution.hasUniqueCharsImproved("Eph"));
    assertTrue(Solution.hasUniqueCharsImproved("Dermatoglyphics"));
    assertTrue(Solution.hasUniqueCharsImproved("Hydropneumatics"));
    assertTrue(Solution.hasUniqueCharsImproved("Lycanthropies"));
    assertTrue(Solution.hasUniqueCharsImproved("Troublemaking"));
    assertTrue(Solution.hasUniqueCharsImproved("Lexicography"));
    assertTrue(Solution.hasUniqueCharsImproved("Unsympathized"));
    assertTrue(Solution.hasUniqueCharsImproved("  I  am  bot  "));
  }

  @Test
  public void hasUniqueCharsImprovedShouldReturnFalseIfContainsRepeatedCharacters() {
    assertFalse(Solution.hasUniqueCharsImproved("Multiplication"));
    assertFalse(Solution.hasUniqueCharsImproved("Mathematics"));
    assertFalse(Solution.hasUniqueCharsImproved("Physics"));
    assertFalse(Solution.hasUniqueCharsImproved("Information"));
    assertFalse(Solution.hasUniqueCharsImproved("Pneumonoultramicroscopicsilicovolcanoconiosis"));
    assertFalse(Solution.hasUniqueCharsImproved("Programming"));
    assertFalse(Solution.hasUniqueCharsImproved("Assertion"));
    assertFalse(Solution.hasUniqueCharsImproved("Testing"));
    assertFalse(Solution.hasUniqueCharsImproved("  I am  long sentence   with random  spaces!"));
  }
}
