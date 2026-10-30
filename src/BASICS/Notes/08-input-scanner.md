# Input - The Scanner Class

## What is Scanner?

Scanner is a built-in Java class used to read input from the user.

#### Simple definition: Scanner reads values typed by the user on the keyboard.

Scanner lives inside the package `java.util`, so we must import it at the top of the file.

```java
import java.util.Scanner;
```

## Why We Need It

Programs are more useful when they work with different inputs. Scanner lets the same program behave differently each time based on what the user types.

## Creating a Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

- `Scanner` - the class name.
- `sc` - the name we give to the scanner object.
- `new` - creates a new object.
- `System.in` - tells the scanner that input comes from the keyboard.

## Reading Different Types of Input

| Method | Reads | Example |
| --- | --- | --- |
| nextInt() | a whole number | int n = sc.nextInt(); |
| nextDouble() | a decimal number | double d = sc.nextDouble(); |
| nextFloat() | a decimal number | float f = sc.nextFloat(); |
| nextBoolean() | true or false | boolean b = sc.nextBoolean(); |
| next() | a single word (String) | String s = sc.next(); |
| nextLine() | the whole line of text | String s = sc.nextLine(); |

## Complete Example

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
```

## Reading a Character

Scanner has no direct method like `nextChar()`. To read a single character, read a word first, then take its first character.

```java
System.out.print("Enter a letter: ");
char ch = sc.next().charAt(0);
```

- `sc.next()` reads the word typed.
- `charAt(0)` returns the first character of that word.

Example: user types "Apple". `next()` returns "Apple". `charAt(0)` returns 'A'.

## next( ) vs nextLine( )

- `next()` reads characters until it finds a space or new line. Good for single words.
- `nextLine()` reads the whole line including spaces.

```java
System.out.print("Enter your full name: ");
String name = sc.nextLine();
System.out.println("Name: " + name);
```

If the user types `Avdesh Jadon`, `nextLine()` gives `"Avdesh Jadon"` and `next()` gives only `"Avdesh"`.

## Very Important: The nextInt( ) and nextLine( ) Problem

This causes a very common bug. Beginners get confused every time.

When we type a number and press Enter, the keyboard sends two things: the number and the Enter. `nextInt()` reads only the number. The Enter stays in the scanner.

Now, if we call `nextLine()` right after `nextInt()`, the `nextLine()` immediately picks up the leftover Enter and returns an empty line.

Example that looks correct but is wrong:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter age: ");
int age = sc.nextInt();

System.out.print("Enter name: ");
String name = sc.nextLine();   // skips this and reads an empty line

System.out.println("Age: " + age);
System.out.println("Name: " + name);
```

What happens with input `20` then `Rahul`:

Expected output:

```
Age: 20
Name: Rahul
```

Actual output:

```
Age: 20
Name: 
```

The name is missing because `nextLine()` read the leftover Enter.

### The Fix

Add an extra `nextLine()` after the number to consume the leftover Enter, then read the name.

```java
System.out.print("Enter age: ");
int age = sc.nextInt();
sc.nextLine();               // eats the leftover Enter

System.out.print("Enter name: ");
String name = sc.nextLine();
```

Another fix is to read the number as a String with `nextLine()` and convert it:

```java
int age = Integer.parseInt(sc.nextLine());
```

Both are correct. Use whichever is clearer for you.

Remember: this problem happens only when a text-reading method comes right after a nextInt, nextDouble, or nextFloat type method.

## Reading Multiple Numbers

```java
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
```

The user can type them spaced out or one per line; Scanner reads them in order.

## Common Mistakes

- **Forgetting the Import Statement:** Using `Scanner` without importing `java.util.Scanner;` causes a compilation error.

- **Not Closing the Scanner:** Forgetting `sc.close();` can leave the input resource open. Closing it is generally good practice when the scanner is no longer needed.

- **Ignoring the Leftover Newline:** Methods like `nextInt()` and `nextDouble()` leave the newline character in the input buffer. Calling `nextLine()` immediately afterward may read that leftover newline instead of the expected input.

- **Using `nextLine()` Instead of `nextInt()`:** If you need an integer value, use `nextInt()` rather than `nextLine()`, which reads the entire line as a String.

## Important Points

- **Scanner Import:** The `Scanner` class belongs to the `java.util` package, so you must import it before using it.

- **Reading Different Data Types:** `nextInt()`, `nextDouble()`, and `nextBoolean()` read input as integers, decimal numbers, and boolean values respectively.

- **`next()` vs `nextLine()`:** `next()` reads a single word until whitespace, whereas `nextLine()` reads the entire line, including spaces.

- **Reading a Character:** Scanner does not have a direct `nextChar()` method. Use `sc.next().charAt(0)` to read the first character of the entered word.

- **Closing Scanner:** Use `sc.close()` when you have finished reading input and no longer need the scanner.
- the symbols that perform calculations.
>The next file is [Java Operators](09-operators.md)