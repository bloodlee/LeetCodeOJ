package org.yli.leetcode;

/**
 * Created by yli on 1/9/2016.
 */
public class PowerOfThree {

  public boolean isPowerOfThree(int n) {
    if (n == 0) {
      return false;
    }

    if (n == 1) {
      return true;
    }

    return n % 3 == 0 ? isPowerOfThree(n / 3) : false;
  }

}
