package ARRAY.Basics;

public class RoughBook {
    public static void main(String[] args) {
        System.out.println("Total arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        if (args.length >= 3) {
            int age = Integer.parseInt(args[2]);  // String -> int
            System.out.println("Next year age: " + (age + 1));
        }
    }
}