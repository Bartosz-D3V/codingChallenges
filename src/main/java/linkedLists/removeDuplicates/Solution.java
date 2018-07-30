package linkedLists.removeDuplicates;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Solution {
  static <T> LinkedList<T> removeDuplicates(final LinkedList<T> list) {
    final Iterator<T> iterator = list.iterator();
    final Map<String, T> duplicates = new HashMap<>();
    while (iterator.hasNext()) {
      final T currentObject = iterator.next();
      if (duplicates.containsKey(currentObject.toString())) {
        iterator.remove();
      } else {
        duplicates.put(currentObject.toString(), currentObject);
      }
    }
    return list;
  }
}
