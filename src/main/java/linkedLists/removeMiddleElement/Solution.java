package linkedLists.removeMiddleElement;

import linkedLists.common.Node;

class Solution {
  static void removeMidElement(final Node nodeToRemove) {
    nodeToRemove.setData(nodeToRemove.getNext().getData());
    nodeToRemove.setNext(nodeToRemove.getNext().getNext());
  }
}
