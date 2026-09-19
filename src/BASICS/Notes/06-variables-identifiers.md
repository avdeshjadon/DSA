# Variables and Identifiers

## What is a Variable?

A variable is a named box in the computer's memory that stores a value.

Simple definition: a variable is a name we give to a value so we can use it again later.

```text
╔════════════════════════════╗
║  VARIABLE = NAME + VALUE   ║
╠════════════════════════════╣
║ ┌────────────────────────┐ ║
║ │   Variable name: age   │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │    Value stored: 20    │ ║
║ └────────────────────────┘ ║
╚════════════════════════════╝
```

In real life, a variable is like a labeled container. You put something inside, you can look at it, and you can replace it.

## Why Variables Are Needed

- To remember values for later use.
- To avoid repeating the same number many times.
- To make code easier to read and change.
- To process changing data, like user input.

Without variables, a program could not remember anything.

## Declaration

Declaration means telling Java the name and type of a variable. It creates the box but does not put a value inside it.

```java
int age;
```

Here:

- `int` is the type (a whole number).
- `age` is the name.
- `;` ends the statement.

## Initialization

Initialization means putting a value into the variable for the first time.

```java
int age = 20;
```

The `=` symbol assigns the value on the right into the variable on the left. This is assignment.

## Assignment and Reassignment

Assignment is giving a value to a variable any time.

Reassignment means changing the value after it was already given a value.

```java
int age = 20;   // declaration + initialization
age = 25;       // reassignment - new value, old value is gone
```

Important: reassignment does NOT need the type again. The type is written only once at declaration.

```java
int age = 20;
int age = 25;   // WRONG - declaring the same variable twice
age = 25;       // CORRECT - simple reassignment
```

## Reading a Variable

A variable is used by writing its name.

```java
int age = 20;
System.out.println(age);   // prints 20
System.out.println(age + 5);  // prints 25
```

## More Examples

```java
int number = 10;
number = number + 5;   // new value = old value + 5
System.out.println(number);   // prints 15
```

On the right side, Java first reads the old value (10), adds 5, and then stores the result back into `number`.

## Variable Naming Rules (Identifiers)

An identifier is any name we give to a thing in a program: a variable, a class, or a method.

Rules for identifiers in Java:

1. Must start with a letter, underscore `_`, or dollar sign `$`.
2. After the first character, digits are allowed.
3. Cannot start with a digit.
4. Cannot contain spaces.
5. Cannot contain special symbols like `-`, `.`, `*`, etc. (underscore and dollar sign are allowed).
6. Cannot be a keyword (reserved words like `int`, `class`, `public`).

Valid names:

```
age
studentName
total_marks
_private
$value
number1
```

Invalid names and reasons:

| Name | Why it is invalid |
| --- | --- |
| 1number | Starts with a digit |
| student name | Contains a space |
| student-name | Contains a symbol `-` |
| int | It is a keyword |

## Naming Conventions

A convention is a habit that all programmers agree to follow. Java does not force all of them, but it is best practice.

| Thing | Convention | Example |
| --- | --- | --- |
| Variable | Starts with a lowercase letter. Multiple words written like this: camelCase | studentName |
| Class | Starts with an uppercase letter. Multiple words start each with uppercase: PascalCase | StudentRecord |
| Method | Starts with a lowercase letter, camelCase | calculateMarks |
| Constants | All uppercase with underscores | MAX_LIMIT |

camelCase example: `studentName`, `totalMarks`, `isEven`.

## Common Mistakes

- Declaring a variable twice with the same name.
- Forgetting to initialize a local variable before using it. Java gives an error: variable might not have been initialized.
- Using a keyword as a variable name.
- Using spaces or special symbols in names.

## Important Points

- A variable must be declared before it is used.
- Type is written once at declaration.
- The `=` symbol assigns a value. Compare it with `==` (equals to) explained in the conditionals file.
- Variable names are case sensitive. `age` and `Age` are different variables.

## Common Interview Questions

Q. What is the difference between declaration, initialization and assignment?

A. Declaration creates the variable with a type. Initialization gives it the first value. Assignment gives or changes a value any time.

Q. Can we declare two variables with the same name in one method?

A. No. Java does not allow two variables with the same name in the same scope.

Q. What are valid ways to start an identifier in Java?

A. A letter, an underscore `_`, or a dollar sign `$`. Not a digit.

Next: Data types - the different kinds of values.