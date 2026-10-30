package ARRAY.TwoDArray;

import ARRAY.Basics.ArrayBoilerplate;

public class MultiDimentionalArray {

    public static void printTwoDArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        int[][] arr = ArrayBoilerplate.TwoDInputArray();

        printTwoDArray(arr);


    }
}
