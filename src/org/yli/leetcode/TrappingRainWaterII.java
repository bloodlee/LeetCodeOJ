package org.yli.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

class TrappingRainWaterII {

  private static class Block {
    int x;
    int y;
    int h;

    Block(int x, int y, int h) {
      this.x = x;
      this.y = y;
      this.h = h;
    }

  }

  private static class BlockComparator implements Comparator<Block> {

    @Override
    public int compare(Block o1, Block o2) {
      return Integer.compare(o1.h, o2.h);
    }
  }

  private static int[][] dirs = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  public int trapRainWater(int[][] heightMap) {
    if (heightMap == null || heightMap.length == 0) {
      return 0;
    }

    int xLength = heightMap.length;
    int yLength = heightMap[0].length;

    boolean[][] visited = new boolean[xLength][yLength];
    PriorityQueue<Block> pq = new PriorityQueue<>(new BlockComparator());

    for (int i = 0; i < xLength; ++i) {
      for (int j = 0; j < yLength; ++j) {
        if (i - 1 < 0 || i + 1 >= xLength || j - 1 < 0 || j + 1 >= yLength) {
          visited[i][j] = true;
          pq.add(new Block(i, j, heightMap[i][j]));
        }
      }
    }

    int currentHeight = Integer.MIN_VALUE;
    int remainingWater = 0;

    while (!pq.isEmpty()) {
      Block top = pq.poll();
      currentHeight = Math.max(top.h, currentHeight);

      for (int[] dir : dirs) {
        int newX = top.x + dir[0];
        int newY = top.y + dir[1];

        if (newX >= 0 && newX < xLength && newY >= 0 && newY < yLength && !visited[newX][newY]) {
          if (currentHeight > heightMap[newX][newY]) {
            remainingWater += currentHeight - heightMap[newX][newY];
          }

          visited[newX][newY] = true;
          pq.add(new Block(newX, newY, heightMap[newX][newY]));
        }
      }
    }

    return remainingWater;
  }
}
