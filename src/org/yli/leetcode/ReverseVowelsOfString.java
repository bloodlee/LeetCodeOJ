package org.yli.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yli on 5/9/2016.
 */
public class ReverseVowelsOfString {
  public String reverseVowels(String s) {
    int size = s.length();

    List<Integer> indices = new ArrayList<Integer>();
    List<Character> characters = new ArrayList<Character>();

    char aChar;
    for (int i = 0; i < size; ++i) {
      aChar = s.charAt(i);
      if ('A' == aChar || 'E' == aChar || 'I' == aChar || 'O' == aChar || 'U' == aChar ||
          'a' == aChar || 'e' == aChar || 'i' == aChar || 'o' == aChar || 'u' == aChar) {
        indices.add(i);
        characters.add(aChar);
      }
    }

    int index = characters.size() - 1;
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < indices.size(); ++i) {
      sb.setCharAt(indices.get(i), characters.get(index--));
    }

    return sb.toString();
  }
}
