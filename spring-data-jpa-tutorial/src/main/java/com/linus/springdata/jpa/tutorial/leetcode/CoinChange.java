package com.linus.springdata.jpa.tutorial.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChange {

    // Input = [2, 1, 3], 8
    // Output = 3

    public static void main(String[] args) {
        int[] coins = {2, 1, 3};
        System.out.println(find(coins, 8));
    }

    public static int find(int[] coins, int target) {
        int[] amt = new int[target + 1];
        Arrays.fill(amt, target + 1);

        amt[0] = 0;
        for (int i=1; i<=target; i++) {
            for (int j=0; j<coins.length; j++) {
                if (i >= coins[j])
                    amt[i] = Math.min(amt[i], 1+amt[i-coins[j]]);
            }
        }
        System.out.println(Arrays.toString(amt));
        if (amt[target] < target + 1)
            return amt[target];
        return -1;
    }
}
