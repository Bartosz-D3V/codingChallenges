package common;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tree {
  private Set<Tree> trees;
  private int data;

  public Tree(int data) {
    trees = new LinkedHashSet<>();
    this.data = data;
  }

  public void appendChild(Tree tree) {
    trees.add(tree);
  }

  public void removeChild(Tree tree) {
    for (Tree tree1 : tree.getTrees()) {
      if (tree1.getData() == tree.getData()) {
        removeChild(tree);
      }
    }
  }

  public Set<Tree> getTrees() {
    return trees;
  }

  public void setTrees(Set<Tree> tree) {
    this.trees = tree;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
