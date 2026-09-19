# Bitwise Operators

## What are Bitwise Operators?

Bitwise operators work on the bits (0s and 1s) of a number, one bit at a time.

Simple definition: bitwise operators perform logic on the binary representation of numbers.

They are rarely used in daily code, but they are very fast, and interviewers ask about them often.

This file uses the number system from the previous file. If you need the binary concept again, review the Number System file.

## Operators at a Glance

| Operator | Name | Example |
| --- | --- | --- |
| `&` | AND | 5 & 3 |
| `\|` | OR | 5 \| 3 |
| `^` | XOR | 5 ^ 3 |
| `~` | Complement | ~5 |
| `<<` | Left shift | 5 << 1 |
| `>>` | Right shift | 5 >> 1 |

## Bitwise AND (&)

Rule: result bit is 1 only when BOTH bits are 1.

| A | B | A & B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |

Example: 5 & 3

```
5 = 0101
3 = 0011
---------
& = 0001
```

Answer: 1

```java
System.out.println(5 & 3);   // 1
```

## Bitwise OR (|)

Rule: result bit is 1 when AT LEAST ONE bit is 1.

| A | B | A \| B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

Example: 5 | 3

```
5 = 0101
3 = 0011
---------
| = 0111
```

Answer: 7

```java
System.out.println(5 | 3);   // 7
```

## Bitwise XOR (^)

Rule: result bit is 1 when the bits are DIFFERENT.

| A | B | A ^ B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

Example: 5 ^ 3

```
5 = 0101
3 = 0011
---------
^ = 0110
```

Answer: 6

```java
System.out.println(5 ^ 3);   // 6
```

A useful property: XOR of a number with itself is 0. `5 ^ 5 = 0`. Interviewers use this to find numbers that appear only once in a list.

## Bitwise Complement (~)

Rule: every 1 becomes 0 and every 0 becomes 1.

The result depends on how Java stores negative numbers. Java uses two's complement. The simple rule to remember:

```
~x = -(x + 1)
```

So:

```java
System.out.println(~5);    // -6, because -(5 + 1)
System.out.println(~0);    // -1, because -(0 + 1)
```

Why -6 mechanically: 5 in 32 bits is 0000...0101. Flipping all bits gives 1111...1010, which is the two's complement representation of -6.

## Left Shift (<<)

Rule: shift all bits to the left. Empty positions on the right become 0.

```
5 << 1 = 10
5 << 2 = 20
```

Binary for 5:

```
0101 shift left by 1  = 1010  (decimal 10)
```

Effect: each left shift multiplies the number by 2.

```java
System.out.println(5 << 1);   // 10
System.out.println(5 << 2);   // 20
```

5 << 1 works like `5 * 2`. Left shift by n is like multiplying by 2^n.

## Right Shift (>>)

Rule: shift all bits to the right. For positive numbers, empty positions on the left become 0.

```
5 >> 1 = 2
```

Binary for 5:

```
0101 shift right by 1  = 0010  (decimal 2)
```

Effect: each right shift divides the number by 2, dropping the remainder.

```java
System.out.println(5 >> 1);   // 2, 5/2 = 2 in integer division
System.out.println(8 >> 1);   // 4
```

Right shift by n is like dividing by 2^n.

## Full Examples

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(5 & 3);     // 1
        System.out.println(5 | 3);     // 7
        System.out.println(5 ^ 3);     // 6
        System.out.println(~5);        // -6
        System.out.println(5 << 1);    // 10
        System.out.println(5 >> 1);    // 2
    }
}
```

## Visual Recap

```text
╔════════════════════════════════════════════════════════════════════════════════════════════════╗
║                                BITWISE OPERATORS - VISUAL RECAP                                ║
╠════════════════════════════════════════════════════════════════════════════════════════════════╣
║                                 ┌────────────────────────────┐                                 ║
║                                 │   Two numbers in binary    │                                 ║
║                                 └────────────────────────────┘                                 ║
║                                               ▼                                                ║
║ ┌────────────────────────────┐  ┌────────────────────────────┐  ┌────────────────────────────┐ ║
║ │    AND - both must be 1    │  │   OR - at least one is 1   │  │  XOR - bits are different  │ ║
║ └────────────────────────────┘  └────────────────────────────┘  └────────────────────────────┘ ║
║ ┌────────────────────────────┐  ┌────────────────────────────┐  ┌────────────────────────────┐ ║
║ │ Complement - flip all bits │  │ Left shift - multiply by 2 │  │ Right shift - divide by 2  │ ║
║ └────────────────────────────┘  └────────────────────────────┘  └────────────────────────────┘ ║
╚════════════════════════════════════════════════════════════════════════════════════════════════╝
```

## Practical Uses (Beginner Level)

- AND with 1 checks odd/even: `(n & 1) == 0` means even.
- OR can set a bit to 1.
- XOR can find the number appearing once when all others appear twice.
- Left and right shifts are faster ways to multiply and divide by 2.

Checks for odd or even:

```java
int n = 7;
System.out.println((n & 1) == 0);   // false, so n is odd
```

## Common Mistakes

- Confusing `&` (AND) with `&&` (logical AND). `&&` works on booleans, `&` works on bits.
- Expecting complement of 5 to be 2. It is -6 because of two's complement.
- Confusing `|` with `||`.
- Writing `<<` as `<` or `>>` as `>`.

## Important Points

- AND: both 1 means 1.
- OR: one 1 means 1.
- XOR: different bits give 1.
- Left shift multiplies by 2. Right shift divides by 2.
- `~x = -(x+1)`.

## Common Interview Questions

Q. What is 5 & 3?

A. 1. In binary, 0101 & 0011 = 0001.

Q. What is left shift doing?

A. It moves bits left and fills the right with zeros. It multiplies the number by 2 for every shift.

Q. Why is XOR of two same numbers zero?

A. Every pair of equal bits gives 0 in XOR.

Next: Conditional statements - making decisions in code.