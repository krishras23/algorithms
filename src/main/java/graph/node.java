package graph;

public class node<T>{
  public T val;
  public node<T> left;
  public node<T> right;
  public node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}
