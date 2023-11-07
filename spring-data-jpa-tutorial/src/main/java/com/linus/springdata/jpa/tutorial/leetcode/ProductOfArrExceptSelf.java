package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.Arrays;

public class ProductOfArrExceptSelf {

    public int[] prodExcepSelf(int[] arr) {

        int[] result = new int[arr.length];
        Arrays.fill(result, 1);

        int pre = 1, post = 1;
// [ 3, 6, 2]
// [ 1, 3, 18]
// pre = 36
        for (int i=0; i< arr.length; i++) {
            result[i] = pre;
            pre = pre * arr[i];
        }
// [12, 6, 18] post = 12
        for (int i=arr.length-1; i>=0; i--) {
            result[i] = result[i] * post;
            post = post * arr[i];
        }
        return result;
    }
}
