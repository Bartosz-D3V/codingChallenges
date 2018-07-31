package linkedLists.findNthElement;

import linkedLists.common.Node;

class Solution {
  static Node findNthElement(final Node head, final int n) {
    if (n == 0) {
      return head;
    }
    if (head.getNext() == null) {
      throw new IndexOutOfBoundsException("Requested index is greater than size of the list");
    }
    return findNthElement(head.getNext(), n - 1);
  }
}
