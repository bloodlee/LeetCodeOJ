package org.yli.leetcode;

/**
 * Created by yli on 7/27/2015.
 */
public class EvaluateReversePolishNotation {

  public int evalRPN(String[] tokens) {
    if (tokens == null && tokens.length == 0) {
      return 0;
    }

    int[] numbers = new int[tokens.length];
    int numberPoint = -1;

    for (String token : tokens) {
      if (token.equals("+")) {
        int a = numbers[numberPoint--];
        int b = numbers[numberPoint--];
        numbers[++numberPoint] = a + b;
      } else if (token.equals("-")) {
        int a = numbers[numberPoint--];
        int b = numbers[numberPoint--];
        numbers[++numberPoint] = b - a;
      } else if (token.equals("*")) {
        int a = numbers[numberPoint--];
        int b = numbers[numberPoint--];
        numbers[++numberPoint] = b * a;
      } else if (token.equals("/")) {
        int a = numbers[numberPoint--];
        int b = numbers[numberPoint--];
        numbers[++numberPoint] = b / a;
      } else {
        numbers[++numberPoint] = Integer.valueOf(token);
      }
    }

    return numbers[0];
  }
}
