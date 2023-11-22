package com.linus.springdata.jpa.tutorial.leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    // Input = [10, 5, 11, 8, 17, 18, 6, 21]
    // Output = 5

    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 8, 17, 19, 6, 21};
        int[] lis = new int[arr.length];
        Arrays.fill(lis, 1);
        int max = 0;
        for (int i=1; i<arr.length; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j])
                    lis[i] = Math.max(lis[i], 1+lis[j]);
                if (lis[i] > max)
                    max = lis[i];
            }
        }
        System.out.println(max);
    }
}
