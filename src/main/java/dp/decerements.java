package dp;

import org.w3c.dom.Node;

public class decerements {
  public int halve(int x) {
    if (x == 0){
      return 0;
    }
    if (x % 2 == 0) {
      return halve(x / 2) + 1;
    } else {
      return halve(x - 1) + 1;
    }
  }
}
