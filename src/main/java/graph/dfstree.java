package graph;

import java.util.ArrayList;
import java.util.List;

public class dfstree {
  public List<Integer> traverse(node root) {
    List<Integer> result = new ArrayList<>();
    dfsHelper(root, result);
    return result;
  }

  private void dfsHelper(node node, List<Integer> result) {
    if (node == null) return;

    result.add((Integer) node.val);
    dfsHelper(node.left, result);
    dfsHelper(node.right, result);
  }

  // PREORDER: VAL, LEFT, RIGHT
  // INORDER: LEFT, VAL, RIGHT
  // POSTORDER: LEFT, RIGHT, VAL
}
