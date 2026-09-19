package ARRAY;

public class RoughBook {

    public static int lastOccurence(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = i;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 4, 5, 2, 5};

        int num = 5;

        int ans = lastOccurence(arr, num);
        System.out.println(ans);

    }
}
