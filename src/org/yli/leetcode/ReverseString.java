package org.yli.leetcode;

/**
 * Created by yli on 5/9/2016.
 */
public class ReverseString {

  public String reverseString(String s) {
    char[] chars = new char[s.length()];

    int index = s.length() - 1;
    for (int i = 0; i < s.length(); ++i) {
      chars[index--] = s.charAt(i);
    }

    return String.copyValueOf(chars);

  }

}
