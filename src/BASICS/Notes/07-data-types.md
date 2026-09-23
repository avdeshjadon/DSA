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

1. Primitive data types
   These are the basic building blocks. They store a single value directly.

2. Reference types ( Non Primitive data )
   These types hold the address (location) of an object, not the object itself.

## Primitive Data Types

Java has exactly 8 primitive types.

| Data type | Size | Stores | Example |
| --- | --- | --- | --- |
| byte | 1 byte | small whole numbers | byte b = 100; |
| short | 2 bytes | slightly bigger whole numbers | short s = 20000; |
| int | 4 bytes | whole numbers | int n = 500; |
| long | 8 bytes | very big whole numbers | long l = 9000000000L; |
| float | 4 bytes | decimal numbers (single precision) | float f = 2.5f; |
| double | 8 bytes | decimal numbers (double precision) | double d = 2.5; |
| char | 2 bytes | a single character | char c = 'A'; |
| boolean | depends on JVM (true/false) | true or false | boolean flag = true; |

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

## Reference Types ( Non Primitive )

A reference type points to a location in memory where an object lives.

Examples: String, Arrays, and all Objects.

```java
String name = "Rahul";
```

Here `name` does not store the text directly. It stores the address of the object that holds "Rahul".

## String

String is a reference type that holds a sequence of characters (text).

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

| Point | Primitive | Reference |
| --- | --- | --- |
| Stores | the value directly | the address of the object |
| Written with | lowercase (int, double) | often starts with uppercase (String) |
| Default value | 0, 0.0, false, or empty char | null (means no object) |
| Example | int a = 5; | String s = "hi"; |

## Type Compatibility

A value of a smaller type can automatically fit into a bigger type. This is called implicit widening.

```java
int number = 10;
long bigNumber = number;   // allowed, int fits in long
```

But a big type cannot directly fit into a small type without a risk of losing data. Java needs an explicit cast, called narrowing.

```java
long bigNumber = 100;
int number = (int) bigNumber;   // explicit cast because of possible data loss
```

Do not force casts in normal beginner programs. Casting matters in DSA only in a few places.

## Common Mistakes

- Writing `char c = "A";` instead of single quotes.
- Writing `float f = 2.5;` without the f. Java says "incompatible types".
- Writing `long l = 500;` without L - this works for small values, but add L for clarity and safety.
- Using int for huge values that need long.

## Important Points

- Java has exactly 8 primitive types.
- String, arrays and objects are reference types.
- char uses single quotes, String uses double quotes.
- int and double are the default choices for numbers.

## Common Interview Questions

Q. How many primitive types does Java have?

A. Eight: byte, short, int, long, float, double, char, boolean.

Q. What is the size of int?

A. 4 bytes (32 bits).

Q. Difference between primitive and reference types?

A. Primitive stores the value directly in memory. Reference stores the address of the object.

Q. What is the default value of a reference type variable?

A. null.

Next: Input - reading values from the user with the Scanner class.