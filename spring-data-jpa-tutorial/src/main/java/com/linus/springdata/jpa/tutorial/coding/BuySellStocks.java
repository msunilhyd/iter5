package com.linus.springdata.jpa.tutorial.coding;

public class BuySellStocks {

    // Input = [7, 5, 3, 4, 2, 8, 7, 9]
    // Output = 7

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 9, 8, 34};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int buy = arr[0];
        int maxProfit = 0;

        for (int i=1; i<arr.length; i++) {
            int profit = arr[i] - buy;
            maxProfit = Math.max(profit, maxProfit);
            if (profit < 0)
                buy = arr[i];
        }
        return maxProfit;
    }
}
