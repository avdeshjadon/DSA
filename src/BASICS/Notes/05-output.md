# Java Output

## What is Output?

Output is the text that the program shows on the screen.

In Java, we print output using `System.out`.

## System.out.println( )

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

## System.out.print( )

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

| print( )                                   | println( )                             |
|--------------------------------------------|----------------------------------------|
| Prints text and stays on the same line     | Prints text and moves to the next line |
| The next print starts right after the text | The next print starts on a fresh line  |

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

## Escape Sequences

An escape sequence is a special symbol that starts with backslash `\` and has a special meaning.

The two most used are:

- `\n` - new line (cursor moves to next line)
- `\t` - tab (adds a small gap)
- `\"` - double quote inside text
- `\\` - one backslash inside text

### Example: \ n

```java
System.out.println("Line1\nLine2");
```

Output:

```
Line1
Line2
```


### Example: \ t

```java
System.out.println("Name\tAge");
System.out.println("Rahul\t20");
```

Output:

```
Name	Age
Rahul	20
```

### Example: printing a double quote ( \ " )

```java
System.out.println("He said \"Hi\"");
```

Output:

```
He said "Hi"
```

Without the backslash, the quote would break the text.

### Example: printing a backslash ( \\\\ )

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

- **Forgetting double quotes around text:** Writing `System.out.println(Hello);` is incorrect because Java treats `Hello` as a variable name. Always use double quotes for text: `System.out.println("Hello");`.

- **Using single quotes for strings:** Writing `System.out.println('Hello');` is incorrect because single quotes (`' '`) are used for a single character (`char`), not a String. Use double quotes (`" "`) for text.

- **Confusing `print()` and `println()`:** `System.out.print()` displays output without moving to the next line, whereas `System.out.println()` automatically moves the cursor to a new line after printing.

- **Confusing string concatenation with arithmetic:** When you use `+` with a String and a number, Java may perform string concatenation instead of addition. For example, `System.out.println("Age: " + 20);` prints `Age: 20`, not a mathematical calculation.

- **Forgetting semicolons:** Every Java statement generally ends with a semicolon (`;`). For example, `System.out.println("Hello")` is incorrect because it is missing a semicolon.

- **Case sensitivity mistakes:** Java is case-sensitive. For example, `System` and `system` are different, and `println` and `Println` are not the same.

- **Mismatched parentheses and quotation marks:** Always close parentheses, double quotes, and other delimiters correctly. For example, `System.out.println("Hello);` is incorrect because the closing double quote is missing.

> **Remember:** Pay attention to quotation marks, semicolons, capitalization, and parentheses while writing Java code. Most beginner-level syntax errors happen because of these small mistakes.
## Important Points

- **`println()` vs `print()`:** `println()` prints the output and moves the cursor to the next line, whereas `print()` displays the output on the same line.

- **Numbers Without Quotes:** Numeric values can be printed directly without double quotes. For example, `System.out.println(100);`.

- **Text Inside Double Quotes:** Text (String values) must always be enclosed in double quotes (`" "`). For example, `System.out.println("Hello");`.

- **Escape Sequences:** Escape sequences always start with a backslash (`\`) and are used to represent special characters such as new lines (`\n`), tabs (`\t`), and quotation marks (`\"`).

> **Remember:** Use double quotes for text, no quotes for numbers, `println()` for a new line, and `\` for escape sequences.

>The next file is [Java Variables & Identifiers](06-variables-identifiers.md)