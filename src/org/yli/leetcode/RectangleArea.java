package org.yli.leetcode;

/**
 * Created by yli on 1/16/2016.
 */
public class RectangleArea {

  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    long area1 = (C - A) * (D - B);
    long area2 = (G - E) * (H - F);

    long intersection = Math.max(Math.min(C, G) - Math.max(A, E), 0) * Math.max(Math.min(D, H) - Math.max(B, F), 0);

    return (int)(area1 + area2 - intersection);
  }

}
