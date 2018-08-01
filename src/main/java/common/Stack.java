package common;

public final class Stack {
  Node top;

  public Node pop() {
    if (top != null) {
      Node topNode = top;
      top = topNode.getNext();
      return topNode;
    }
    return null;
  }

  public void push(final int data) {
    final Node node = new Node(data);
    node.setNext(top);
    top = node;
  }
}
