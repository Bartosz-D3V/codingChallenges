package linkedLists.sum;

import common.Node;

class Solution {
  static Node sum(final Node number1, final Node number2) {
    final StringBuilder num1Chars = new StringBuilder();
    final StringBuilder num2Chars = new StringBuilder();
    Node head = number1;
    while (head != null) {
      num1Chars.append(head.getData());
      head = head.getNext();
    }
    Node head2 = number2;
    while (head2 != null) {
      num2Chars.append(head2.getData());
      head2 = head2.getNext();
    }
    final String sum = String.valueOf(Long.valueOf(num1Chars.toString()) + Long.valueOf(num2Chars.toString()));
    final Node sumHead = new Node(Integer.valueOf(sum.substring(0, 1)));
    for (int i = 1; i < sum.length(); i++) {
      sumHead.setNext(new Node(Integer.valueOf(sum.substring(i, i + 1))));
    }
    return sumHead;
  }
}
