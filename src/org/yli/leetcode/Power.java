package org.yli.leetcode;

/**
 * Created by yli on 4/28/15.
 */
public class Power {

  public double myPow(double x, int n) {
    if (n < 0) {
      return 1.0 / doPower(x, -n);
    } else {
      return doPower(x, n);
    }
  }

  private double doPower(double x, int n) {
    if (n == 0) {
      return 1.0;
    }

    double temp = doPower(x, n / 2);
    if (n % 2 == 0) {
      return temp * temp;
    } else {
      return temp * temp * x;
    }
  }

}
