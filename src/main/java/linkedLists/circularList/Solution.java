package linkedLists.circularList;

import linkedLists.common.Node;

class Solution {
  static Node getNodeStartingLoop(final Node node) {
    Node slowPointer = node;
    Node fastPointer = node;
    while (fastPointer.getNext() != null && fastPointer.getNext().getNext() != null) {
      slowPointer = slowPointer.getNext();
      fastPointer = fastPointer.getNext().getNext();
      if (slowPointer == fastPointer) {
        return slowPointer;
      }
    }
    return null;
  }
}
