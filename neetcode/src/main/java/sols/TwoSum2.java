package sols;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);

        System.out.println(twoSum(list, 9));
    }

    public static String twoSum(List<Integer> list, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int i = 0;
        for (Integer e : list) {
            int diff = target - e;
            if (myMap.containsKey(diff)) {
                return myMap.get(diff) + ", " + i;
            }
            myMap.put(e, i);
            i += 1;
        }
        System.out.println(myMap);
        System.out.println(i);
        return "Not Found";
    }
}
