package common;

public final class Queue {
  private Node next;
  private Node back;

  public void enqueue(final int data) {
    if (next != null) {
      back = new Node(data);
      next = back;
    } else {
      back.appendToTail(data);
      back = back.getNext();
    }
  }

  public Node dequeue() {
    if (next != null) {
      final Node node = next;
      next = next.getNext();
      return node;
    }
    return null;
  }
}
