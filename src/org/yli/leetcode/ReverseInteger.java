package org.yli.leetcode;

import java.util.Arrays;

/**
 * Created by yli on 7/28/2015.
 */
public class ReverseInteger {
  public int reverse(int x) {
    if (x == 0) {
      return 0;
    }

    int[] numbers = new int[32];
    Arrays.fill(numbers, -1);

    int index = 0;
    int signum = Integer.signum(x);
    int a = x > 0 ? x : -x;


    while (a > 0) {
      numbers[index++] = a % 10;
      a /= 10;
    }

    index = 0;
    int result = 0;
    long temp;
    while (numbers[index] != -1) {
      temp = (long)result * 10;
      if (temp > Integer.MAX_VALUE) {
        return 0;
      }
      result = result * 10;
      result += numbers[index++];
    }

    result *= signum;

    if (signum != Integer.signum(result)) {
      return 0;
    }

    return result;
  }
}
