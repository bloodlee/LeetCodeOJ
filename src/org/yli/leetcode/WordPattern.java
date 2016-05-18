package org.yli.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yli on 1/16/2016.
 */
public class WordPattern {

  public boolean wordPattern(String pattern, String str) {
    String[] subStrs = str.split(" ");

    if (subStrs.length != pattern.length()) {
      return false;
    }

    Map<String, Character> store = new HashMap<String, Character>();
    Map<Character, String> store2 = new HashMap<Character, String>();

    Character a = null;
    for (int i = 0; i < subStrs.length; ++i) {
      a = pattern.charAt(i);

      if (store.containsKey(subStrs[i])) {
        if (!a.equals(store.get(subStrs[i]))) {
          return false;
        }
      }

      if (store2.containsKey(a)) {
        if (!subStrs[i].equals(store2.get(a))) {
          return false;
        }
      }

      store2.put(a, subStrs[i]);
      store.put(subStrs[i], a);
    }

    return true;
  }

}
