package org.yli.leetcode;

/**
 * Created by yli on 7/29/2015.
 */
public class ReverseBits {
  public int reverseBits(int n) {
    int result = 0;

    int i;
    while (n > 0) {
      i = n % 2;
      result += i;

      n >>= 1;
      result <<= 1;
    }

    return result;
  }
}
