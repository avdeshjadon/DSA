# Java Basic Syntax

## Java Program Structure

A simple Java program looks like this:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Every Java program is built inside a class. Code that runs is written inside the main method.

```text
╔══════════════════════════════════════════╗
║          JAVA PROGRAM STRUCTURE          ║
╠══════════════════════════════════════════╣
║ ┌──────────────────────────────────────┐ ║
║ │          public class Main           │ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │public static void main(String[] args)│ ║
║ └──────────────────────────────────────┘ ║
║                    ▼                     ║
║ ┌──────────────────────────────────────┐ ║
║ │ Inside the method - your statements  │ ║
║ └──────────────────────────────────────┘ ║
╚══════════════════════════════════════════╝
```

The structure has three big parts:

1. The class declaration.
2. The main method declaration.
3. The statements inside the main method.

## Class

A class is a container for code and data in Java.

Simple definition: a class is a blueprint that groups related data and behavior together.

In the example, `Main` is the class name. The rule for the class name is that it should match the filename. If the file is `Main.java`, the class must be `Main`.

## main Method

The main method is the starting point of every Java program. The JVM looks for a method with this exact name and starts execution there.

Without the main method, a normal Java program cannot run.

## Explaining Every Word of public static void main(String[] args)

The signature is:

```java
public static void main(String[] args)
```

Many beginners memorize it. Real understanding comes from knowing each word.

| Word | Meaning |
| --- | --- |
| public | This method can be accessed from anywhere, including from outside the class. The JVM needs to call it, so it must be public. |
| static | This method belongs to the class itself, not to an object. The JVM calls main before any object is created, so it must be static. |
| void | This method does not return any value. Nothing comes back from main. |
| main | The name of the method. The JVM looks for this exact name to start the program. |
| (String[] args) | The method takes one parameter, which is an array of Strings. This is used to pass command-line arguments to the program. |

## Parameters and Arguments (First Look)

The `String[] args` inside the brackets is the parameter. It holds a list of text values that the user can pass when starting the program from the command line.

Example: if the user runs this command:

```bash
java Main Alice Bob
```

then inside the program, `args[0]` is `"Alice"` and `args[1]` is `"Bob"`.

Full meaning of parameters and arguments is explained in the Scope and Parameters file.

## What Each Word Is Made Of

- String - a data type that holds text.
- [] - means an array, which is a list of items.
- args - short for arguments, the name of the list.
- String[] args - a list of text arguments passed to the program.

## Why Do These Letters Appear Together?

The main method must have this exact form so the JVM can find it automatically. If only one word is changed (for example `main` becomes `Main`), the JVM will not find it and the program will not run.

## System.out.println()

Inside the main method, the program usually prints something.

```java
System.out.println("Hello World");
```

| Part | Meaning |
| --- | --- |
| System | A built-in Java class that gives access to the system. |
| out | A special object inside System that represents the output screen. |
| println | A method that prints a line of text and moves to the next line. |

Full detail about output is in the Output file.

## Example: Complete Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java");
    }
}
```

Output:

```
Hello World
I am learning Java
```

## Common Mistakes

- Writing `Main` instead of `main`. The method name must be lowercase `main`.
- Forgetting the `static` keyword. The JVM cannot call a non-static main without an object.
- Forgetting the parentheses. `main` must be written as `main(...)`.
- Class name not matching the filename. The error says something like "class Main is public, should be declared in a file named Main.java".
- Using single quotes for text. Text must be inside double quotes.

## Important Points

- The filename and the public class name must match.
- Statements inside a method end with a semicolon `;`.
- Code blocks open and close with curly braces `{}`.
- Java is case sensitive. `main` and `Main` are different things.

## Common Interview Questions

Q. Why is main public static void?

A. public - so the JVM can call it. static - so it can be called without creating an object. void - so it returns nothing.

Q. What is String[] args?

A. It is an array of Strings that holds command-line arguments passed to the program.

Q. Can a Java program run without main?

A. A normal program cannot. In some advanced cases small blocks of code can run, but the main method is required for a normal standalone program.

Next: Output - how to print text with Java.