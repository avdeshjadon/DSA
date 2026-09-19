package BASICS;

public class SwapTwoNumbersTemp {
    public static void main(String[] args) {

        int number_1 = 10;
        int number_2 = 20;

        int temp = 0;

        temp = number_1;
        number_1 = number_2;
        number_2 = temp;

        System.out.println(number_1 + " " + number_2);
    }
}
