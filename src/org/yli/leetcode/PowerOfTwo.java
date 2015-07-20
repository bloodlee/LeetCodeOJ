package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    if (n < 0) {
      return false;
    }

    if (n == 1) {
      return true;
    }

    if (n % 2 != 0) {
      return false;
    }

    int count = 0;
    do {
      if ((n & 0x01) == 1) {
        ++count;
      }
      n >>= 1;
    } while (n > 0);

    return count == 1;
  }
}
