package org.yli.leetcode;

/**
 * Created by yli on 7/21/15.
 */
public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }

    if (s.isEmpty()) {
      return true;
    }

    int len = s.length();

    if (len == 1) {
      return true;
    }

    int i = 0;
    int j = len - 1;

    do {
      char a = s.charAt(i);
      if (!isAlphanumeric(a)) {
        ++i;
        continue;
      }

      char b = s.charAt(j);
      if (!isAlphanumeric(b)) {
        --j;
        continue;
      }

      if (a == b || Math.abs(a - b) == 'a' - 'A') {
        ++i;
        --j;
      } else {
        return false;
      }

    } while (j > i && i < len && j >= 0);

    return true;
  }

  private boolean isAlphanumeric(char a) {
    if (a >= 'A' && a <= 'Z') {
      return true;
    } else if (a >= 'a' && a <= 'z') {
      return true;
    } else if (a >= '0' && a <= '9') {
      return true;
    } else {
      return false;
    }
  }
}
