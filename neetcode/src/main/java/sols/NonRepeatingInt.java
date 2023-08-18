package sols;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingInt {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 3};

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else{
                mp.put(arr[i], 1);
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (mp.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
