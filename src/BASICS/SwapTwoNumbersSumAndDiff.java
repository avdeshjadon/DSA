package BASICS;

public class SwapTwoNumbersSumAndDiff {
    public static void main(String[] args) {

        int number_1 = 10;
        int number_2 = 20;

        number_1 = number_1 + number_2;
        number_2 = number_1 - number_2;
        number_1 = number_1 - number_2;

        System.out.println(number_1 + " " + number_2);
    }
}
