package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberArrows {

  // Greedy intuition: shoot as late as possible without missing the first balloon
  public int findMinArrowShots(int[][] points) {
    Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

    int arrows = 1;
    int latestPossible = points[0][1];

    for(int i = 1; i < points.length; i++){
      if(points[i][0] > latestPossible){
        arrows++;
        latestPossible = points[i][1];
      }
    }

    return arrows;
  }
}
