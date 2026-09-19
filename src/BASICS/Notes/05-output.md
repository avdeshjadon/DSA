# Java Output

## What is Output?

Output is the text that the program shows on the screen.

In Java, we print output using `System.out`.

## System.out.println()

The `println` method prints the given text and then moves the cursor to the next line.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("World");
    }
}
```

Output:

```
Hello
World
```

Each `println` statement prints on a new line.

## System.out.print()

The `print` method prints the text but does NOT move to the next line.

```java
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("World");
    }
}
```

Output:

```
Hello World
```

Both strings appear on the same line because `print` never creates a new line.

## Difference Between print and println

| print() | println() |
| --- | --- |
| Prints text and stays on the same line | Prints text and moves to the next line |
| The next print starts right after the text | The next print starts on a fresh line |

```java
System.out.print("A");
System.out.print("B");
```

Output is `AB`.

```java
System.out.println("A");
System.out.println("B");
```

Output is:

```
A
B
```

## Printing Numbers and Calculations

We can print numbers directly.

```java
System.out.println(5);
System.out.println(5 + 3);
```

Output:

```
5
8
```

Java calculates `5 + 3` first, then prints the result 8.

## Printing Multiple Things

Use the `+` symbol to join text and values. This is called string concatenation. The rule: when text comes before a value, everything is joined together as text.

```java
System.out.println("Answer: " + 5);
System.out.println("Total = " + (5 + 3));
System.out.println(5 + 3);   
```

Output:

```
Answer: 5
Total = 8
8
```

The first line joins the text `"Answer: "` with the number 5.

The second line uses brackets so that the JVM calculates `5 + 3` first and prints `8`.

The third line prints the result of the calculation.

Without brackets:

```java
System.out.println("Total = " + 5 + 3);
```

Output:

```
Total = 53
```

Why? Because Java reads left to right: `"Total = " + 5` becomes the text `"Total = 5"`, then `"Total = 5" + 3` becomes `"Total = 53"`. The numbers are joined as text, not added. This trick appears often in interviews. Mark as a common interview question.

## Escape Sequences

An escape sequence is a special symbol that starts with backslash `\` and has a special meaning.

The two most used are:

- `\n` - new line (cursor moves to next line)
- `\t` - tab (adds a small gap)
- `\"` - double quote inside text
- `\\` - one backslash inside text

### Example: \n

```java
System.out.println("Line1\nLine2");
```

Output:

```
Line1
Line2
```

The `\n` acts like pressing Enter.

### Example: \t

```java
System.out.println("Name\tAge");
System.out.println("Rahul\t20");
```

Output:

```
Name	Age
Rahul	20
```

### Example: printing a double quote

```java
System.out.println("He said \"Hi\"");
```

Output:

```
He said "Hi"
```

Without the backslash, the quote would break the text.

### Example: printing a backslash

```java
System.out.println("C:\\java\\code");
```

Output:

```
C:\java\code
```

## Printing an Empty Line

```java
System.out.println();
```

This prints one blank line.

## Common Mistakes

- Forgetting quotes around text: `System.out.println(Hello);` is wrong. It should be `System.out.println("Hello");`.
- Using single quotes for text: `System.out.println('Hello');` is wrong. Single quotes are only for single characters.
- Expecting `print` to create a new line. It does not.
- Adding `String + number` thinking it will always perform arithmetic.

## Important Points

- `println` moves to a new line, `print` does not.
- Numbers inside `println` do not need quotes.
- Text must be inside double quotes.
- Escape sequences always start with `\`.

## Common Interview Questions

Q. What is the difference between print and println?

A. print prints without a new line; println prints and then moves the cursor to the next line.

Q. What is the output of System.out.println("Total = " + 5 + 3)?

A. `Total = 53`. Text joins the numbers as a string. To add them, use brackets: `"Total = " + (5 + 3)`.

Q. How do you print a double quote inside a string?

A. Use the escape sequence `\"`.

Next: Variables and identifiers - how to store data.