# Data Types

## What is a Data Type?

A data type tells Java what kind of value a variable can store.

Simple definition: data type decides the type of data, its size, and the operations allowed on it.

If we write:

```java
int age = 20;
```

`int` tells Java: `age` will store a whole number. It cannot store "hello" or 2.5.

## Two Big Categories

1. **Primitive data types**
   - These are the basic building blocks. They store a single value directly.

2. **Non Primitive types (Reference Type data )**
   - These types hold the address (location) of an object, not the object itself.

## Primitive Data Types
## Java Primitive Data Types

Java has exactly 8 primitive data types. Each type has a fixed size and stores a specific range of values.

| Data Type | Size | Range | Stores | Example |
| --- | --- | --- | --- | --- |
| `byte` | 1 byte | -128 to 127 | Small whole numbers | `byte b = 100;` |
| `short` | 2 bytes | -32,768 to 32,767 | Small whole numbers | `short s = 20000;` |
| `int` | 4 bytes | -2,147,483,648 to 2,147,483,647 | Whole numbers | `int n = 500;` |
| `long` | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Very large whole numbers | `long l = 9000000000L;` |
| `float` | 4 bytes | Approximately ±1.4 × 10⁻⁴⁵ to ±3.4 × 10³⁸ | Decimal numbers (single precision) | `float f = 2.5f;` |
| `double` | 8 bytes | Approximately ±4.9 × 10⁻³²⁴ to ±1.8 × 10³⁰⁸ | Decimal numbers (double precision) | `double d = 2.5;` |
| `char` | 2 bytes | `\u0000` (0) to `\uFFFF` (65,535) | A single UTF-16 code unit | `char c = 'A';` |
| `boolean` | JVM-dependent | `true` or `false` | Boolean values | `boolean flag = true;` |



> The exact memory representation of `boolean` is JVM-dependent. Java does not specify a fixed storage size for it.
### Where each type is useful

- byte and short - saving memory when values are small.
- int - the default choice for whole numbers.
- long - for large values like population or big IDs. Add an L at the end: `long x = 123456789L;`.
- float - decimal with about 6-7 digits of accuracy. Add an f at the end: `float p = 1.5f;`.
- double - the default choice for decimal numbers with more accuracy.
- char - holds a single character inside single quotes.
- boolean - holds only true or false.

## char and single quotes

A char is one character inside single quotes.

```java
char grade = 'A';
char symbol = '#';
```

Wrong: `char c = "A";` because double quotes make a String.

## boolean

A boolean holds logical truth.

```java
boolean isEven = true;
boolean isNegative = false;
```

Only two possible values: true and false.

## Non Primitive ( Reference Types )

A Non Primitive type points to a location in memory where an object lives.

Examples: String, Arrays, and all Objects.

```java
String name = "Rahul";
```

Here `name` does not store the text directly. It stores the address of the object that holds "Rahul".

## String

String is a reference type that holds a sequence of characters.

```java
String message = "Hello Java";
```

String is not a primitive type, so we write it starting with an uppercase S. Strings are used very often, so Java gives them special easy handling, but they are still reference types.

## Arrays

An array is a list of values of the same type.

```java
int[] numbers = {10, 20, 30};
```

Here `numbers` is an array storing three ints. Arrays are explained more in DSA.

## Objects

Any real-world thing in code, like a student or a car, is an object. Objects are created from classes. This is covered in the OOP files.

## Primitive vs Reference

| Point | Primitive | Reference                            |
| --- | --- |--------------------------------------|
| Stores | the value directly | the address of the object            |
| Written with | lowercase (int, double) | often starts with uppercase (String) |
| Default value | 0, 0.0, false, or empty char | null (means no object)               |
| Example | int a = 5; | String s = " Avdesh Jadon ";         |
## Type Casting

Type casting is the process of converting a value from one data type to another.

In Java, type casting is mainly divided into two types:

### 1. Widening Casting (Implicit Casting)

Widening casting means converting a smaller data type into a larger data type.

Java automatically performs this conversion because the destination type can store a wider range of values without losing information.

No manual casting is required.

**Example:**

```java
int number = 10;
long bigNumber = number;

System.out.println(bigNumber);  // 10
```

Here:
- `number` is an `int` variable.
- `bigNumber` is a `long` variable.
- Java automatically converts the `int` value into `long`.
- No explicit cast is needed.

**Widening Order:**
```
╔══════════════════════════════════════════════════════════════════╗
║                    WIDENING CASTING ORDER                        ║
╠══════════════════════════════════════════════════════════════════╣
║                                                                  ║
║   byte ──→ short ──→ int ──→ long ──→ float ──→ double           ║
║                       ↑                                          ║
║                       │                                          ║
║                      char                                        ║
║                                                                  ║
╚══════════════════════════════════════════════════════════════════╝
```
### 2. Narrowing Casting (Explicit Casting)

Narrowing casting means converting a larger data type into a smaller data type.

Java does not perform this conversion automatically because the destination type may not be able to store the original value completely.

You must explicitly specify the target data type using parentheses. This is called explicit casting.

**Example:**

```java
long bigNumber = 100;
int number = (int) bigNumber;

System.out.println(number);  // 100
```

Here:
- `bigNumber` is a `long` variable.
- `number` is an `int` variable.
- `(int)` tells Java to convert the `long` value into `int`.
- If the value exceeds the `int` range, data may be lost.

**Example of Data Loss:**

```java
long bigNumber = 2147483648L;
int number = (int) bigNumber;

System.out.println(number);  // -2147483648
```

The original value cannot fit into the `int` range, so the result becomes different.

### Difference Between Widening and Narrowing

| Feature | Widening Casting | Narrowing Casting |
| --- | --- | --- |
| Conversion | Smaller type to larger type | Larger type to smaller type |
| Type of Casting | Implicit | Explicit |
| Automatic | Yes | No |
| Syntax | `long x = number;` | `int x = (int) number;` |
| Data Loss | Generally no data loss for integer-to-integer widening | Possible data loss |
| Example | `int` to `long` | `long` to `int` |


> **Remember:**
> - Widening = Small to Big (Automatic).
> - Narrowing = Big to Small (Manual).
> - Always be careful with narrowing because it can cause data loss.

> You do not need to force type casting in normal beginner programs. Understand the basic concept now; it becomes useful in calculations, DSA, and situations where different data types are used together.
## Common Mistakes

- **Using double quotes for char:** Writing `char c = "A";` is incorrect because `char` requires single quotes (`'A'`), not double quotes.

- **Forgetting the `f` suffix:** Writing `float f = 2.5;` causes a compilation error because decimal literals are `double` by default. Use `float f = 2.5f;`.

- **Using `int` for large values:** An `int` cannot store values outside its range (-2,147,483,648 to 2,147,483,647). Use `long` for larger whole numbers.

- **Confusing `float` and `double`:** Both store decimal values, but `double` provides greater precision. Remember that `float` requires the `f` suffix.

## Important Points

- **Primitive Data Types:** Java has exactly 8 primitive data types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

- **Reference Types:** `String`, arrays, and objects are reference types, not primitive types.

- **Default Numeric Types:** Whole number literals are treated as `int` by default, while decimal literals are treated as `double`.

- **Character vs Text:** `char` stores a single UTF-16 code unit using single quotes (`'A'`), whereas `String` stores text using double quotes (`"Hello"`).

- **Suffixes:** Use `L` for long literals and `f` for float literals. For example, `long x = 100000L;` and `float y = 2.5f;`.

>The next file is [Java Input Scanner-Class](08-input-scanner.md)