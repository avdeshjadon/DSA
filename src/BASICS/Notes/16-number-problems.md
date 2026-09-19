# Number Problems

This file solves the classic number problems using loops. Every solution follows the same pattern: take digits from the number one by one and process them.

## The Digit Extraction Trick

All these problems use one idea:

- `n % 10` gives the last digit.
- `n / 10` removes the last digit.

Example with n = 1234:

```
1234 % 10 = 4
1234 / 10 = 123
```

Repeat until n becomes 0:

```
123 % 10 = 3
123 / 10 = 12

12 % 10 = 2
12 / 10 = 1

1 % 10 = 1
1 / 10 = 0   <- stop
```

## Problem 1: Count digits

Problem: count how many digits a number has. 1234 has 4 digits.

Logic: remove one digit each iteration, count the removals.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Digits: " + count);
    }
}
```

Dry run with n = 1234:

| iteration | n before | n = n / 10 | count |
| --- | --- | --- | --- |
| 1 | 1234 | 123 | 1 |
| 2 | 123 | 12 | 2 |
| 3 | 12 | 1 | 3 |
| 4 | 1 | 0 | 4 |
| 5 | 0 | stop | 4 |

Complexity: O(number of digits). Edge case: n = 0 gives count 0. If a single 0 should count as 1 digit, handle it separately before the loop.

## Problem 2: Sum of digits

Problem: add all the digits. 1234 gives 1 + 2 + 3 + 4 = 10.

Logic: take the last digit, add it to sum, remove it.

```java
int n = sc.nextInt();
int sum = 0;

while (n != 0) {
    int digit = n % 10;
    sum = sum + digit;
    n = n / 10;
}
System.out.println(sum);
```

Dry run with n = 1234:

| iteration | digit = n % 10 | sum | n = n / 10 |
| --- | --- | --- | --- |
| 1 | 4 | 4 | 123 |
| 2 | 3 | 7 | 12 |
| 3 | 2 | 9 | 1 |
| 4 | 1 | 10 | 0 |

Result: 10.

## Problem 3: Reverse a number

Problem: reverse the digits. 1234 becomes 4321.

Logic: build the new number by repeatedly: `reverse = reverse * 10 + digit`.

```java
int n = sc.nextInt();
int reverse = 0;

while (n != 0) {
    int digit = n % 10;
    reverse = reverse * 10 + digit;
    n = n / 10;
}
System.out.println(reverse);
```

Dry run with n = 1234:

| iteration | digit | reverse = reverse*10 + digit | n |
| --- | --- | --- | --- |
| 1 | 4 | 0*10 + 4 = 4 | 123 |
| 2 | 3 | 4*10 + 3 = 43 | 12 |
| 3 | 2 | 43*10 + 2 = 432 | 1 |
| 4 | 1 | 432*10 + 1 = 4321 | 0 |

Result: 4321.

Note: this method fails with leading zeros in input like 1000 (reverse becomes 1) because a number cannot store leading zeros. Use a String approach if leading zeros matter.

## Problem 4: Sum of a series

Problem: sum the terms from 1 to n, like 1 + 2 + 3 + ... + n.

```java
int n = sc.nextInt();
int sum = 0;

for (int i = 1; i <= n; i++) {
    sum = sum + i;
}
System.out.println(sum);
```

Dry run with n = 5:

| i | sum before | sum after |
| --- | --- | --- |
| 1 | 0 | 1 |
| 2 | 1 | 3 |
| 3 | 3 | 6 |
| 4 | 6 | 10 |
| 5 | 10 | 15 |

Result: 15.

Fast formula: sum = n * (n + 1) / 2. With n = 5, that is 5 * 6 / 2 = 15. The loop is used to teach iteration; the formula is the efficient answer.

## Problem 5: Sum of squares of digits (series variation)

Problem: find 1^2 + 2^2 + ... + n^2.

```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum = sum + i * i;
}
System.out.println(sum);
```

For n = 3: sum = 1 + 4 + 9 = 14.

## Problem 6: First n factorials

Problem: print 1!, 2!, 3!, ..., n!

A factorial multiplies a number by every smaller positive number. 5! = 5 * 4 * 3 * 2 * 1 = 120.

Logic: keep a running product. Multiply it by i each time and print.

```java
int n = sc.nextInt();
int factorial = 1;

for (int i = 1; i <= n; i++) {
    factorial = factorial * i;
    System.out.println(i + "! = " + factorial);
}
```

Dry run with n = 4:

| i | factorial before | factorial after | printed |
| --- | --- | --- | --- |
| 1 | 1 | 1 | 1! = 1 |
| 2 | 1 | 2 | 2! = 2 |
| 3 | 2 | 6 | 3! = 6 |
| 4 | 6 | 24 | 4! = 24 |

Single factorial code (without printing each one):

```java
int factorial = 1;
for (int i = 1; i <= n; i++) {
    factorial = factorial * i;
}
System.out.println(factorial);
```

## Problem 7: a raised to power b

Problem: compute a^b. Java has no power operator like caret; the loop builds it.

Logic: multiply a with itself b times.

```java
int a = sc.nextInt();
int b = sc.nextInt();
int result = 1;

for (int i = 1; i <= b; i++) {
    result = result * a;
}
System.out.println(result);
```

Dry run with a = 2, b = 5:

| i | result before | result after |
| --- | --- | --- |
| 1 | 1 | 2 |
| 2 | 2 | 4 |
| 3 | 4 | 8 |
| 4 | 8 | 16 |
| 5 | 16 | 32 |

Result: 32.

Edge cases:

- b = 0: the loop never runs, result stays 1. Correct, any number to power 0 is 1.
- a = 0, b > 0: result stays 0. Correct.
- Very large results overflow the int type.

There is also a built-in method `Math.pow(a, b)`, but it returns a double. The loop version is what every beginner should be able to explain.

## Complexity of These Solutions

- A loop that runs once per digit or once per iteration has time complexity O(n), where n is the input size. This is the same notation used in DSA. It is explained fully in the DSA Transition file.

## Practice (solve yourself)

1. Count the number of times a specific digit appears in a number.
2. Check if a number is a palindrome (same forward and backward). Hint: compare n with its reverse.
3. Print the product of digits of a number.
4. Print n odd numbers using a loop.
5. Find the sum of the digits of the reverse of a number.

## Key Takeaways

- `n % 10` gives the last digit.
- `n / 10` removes the last digit.
- Repeating these two operations processes every digit.
- Reverse uses `reverse = reverse * 10 + digit`.
- Factorial uses a running product.

Next: Nested loops and patterns.