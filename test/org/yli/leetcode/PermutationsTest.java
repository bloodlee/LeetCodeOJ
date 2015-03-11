package org.yli.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 3/10/15.
 */
public class PermutationsTest {

    private Permutations utilities = new Permutations();

    @Test
    public void testSimpleWithOneElement() {
        List<List<Integer>> allConditions = utilities.permute(new int[] {1});

        assertEquals(1, allConditions.size());


        assertEquals(Lists.newArrayList(1), allConditions.get(0));
    }

    @Test
    public void testSimpleWith3Elements() {
        List<List<Integer>> allConditions = utilities.permute(new int[] {1, 2, 3});

        assertEquals(6, allConditions.size());

        assertTrue(allConditions.contains(Lists.newArrayList(1,2,3)));
        assertTrue(allConditions.contains(Lists.newArrayList(1,3,2)));
        assertTrue(allConditions.contains(Lists.newArrayList(2,1,3)));
        assertTrue(allConditions.contains(Lists.newArrayList(2,3,1)));
        assertTrue(allConditions.contains(Lists.newArrayList(3,1,2)));
        assertTrue(allConditions.contains(Lists.newArrayList(3,2,1)));
    }

    @Test
    public void testEmptyArray() {
        List<List<Integer>> allConditions = utilities.permute(new int[] {});
        assertEquals(0, allConditions.size());

        allConditions = utilities.permute(null);
        assertEquals(0, allConditions.size());
    }
}
