package org.yli.leetcode;

import java.util.*;

/**
 * Created by yli on 5/8/2016.
 */
public class TopKFrequentElements {

  public List<Integer> topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

    for (int aNum : nums) {
      if (counts.containsKey(aNum)) {
        counts.put(aNum, counts.get(aNum) + 1);
      } else {
        counts.put(aNum, 1);
      }
    }

    List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(counts.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
      @Override
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getValue() - o1.getValue();
      }
    });

    List<Integer> ret = new ArrayList<Integer>();
    for (int i = 0; i < k; ++i) {
      ret.add(list.get(i).getKey());
    }

    return ret;
  }

}
