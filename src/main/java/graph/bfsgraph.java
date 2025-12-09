package graph;

import java.util.LinkedList;
import java.util.Queue;

public class bfsgraph {
  int[][] grid;
  int rows = grid.length;
  int cols = grid[0].length;
  boolean[][] visited = new boolean[rows][cols];

  int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

  int[][] diagonals = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}, {-1, -1}, {1, -1}, {-1, 1}, {1, 1}};

  void bfsGrid(int sr, int sc) {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{sr, sc});
    visited[sr][sc] = true;

    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int r = cur[0], c = cur[1];
      for (int[] d : directions) {
        int nr = r + d[0];
        int nc = c + d[1];

        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && !visited[nr][nc]) {
          visited[nr][nc] = true;
          q.add(new int[]{nr, nc});
        }
      }
    }
  }
}
