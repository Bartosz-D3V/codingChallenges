package linkedLists.findNthElement;

import common.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test(expected = IndexOutOfBoundsException.class)
  public void getNthElementShouldThrowErrorIfIndexIsGreaterThanSizeOfList() {
    final Node tail = new Node(4);
    tail.appendToTail(3);
    tail.appendToTail(2);
    tail.appendToTail(1);
    Solution.findNthElement(tail, 10);
  }

  @Test
  public void getNthElementShouldReturnNodeWithGivenIndex() {
    final Node tail = new Node(4);
    tail.appendToTail(3);
    tail.appendToTail(2);
    tail.appendToTail(1);

    assertEquals(tail.getNext(), Solution.findNthElement(tail, 1));
  }
}
