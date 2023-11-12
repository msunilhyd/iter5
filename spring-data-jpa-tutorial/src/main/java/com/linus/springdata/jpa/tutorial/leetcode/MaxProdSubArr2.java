package com.linus.springdata.jpa.tutorial.leetcode;

public class MaxProdSubArr2 {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, -2, 0, -5, 8, -3};
        System.out.println(maxProd(arr));
    }

    public static int maxProd(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        int ans = arr[0];

        for (int i=1; i<arr.length; i++) {
            max = Math.max(arr[i], Math.max(arr[i] * min, arr[i] * max));
            min = Math.min(arr[i], Math.min(arr[i] * min, arr[i] * max));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
