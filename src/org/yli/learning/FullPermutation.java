package org.yli.learning;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yli on 6/9/2015.
 */
public class FullPermutation {

    private int[] a;

    private boolean[] book;

    private int[] tickets;

    private int total = 0;

    public void doFullPermutation(int[] input) {
        if (input == null || input.length == 0) {
            return;
        }

        total = input.length;

        a = new int[total + 1];
        book = new boolean[total + 1];

        Arrays.fill(a, 0);
        Arrays.fill(book, false);

        tickets = input;

        dfs(0);
    }

    private void dfs(int step) {
        if (step == total) {

            System.out.print("[ ");
            for (int i = 0; i < total; ++i) {
                System.out.print(a[i] + " ");
            }
            System.out.println("]");

            return;
        }

        for (int i = 0; i < total; ++i) {
            if (!book[i]) {
                a[step] = tickets[i];
                book[i] = true;

                dfs(step + 1);

                book[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        FullPermutation util = new FullPermutation();
        util.doFullPermutation(new int[]{1, 2, 3, 9, 10, 20});
    }

}
