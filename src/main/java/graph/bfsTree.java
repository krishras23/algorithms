package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfsTree {
  public List<Integer> traverse(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null){
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      TreeNode node = queue.poll();
      result.add((Integer) node.val);
      if (node.left != null){
        queue.add(node.left);
      }
      if (node.right != null){
        queue.add(node.right);
      }
    }

    return result;
  }

  public List<List<Integer>> traverseByLevel(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null){
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      int size = queue.size();
      List<Integer> level = new ArrayList<>();

      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        level.add((Integer) node.val);

        if (node.left != null){
          queue.add(node.left);
        }

        if (node.right != null){
          queue.add(node.right);
        }
      }
      result.add(level);
    }
    return result;
  }
}
