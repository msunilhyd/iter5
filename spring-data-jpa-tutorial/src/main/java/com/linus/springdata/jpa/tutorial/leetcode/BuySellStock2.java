package com.linus.springdata.jpa.tutorial.leetcode;

public class BuySellStock2 {

    public static void main(String[] args) {
        int arr[] = {7, 3, 6, 2, 4, 8};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int profit = 0;
        int min = arr[0];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            profit = Math.max(profit, arr[i] - min);
        }
        return profit;
    }
}
