package ARRAY.Medium.TwoPointer;

public class SquaresOfSortedArray {

    // Print Method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] squaresOfSortedArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        int[] ans = new int[arr.length];

        // yaha k humane array ki length se start kiya hai kyuki hume ans bhi sorted chia non decreasing order mai

        int k = arr.length - 1;

        while (left <= right) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }

            k--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-10, -7, -6, -4, -3, 2, 6, 7, 8, 8};

        int[] ans = squaresOfSortedArray(arr);

        printArray(ans);
    }
}