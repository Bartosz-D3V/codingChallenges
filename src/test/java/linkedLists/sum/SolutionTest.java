package linkedLists.sum;

import linkedLists.common.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void sumShouldReturnSumOfNumbersAsNode() {
    final Node node1 = new Node(4);
    node1.appendToTail(2);
    node1.appendToTail(3);
    final Node node2 = new Node(1);
    node2.appendToTail(5);
    node2.appendToTail(7);
    final Node expectedNode = new Node(5);
    expectedNode.appendToTail(8);
    expectedNode.appendToTail(0);

    assertEquals(expectedNode, Solution.sum(node1, node2));
  }
}
