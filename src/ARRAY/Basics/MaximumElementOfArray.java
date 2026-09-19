package ARRAY.Basics;

public class MaximumElementOfArray {
    public static void main(String[] args) {
        int[] arr = ArrayBoilerplate.inputArray();

        int MAX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        System.out.println("maximum number is : " + MAX);


    }
}
