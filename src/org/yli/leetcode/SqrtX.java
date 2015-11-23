package org.yli.leetcode;

/**
 * Created by yli on 11/14/2015.
 */
public class SqrtX {
  public int mySqrt(int x) {
    if (x < 2) {
      return x;
    }

    int left = 1;
    int right = x / 2;

    int lastMid = 0;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (x / mid > mid) {
        left = mid + 1;
        lastMid = mid;
      } else if (x / mid < mid) {
        right = mid - 1;
      } else {
        return mid;
      }
    }

    return lastMid;
  }
}
