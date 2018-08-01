package linkedLists.removeMiddleElement;

import common.Node;

class Solution {
  static void removeMidElement(final Node nodeToRemove) {
    nodeToRemove.setData(nodeToRemove.getNext().getData());
    nodeToRemove.setNext(nodeToRemove.getNext().getNext());
  }
}
