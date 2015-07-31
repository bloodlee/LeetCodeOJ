package org.yli.leetcode;

import java.util.Arrays;

/**
 * Created by yli on 7/30/2015.
 */
public class CountPrimes {
  public int countPrimes(int n) {
    boolean[] isPrimeMatrix = new boolean[n];
    for (int i = 2; i < n; i++) {
      isPrimeMatrix[i] = true;
    }

    for (int i = 2; i * i < n; ++i) {
      if (!isPrimeMatrix[i]) {
        continue;
      }

      for (int j = i * i; j < n; j += i) {
        isPrimeMatrix[j] = false;
      }
    }

    int result = 0;
    for (int i = 0; i < n; ++i) {
      if (isPrimeMatrix[i]) {
        ++result;
      }
    }

    return result;
  }
}
