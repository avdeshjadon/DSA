package ARRAY.Basics;

public class FirstRepeatingNumber {

    public static int firstRepeatingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = ArrayBoilerplate.inputArray();
        System.out.println(firstRepeatingNumber(arr));

    }
}
