# Methods

## What is a Method?

A method is a named block of code that performs one task.

Simple definition: a method bundles reusable code under a name so it can be called whenever needed.

```java
void sayHello() {
    System.out.println("Hello");
}
```

Calling the method runs that code:

```java
sayHello();
```

## Function vs Method

- Function: a reusable block of code, in procedural languages.
- Method: the same idea but written inside a class.

In Java, every reusable block of code lives inside a class, so Java uses the word "method".

Simple rule: in Java, we always say method.

## Why Methods Are Important

- Avoid repeating the same code.
- Make code readable by breaking it into small named pieces.
- Make code reusable across the program.
- Make bugs easier to find - each method is one job.

## How a Method is Used

```text
╔═════════════════════════════════════╗
║         HOW A METHOD IS USED        ║
╠═════════════════════════════════════╣
║ ┌────────────────────────────────┐  ║
║ │ Method declared - code defined │  ║
║ └────────────────────────────────┘  ║
║                  ▼                  ║
║ ┌────────────────────────────────┐  ║
║ │         Program starts         │  ║
║ └────────────────────────────────┘  ║
║                  ▼                  ║
║ ┌────────────────────────────────┐  ║
║ │       Method call found?       │  ║
║ └────────────────────────────────┘  ║
║                  ▼                  ║
║ ┌────────────────────────────────┐  ║
║ │Jump to the method, run its code│  ║
║ └────────────────────────────────┘  ║
║                  ▼                  ║
║ ┌─────────────────────────────────┐ ║
║ │Return to the caller and continue│ ║
║ └─────────────────────────────────┘ ║
╚═════════════════════════════════════╝
```

## Types of Methods

1. Standard library methods - already written by Java, ready to use.
2. User-defined methods - methods the programmer creates.

A standard library method:

```java
Math.max(5, 10);          // built into Java
Math.min(2, 7);
System.out.println("Hi"); // println is a library method
```

## Declaring a Method

A method declaration has these parts:

```java
returnType methodName(parameters) {
    // body
}
```

Parts:

| Part | Meaning |
| --- | --- |
| returnType | what the method gives back, or void for nothing |
| methodName | name used to call it |
| parameters | values the method needs (can be empty) |
| body | the statements to run |

## Method with No Parameter

```java
void greet() {
    System.out.println("Welcome!");
}
```

Call:

```java
greet();
```

## Method with Parameter

A parameter is a variable declared in the method, ready to receive a value.

```java
void greet(String name) {
    System.out.println("Welcome " + name);
}
```

Call:

```java
greet("Rahul");
```

The value `"Rahul"` is called an argument. Full details in the Scope and Parameters file.

## Method with Return Value

Use a return type (like int) and the `return` keyword to give back a value.

```java
int add(int a, int b) {
    return a + b;
}
```

Call and use the result:

```java
int result = add(3, 4);
System.out.println(result);   // 7
```

The calling code receives the value that `return` sends back.

## Method with Multiple Parameters

```java
int multiply(int a, int b, int c) {
    return a * b * c;
}
```

Call:

```java
int product = multiply(2, 3, 4);   // 24
```

## The void Return Type

`void` means the method returns nothing at all. It performs an action but gives no value back.

```java
void printStars(int count) {
    for (int i = 1; i <= count; i++) {
        System.out.print("*");
    }
    System.out.println();
}
```

This prints stars and returns nothing.

## return Keyword

Two jobs:

1. It stops the method immediately.
2. It sends a value back to the caller.

```java
boolean isEven(int number) {
    if (number % 2 == 0) {
        return true;
    }
    return false;
}
```

## Complete Example

```java
public class Main {

    static void printMessage() {
        System.out.println("Learning methods");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        printMessage();

        int sum = add(5, 6);
        System.out.println("Sum: " + sum);

        int sq = square(4);
        System.out.println("Square: " + sq);
    }
}
```

Output:

```
Learning methods
Sum: 11
Square: 16
```

Why `static` here: the main method is called without an object, so the helper methods are also static. If methods are not static and not object-based, they need an object to be called. The details of static are at the end of this file.

## Method Declaration vs Definition vs Call

- Declaration: the method signature that lays out the name and parameters. In Java declaration and definition happen together, but interviews still use the words:
  - Declaration - the signature line.
  - Definition - the whole method including the body.
  - Call - using the method somewhere, like `add(3, 4)`.

## Standard Library Methods

Java ships with many ready methods. A few used commonly:

| Method | What it does |
| --- | --- |
| Math.max(a, b) | returns the bigger of a and b |
| Math.min(a, b) | returns the smaller of a and b |
| Math.sqrt(x) | returns the square root as a double |
| Math.abs(x) | returns the absolute value |
| Math.pow(a, b) | returns a to the power b |
| System.out.println(x) | prints a line |

These come from Java libraries, so we do not write them ourselves.

## static - First Look

A static method belongs to the class, not to any object.

- Called as: `Math.max(5, 10)` - no object needed.
- Non-static methods must be called through an object.

```java
public class Main {
    static void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        hello();   // works, static method on the class
    }
}
```

Full treatment of static appears in the Access Modifiers and Scope files.

## Common Mistakes

- Forgetting the return type, or writing void when returning a value.
- Forgetting `return` in a method that must return a value.
- Using different names between declaration and definition (in Java they are one block, so this is rare).
- Calling a non-static method without an object.

## Important Points

- A method is declared, defined, and called.
- Parameters are the inputs in the declaration.
- `return` sends back the result and ends the method.
- void methods return nothing.
- Library methods are pre-written by Java.

## Common Interview Questions

Q. What is a method?

A. A named block of reusable code inside a class.

Q. What is the difference between a function and a method?

A. A function is a standalone block of code. A method is a function written inside a class. In Java, all functions are methods.

Q. What is void?

A. A return type meaning the method gives back no value.

Q. What is the purpose of return?

A. To send a value back to the caller and stop the method.

Next: Constructors - special methods that run when an object is created.