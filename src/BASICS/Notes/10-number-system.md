# Number System

## What is a Number System?

A number system is a way of writing numbers using a fixed set of symbols.

Simple definition: a number system tells us how many digits exist and how much each place is worth.

## Decimal Number System

Decimal is the number system we use every day.

- It has 10 digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
- The base is 10.
- Each position is a power of 10: units, tens, hundreds...

Example: the number 237.

```
2 hundreds + 3 tens + 7 units
= 2 * 100 + 3 * 10 + 7 * 1
= 200 + 30 + 7
= 237
```

We can also write this using powers of 10:

```
237 = 2*10^2 + 3*10^1 + 7*10^0
```

## Binary Number System

Binary is the number system computers use.

- It has 2 digits: 0 and 1.
- The base is 2.
- Each position is a power of 2: 1, 2, 4, 8, 16...

Every piece of data in a computer is finally stored as 0s and 1s.

## Binary Place Values

The place values of binary digits (called bits) from right to left are:

```
... 64  32  16  8  4  2  1
```

Each is a power of 2.

Example: binary 101 means:

```
1 * 4 + 0 * 2 + 1 * 1
= 4 + 0 + 1
= 5
```

So binary 101 equals decimal 5.

## Binary to Decimal

Method: multiply each bit by its place value and add everything.

| Binary | Calculation | Decimal result |
| --- | --- | --- |
| 0101 | 0*8 + 1*4 + 0*2 + 1*1 | 5 |
| 1010 | 1*8 + 0*4 + 1*2 + 0*1 | 10 |
| 1100 | 1*8 + 1*4 + 0*2 + 0*1 | 12 |
| 1111 | 1*8 + 1*4 + 1*2 + 1*1 | 15 |

Step by step for 1010:

```
1 * 8 = 8
0 * 4 = 0
1 * 2 = 2
0 * 1 = 0
total = 10
```

## Decimal to Binary

Method: divide the number by 2 again and again. Save the remainders. The remainders from bottom to top give the binary number.

Convert decimal 5 to binary:

```
Step 1: 5 / 2 = 2, remainder 1
Step 2: 2 / 2 = 1, remainder 0
Step 3: 1 / 2 = 0, remainder 1
```

Read remainders from bottom to top: 101.

So decimal 5 = binary 101.

Convert decimal 13 to binary:

```
13 / 2 = 6, remainder 1
6 / 2 = 3, remainder 0
3 / 2 = 1, remainder 1
1 / 2 = 0, remainder 1
```

Bottom to top: 1101.

So decimal 13 = binary 1101.

## Quick Conversion Table

| Decimal | Binary |
| --- | --- |
| 0 | 0000 |
| 1 | 0001 |
| 2 | 0010 |
| 3 | 0011 |
| 4 | 0100 |
| 5 | 0101 |
| 6 | 0110 |
| 7 | 0111 |
| 8 | 1000 |
| 9 | 1001 |

Extra for the greedy set:

| Decimal | Binary |
| --- | --- |
| 10 | 1010 |
| 15 | 1111 |

## Reading Binary the Easy Way

To read a binary number, remember the place values.

```
For 1101:
8 + 4 + 0 + 1 = 13
```

Check each position: the third bit (value 2) is 0, so it contributes nothing.

## Why This Matters for Bitwise Operators

Bitwise operators work directly on the bits (the 0s and 1s) of a number. To understand them, we need to think of numbers as binary. The next file uses everything from this file.

## Common Mistakes

- Reading binary left to right as individual digits instead of using place values.
- Forgetting that the first remainder is the last (rightmost) bit.
- Confusing base 10 and base 2 place values.

## Important Points

- Decimal has base 10 and digits 0-9.
- Binary has base 2 and digits 0 and 1.
- Binary place values are powers of 2: 1, 2, 4, 8...
- Decimal to binary: divide by 2, collect remainders, read bottom to top.
- Binary to decimal: multiply bits by place values, add them.

## Common Interview Questions

Q. Why does a computer understand only 0 and 1?

A. The hardware is made of circuits that have two states: on and off. On is treated as 1 and off as 0.

Q. What is the binary of 5 and how do you convert it?

A. 101. Divide 5 by 2 repeatedly and read the remainders from bottom to top.

Q. What is the decimal value of binary 1011?

A. 1*8 + 0*4 + 1*2 + 1*1 = 11.

Next: Bitwise operators - working directly with bits.