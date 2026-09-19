package ARRAY.Basics;

public class UniqueElement {

    public static int findUniqueElement(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = ArrayBoilerplate.inputArray();

        int uniqueElement = findUniqueElement(arr);
        System.out.println(uniqueElement);

    }
}
