package org.yli.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by yli on 3/17/2015.
 */
public class ValidParenthesesTest {

    private ValidParentheses utilities = new ValidParentheses();

    @Test
    public void testSimple() {
        assertTrue(utilities.isValid("()[]([{}{}])"));
        assertFalse(utilities.isValid("("));
        assertFalse(utilities.isValid("()[)"));
        assertFalse(utilities.isValid("(){])"));
        assertFalse(utilities.isValid(")"));
    }

}
