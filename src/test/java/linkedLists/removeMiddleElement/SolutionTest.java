package linkedLists.removeMiddleElement;

import linkedLists.common.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void removeMidElementShouldRemoveMiddleElement() {
    final Node node = new Node(1);
    node.appendToTail(2);
    node.appendToTail(3);
    node.appendToTail(4);
    node.appendToTail(5);
    node.appendToTail(6);
    node.appendToTail(7);
    final Node expectedNode = new Node(1);
    expectedNode.appendToTail(2);
    expectedNode.appendToTail(3);
    expectedNode.appendToTail(5);
    expectedNode.appendToTail(6);
    expectedNode.appendToTail(7);

    Solution.removeMidElement(node.getNext().getNext().getNext());
    assertEquals(expectedNode, node);
  }
}
