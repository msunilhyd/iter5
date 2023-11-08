package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.Arrays;

public class ProdExcepSelf {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3};
        System.out.println(Arrays.toString(prodExSelf(arr)));
    }

    public static int[] prodExSelf(int[] arr) {
        int[] resultArr = new int[arr.length];
        int pre = 1, post = 1;

        Arrays.fill(resultArr, 1);

        // arr = [2, 4, 3]
        // resultArr = [1, 2, 8]

        for (int i=0; i<arr.length; i++) {
            resultArr[i] = pre;
            pre = pre * arr[i];
        }

        for (int i=arr.length-1; i>=0; i--) {
            resultArr[i] = post * resultArr[i];
            post = post * arr[i];
        }
        return resultArr;
    }
}
