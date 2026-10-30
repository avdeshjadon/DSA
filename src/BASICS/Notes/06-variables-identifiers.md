# Variables and Identifiers

## What is a Variable?

A variable is a named box in the computer's memory that stores a value.

#### Simple definition: a variable is a name we give to a value so we can use it again later.

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

- `int` is the type ( a whole number ).
- `age` is the name ( variable name ).
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
System.out.println(age);      // prints 20
System.out.println(age + 5);  // prints 25
```

## More Examples

```java
int number = 10;
number = number + 5;          // new value = old value + 5
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

#### Complete List of Java Keywords

| Keyword | Keyword | Keyword | Keyword |
| --- | --- | --- | --- |
| `abstract` | `assert` | `boolean` | `break` |
| `byte` | `case` | `catch` | `char` |
| `class` | `const` | `continue` | `default` |
| `do` | `double` | `else` | `enum` |
| `extends` | `final` | `finally` | `float` |
| `for` | `goto` | `if` | `implements` |
| `import` | `instanceof` | `int` | `interface` |
| `long` | `native` | `new` | `package` |
| `private` | `protected` | `public` | `return` |
| `short` | `static` | `strictfp` | `super` |
| `switch` | `synchronized` | `this` | `throw` |
| `throws` | `transient` | `try` | `void` |
| `volatile` | `while` | `_` | |

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

A convention is a habit or standard that programmers agree to follow. Java does not force all naming conventions, but following them makes code easier to read, understand, and maintain.

| Thing | Convention | Example |
| --- | --- | --- |
| Variable | Starts with a lowercase letter. Multiple words use camelCase. | `studentName`, `totalMarks` |
| Class | Starts with an uppercase letter. Each word starts with an uppercase letter (PascalCase). | `StudentRecord`, `BankAccount`, `EmployeeDetails` |
| Method | Starts with a lowercase letter. Multiple words use camelCase. | `calculateMarks`, `getStudentName` |
| Constants | All uppercase letters with underscores between words. | `MAX_LIMIT`, `MIN_VALUE`, `PI_VALUE` |

**camelCase Examples:** `studentName`, `totalMarks`, `isEven`, `calculateSalary`.

**PascalCase Examples:** `StudentRecord`, `BankAccount`, `EmployeeDetails`, `StudentManagementSystem`.
## Common Mistakes

- **Declaring a variable more than once:** Java does not allow you to declare two local variables with the same name in the same scope.

- **Using an uninitialized local variable:** Local variables must be assigned a value before they are used. Otherwise, Java reports an error: `variable might not have been initialized`.

- **Using reserved keywords as variable names:** Keywords such as `int`, `class`, and `public` cannot be used as variable names.

- **Using invalid characters in variable names:** Variable names cannot contain spaces or unsupported special characters. For example, `student name` and `total-marks` are invalid.

## Important Points

- **Declaration Before Use:** A variable must be declared before it can be used in the program.

- **Data Type:** Every variable must have a data type, such as `int`, `double`, `char`, or `String`, when it is declared.

- **Assignment Operator (`=`):** The `=` symbol is used to assign a value to a variable. It is different from `==`, which is used to compare two values (explained in the Conditionals file).

- **Case Sensitivity:** Java is case-sensitive, so `age`, `Age`, and `AGE` are treated as three different variable names.

- **Initialization:** Initializing a variable means assigning its first value. For example, `int age = 20;` declares and initializes the variable in one statement.rent kinds of values.

>The next file is [Java Data-types](07-data-types.md)