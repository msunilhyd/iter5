package sols;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Merge2SortedArrs {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 6, 8, 9};
        int[] arr2 = {2, 4, 5, 7};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int len = n1 + n2;

        int[] mergedArr = new int[len];

        Map<Integer, Boolean> mp = new TreeMap<>();

        for (int i = 0; i<n1; i++) {
            mp.put(arr1[i], true);
        }

        for (int j = 0; j<n2; j++) {
            mp.put(arr2[j], true);
        }

        for (Map.Entry<Integer, Boolean> entry : mp.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    // Tree Map stores the entries on the sorted order of keys
}
