package ARRAY.Basics;

public class MinimumElementOfArray {
    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        int MIN = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < MIN) {
                MIN = arr[i];
            }
        }

        System.out.println("Minimum number is : " + MIN);
    }
}
