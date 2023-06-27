package TwoSum;

import org.w3c.dom.stylesheets.LinkStyle;

import java.security.KeyPair;
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(7);
        System.out.println(twoSum(list, 9));
    }

    public static String twoSum(List<Integer> list, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();

        int i = 0;

        for (Integer e: list) {
            int diff = target - e;
            if (prevMap.containsKey(diff)) {
                return prevMap.get(diff) + ", " + i;
            }
            prevMap.put(e, i);
            i += 1;
        }
        return "Not Found";
    }
}
