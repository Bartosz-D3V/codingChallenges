package common;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TreeTest {
  @Test
  public void removeChildShouldRemoveNodeFromTree() {
    Tree tree = new Tree(0);
    tree.appendChild(new Tree(1));
    tree.appendChild(new Tree(2));
    Tree nestedTree = new Tree(3);
    Tree nestedTree2 = new Tree(4);
    nestedTree.appendChild(nestedTree2);
    tree.appendChild(nestedTree);

    tree.removeChild(nestedTree2);

    assertEquals(3, tree.getTrees().size());
    assertEquals(new LinkedHashSet<>(Arrays.asList(1, 2, 3)),
      tree.getTrees().stream().map(Tree::getData).collect(Collectors.toSet()));
  }
}
