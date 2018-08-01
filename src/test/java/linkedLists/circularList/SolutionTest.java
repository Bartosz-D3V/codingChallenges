package linkedLists.circularList;

import common.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class SolutionTest {
  @Test
  public void getNodeStartingLoopShouldReturnNullIfNoLoopWasFound() {
    final Node node = new Node(1);
    node.appendToTail(2);
    node.appendToTail(3);
    node.appendToTail(4);
    assertNull(Solution.getNodeStartingLoop(node));
  }

  @Test
  public void getNodeStartingLoopShouldReturnNodeThatStartsTheLoop() {
    final Node node = new Node(1);
    final Node node2 = new Node(2);
    final Node node3 = new Node(3);
    final Node node4 = new Node(4);
    node.setNext(node2);
    node2.setNext(node3);
    node3.setNext(node4);
    node4.setNext(node);

    assertNotNull(Solution.getNodeStartingLoop(node));
    assertEquals(node.getData(), Solution.getNodeStartingLoop(node).getData());
  }
}
