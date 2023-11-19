package com.linus.springdata.jpa.tutorial.coding;

import java.util.HashSet;

public class DuplicateElement {

    // Input = [3, 7, 1, 6, 7, 8]
    // Output = true

    public static void main(String[] args) {
        int[] arr = {3, 1, 6, 7 , 8};
        System.out.println(find(arr));
    }

    public static boolean find(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<arr.length; i++) {
            if (set.contains(arr[i]))
                return true;
            set.add(arr[i]);
        }
        return false;
    }
}
