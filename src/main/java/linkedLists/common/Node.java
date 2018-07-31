package linkedLists.common;

public final class Node {
  private final int data;
  private Node next = null;

  public Node(final int data) {
    this.data = data;
  }

  public final void appendToTail(final int data) {
    final Node node = new Node(data);
    Node head = this;
    while (head.next != null) {
      head = head.next;
    }
    head.next = node;
  }

  public final Node deleteNode(final Node head, final int data) {
    if (head.data == data) {
      return head;
    }
    return deleteNode(head.next, data);
  }

  public Node getNext() {
    return next;
  }
}
