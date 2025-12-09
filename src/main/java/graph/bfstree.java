package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfstree {
  // Add the nodes to the queue so they can be processed accordingly.
  public List<Integer> traverse(node root) {
    List<Integer> result = new ArrayList<>();
    if (root == null){
      return result;
    }

    Queue<node> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      node node = queue.poll();
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

  public List<List<Integer>> traverseByLevel(node root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null){
      return result;
    }

    Queue<node> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      int size = queue.size();

      // Create an ArrayList for level to store each levels elements.
      List<Integer> level = new ArrayList<>();

      for (int i = 0; i < size; i++) {
        node node = queue.poll();
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
