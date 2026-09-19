package ARRAY.Basics;

public class LinearSearchInAnArray {

    public static int search(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 4, 56, 332, 56, 45, 566, 356, 3};

        int num = 4;

        int result = search(arr, num);

        System.out.println(result);
    }
}