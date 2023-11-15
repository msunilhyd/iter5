package com.linus.springdata.jpa.tutorial.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {

        int max = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int area = Math.abs(l - r) * Math.min(arr[l], arr[r]);
            max = Math.max(max, area);
            l = l + 1;
            r = r - 1;
        }
        return max;
    }
}
