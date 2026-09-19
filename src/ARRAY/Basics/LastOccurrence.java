package ARRAY.Basics;

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int num) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2, 3, 2};

        int num = 2;

        int result = lastOccurrence(arr, num);

        System.out.println(result);
    }
}