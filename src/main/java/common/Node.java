package common;

public final class Node {
  private int data;
  private Node next = null;

  public Node(int data) {
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

  public int getData() {
    return data;
  }

  public void setData(final int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(final Node next) {
    this.next = next;
  }

  @Override
  public int hashCode() {
    int hashCode = data;
    Node node = this;
    while (node.getNext() != null) {
      data += getNext().getData();
      node = node.getNext();
    }
    return hashCode;
  }

  @Override
  public boolean equals(final Object o) {
    return (o instanceof Node) && hashCode() == o.hashCode();
  }
}
