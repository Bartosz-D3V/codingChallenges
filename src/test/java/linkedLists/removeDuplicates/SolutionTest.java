package linkedLists.removeDuplicates;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void removeDuplicatesShouldReturnOriginalListIfNoDuplicatesFound() {
    final LinkedList<String> actualList = new LinkedList<>();
    actualList.add("Test 1");
    actualList.add("Test 2");
    actualList.add("Test 3");
    assertEquals(actualList, Solution.removeDuplicates(actualList));
  }

  @Test
  public void removeDuplicatesShouldReturnRemoveDuplicates() {
    final LinkedList<String> actualList = new LinkedList<>();
    actualList.add("Test 1");
    actualList.add("Test 1");
    actualList.add("Test 2");
    actualList.add("Test 3");
    actualList.add("Test 1");
    final LinkedList<String> expectedList = new LinkedList<>();
    expectedList.add("Test 1");
    expectedList.add("Test 2");
    expectedList.add("Test 3");
    assertEquals(expectedList, Solution.removeDuplicates(actualList));
  }
}
