package ARRAY;

import java.util.Arrays;

public class TargetSum {

    public static int countPairs(int[] arr, int target) {
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();

        int target = 7;
        System.out.println(countPairs(arr, target));

    }
}
