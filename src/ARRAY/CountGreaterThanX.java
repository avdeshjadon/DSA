package ARRAY;

public class CountGreaterThanX {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 33, 44, 26, 5, 3};
        int num = 4;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count++;
            }
        }

        int ans = count;

        System.out.println(ans);
    }
}