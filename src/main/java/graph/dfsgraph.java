package graph;

import java.util.ArrayList;
import java.util.List;

public class dfsgraph {

  int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

  public List<Integer> traverse(int[][] grid, int sr, int sc) {
    int rows = grid.length;
    int cols = grid[0].length;

    boolean[][] visited = new boolean[rows][cols];
    List<Integer> result = new ArrayList<>();

    dfsHelper(grid, sr, sc, visited, result);
    return result;
  }

  private void dfsHelper(int[][] grid,
                         int r,
                         int c,
                         boolean[][] visited,
                         List<Integer> result) {

    int rows = grid.length;
    int cols = grid[0].length;

    if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c]) {
      return;
    }

    visited[r][c] = true;
    result.add(grid[r][c]);

    for (int[] direction : directions) {
      int nr = r + direction[0];
      int nc = c + direction[1];
      dfsHelper(grid, nr, nc, visited, result);
    }
  }
}
