package org.yli.leetcode;

/**
 * Created by yli on 7/21/15.
 */
public class ReverseWordsInString {
  public String reverseWords(String s) {
    if (s == null) {
      return null;
    }

    s = s.trim();
    if (s.isEmpty()) {
      return "";
    }

    String[] subStrings = s.split("\\s+");

    StringBuilder sb = new StringBuilder();
    if (subStrings.length != 0) {
      int i = subStrings.length - 1;
      sb.append(subStrings[i]);
      --i;

      for (; i >= 0; --i) {
        sb.append(" ").append(subStrings[i]);
      }
    }

    return sb.toString();
  }
}
