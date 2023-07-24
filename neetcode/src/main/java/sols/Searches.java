package sols;

import java.util.Arrays;

public class Searches {

    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 6, 8};
        System.out.println(binarySearch(arr, 5));
    }

    public static int binarySearch(int[] arr, int n) {

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = (l+r) / 2;
            if (arr[mid] == n) {
                return mid;
            }
            else if (arr[mid] > n) {
                r = mid - 1;
            }
            else if (arr[mid] < n) {
                l = mid + 1;
            }
            System.out.println("Hello");
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int n) {
        for (int i=0; i<arr.length; i++){
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
