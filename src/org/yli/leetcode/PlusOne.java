package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class PlusOne {
  public int[] plusOne(int[] digits) {
    int i = digits.length - 1;
    for (; i >= 0; --i) {
      if (digits[i] == 9) {
        digits[i] = 0;
      } else {
        ++digits[i];
        break;
      }
    }
    if (i == -1) {
      int[] newDigits = new int[digits.length + 1];
      newDigits[0] = 1;
      for (int j = 0; j < digits.length; ++j) {
        newDigits[j + 1] = digits[j];
      }
      return newDigits;
    } else {
      return digits;
    }
  }
}
