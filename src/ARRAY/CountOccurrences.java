package ARRAY;

import java.util.Arrays;

public class CountOccurrences {

    public static int countOccurrences(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 2, 3, 2, 3, 2, 3, 4};
        int num = 3;
        int count = countOccurrences(arr, num);
        System.out.println(num + " found " + count + " times " + "in the array : " + Arrays.toString(arr));

    }
}
