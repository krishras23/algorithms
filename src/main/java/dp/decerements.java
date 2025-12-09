package dp;

public class decerements {
  public int halve(int x) {
    if (x == 1){
      return 1;
    }
    if (x % 2 == 0) {
      return 1 + halve(x / 2) + 1;
    } else {
      return 1 + halve(x - 1) + 1;
    }
  }
}
