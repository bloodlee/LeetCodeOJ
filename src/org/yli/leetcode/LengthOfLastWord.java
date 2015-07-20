package org.yli.leetcode;

/**
 * Created by yli on 7/19/15.
 */
public class LengthOfLastWord {
  public int lengthOfLastWord(String s) {
    int length = s.length();
    int wordLen = 0;

    boolean foundWord = false;
    for (int i = length - 1; i >= 0; --i) {
      if (!foundWord) {
        if (s.charAt(i) != ' ') {
          foundWord = true;
          ++wordLen;
        }
      } else {
        if (s.charAt(i) != ' ') {
          ++wordLen;
        } else {
          break;
        }
      }
    }

    return wordLen;
  }
}
