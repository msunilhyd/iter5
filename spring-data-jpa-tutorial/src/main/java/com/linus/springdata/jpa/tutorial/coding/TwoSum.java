package com.linus.springdata.jpa.tutorial.coding;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    // [3, 4, 2, 7], 9;
    // 2, 7

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7};
        System.out.println(Arrays.toString(find(arr, 9)));
    }

    public static int[] find(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[] {diff, arr[i]};
            }
            map.put(arr[i], 0);
        }
        return null;
    }
}
