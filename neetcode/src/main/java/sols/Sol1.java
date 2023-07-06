package sols;

import java.util.HashSet;

public class Sol1 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 2};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<arr.length; i++) {
            if (hashSet.contains(arr[i]))
                return true;
            hashSet.add(arr[i]);
        }
        return false;
    }
}
