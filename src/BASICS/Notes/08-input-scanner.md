# Input - The Scanner Class

## What is Scanner?

Scanner is a built-in Java class used to read input from the user.

Simple definition: Scanner reads values typed by the user on the keyboard.

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

## next() vs nextLine()

- `next()` reads characters until it finds a space or new line. Good for single words.
- `nextLine()` reads the whole line including spaces.

```java
System.out.print("Enter your full name: ");
String name = sc.nextLine();
System.out.println("Name: " + name);
```

If the user types `Aman Kumar`, `nextLine()` gives `"Aman Kumar"` and `next()` gives only `"Aman"`.

## Very Important: The nextInt() and nextLine() Problem

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

- Forgetting the import: `import java.util.Scanner;`
- Forgetting to close the scanner: `sc.close();` (good practice, though not always required).
- Using the leftover-Enter pattern incorrectly, as shown above.
- Calling nextLine() when a number input is expected.

## Important Points

- Scanner must be imported from java.util.
- nextInt, nextDouble, nextBoolean read one value of that type.
- next() reads one word, nextLine() reads the whole line.
- Read a character with sc.next().charAt(0).

## Common Interview Questions

Q. How do you read a character with Scanner?

A. Scanner has no nextChar method. Use `sc.next().charAt(0)`.

Q. What is the difference between next() and nextLine()?

A. next() reads a single word up to the first space. nextLine() reads the entire line including spaces.

Q. Why is nextLine() after nextInt() a problem?

A. nextInt() leaves the Enter key in the scanner. nextLine() reads that leftover Enter and returns an empty line. Fix by adding an extra nextLine() after the number.

Next: Operators - the symbols that perform calculations.