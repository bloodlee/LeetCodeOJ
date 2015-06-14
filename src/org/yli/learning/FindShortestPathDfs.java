package org.yli.learning;

import java.util.Scanner;

/**
 * Created by yli on 6/12/2015.
 */
public class FindShortestPathDfs {

    private final int[][] theMatrix;

    private final int startX;

    private final int startY;

    private final int destX;

    private final int destY;

    private final int m;

    private final int n;

    private int minStep;

    private static final int[][] moves = new int[][] { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };

    private boolean[][] books;

    public FindShortestPathDfs(int[][] theMatrix, int startX, int startY, int destX, int destY) {
        this.theMatrix = theMatrix;
        this.startX = startX;
        this.startY = startY;
        this.destX = destX;
        this.destY = destY;

        m = theMatrix.length;
        n = theMatrix[0].length;

        books = new boolean[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                books[i][j] = false;
            }
        }
    }

    public int search() {
        books[startY][startX] = true;
        return dfs(startX, startY, 0);
    }

    private int dfs(int x, int y, int step) {
        System.out.println(String.format("Try (%d, %d)...", x, y));

        if (x == destX && y == destY) {
            return step;
        }

        int minstep = -1;
        for (int i = 0; i < moves.length; ++i) {
            int nextX = x + moves[i][0];
            int nextY = y + moves[i][1];

            System.out.println(String.format("Test (%d, %d)...", nextX, nextY));

            if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
                continue;
            }

            if (theMatrix[nextY][nextX] == 1) {
                System.out.println(String.format("(%d, %d) is blocked", nextX, nextY));
                continue;
            }

            if (!books[nextY][nextX]) {
                books[nextY][nextX] = true;

                System.out.println(String.format("(%d, %d) -> (%d, %d)", x, y, nextX, nextY));

                int newStep = dfs(nextX, nextY, step + 1);
                if (newStep == -1) {
                    continue;
                }

                if (minstep == -1 || newStep < minstep) {
                    minstep = newStep;
                }
                books[nextY][nextX] = false;
            }
        }

        return minstep;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int startX = scanner.nextInt();
        int startY = scanner.nextInt();

        int destX = scanner.nextInt();
        int destY = scanner.nextInt();

        FindShortestPathDfs utility =
                new FindShortestPathDfs(matrix, startX, startY, destX, destY);
        int step = utility.search();
        System.out.println("min step is " + step);
    }

}
