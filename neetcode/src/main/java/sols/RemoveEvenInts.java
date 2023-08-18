package sols;

import java.util.Arrays;

public class RemoveEvenInts {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 9, 2};

        System.out.println(Arrays.toString(arr));

        int oddCount = 0;

        // count No. of odd integers
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddCount += 1;
            }
        }

        int[] oddArr = new int[oddCount];
        int j = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddArr[j] = arr[i];
                j += 1;
            }
        }

        System.out.println(Arrays.toString(oddArr));
    }
}
