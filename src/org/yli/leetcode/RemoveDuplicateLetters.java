package org.yli.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 1/9/2016.
 */
public class RemoveDuplicateLetters {

  public String removeDuplicateLetters(String s) {
    int[] counts = new int[26];
    boolean[] used = new boolean[26];
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < counts.length; ++i) {
      counts[i] = 0;
      used[i] = false;
    }

    for (char c : s.toCharArray()) {
      counts[c - 'a'] += 1;
    }

    int index;
    for (char c : s.toCharArray()) {
      index = c - 'a';

      counts[index] -= 1;

      if (used[index]) {
        continue;
      }

      int lastCharIndex = sb.length() - 1;
      while (sb.length() > 0 && sb.charAt(lastCharIndex) > c && counts[sb.charAt(lastCharIndex) - 'a'] > 0) {
        used[sb.charAt(lastCharIndex) - 'a'] = false;
        sb.deleteCharAt(lastCharIndex);
        lastCharIndex = sb.length() - 1;
      }

      sb.append(c);
      used[index] = true;
    }

    return sb.toString();
  }

}
