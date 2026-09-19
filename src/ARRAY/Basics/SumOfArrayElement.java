package ARRAY.Basics;

public class SumOfArrayElement {

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}