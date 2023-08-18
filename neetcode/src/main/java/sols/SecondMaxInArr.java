package sols;

import java.util.Map;
import java.util.TreeMap;

public class SecondMaxInArr {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 8, 9};

        Map<Integer, Boolean> mp = new TreeMap<>();

        for (int i=0; i<arr.length; i++) {
            mp.put(arr[i], true);
        }

        int size = mp.size();

        int k = 0;

        for (Map.Entry<Integer, Boolean> entry : mp.entrySet()) {{
            if (k == size - 2) {
                System.out.println(entry.getKey());
                break;
            }
            k = k + 1;
        }}
    }
}
