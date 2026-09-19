# Operators

## What is an Operator?

An operator is a symbol that performs an operation on values.

Simple definition: operators let us calculate, compare, and combine values.

```java
int sum = 5 + 3;   // + is an operator, 5 and 3 are operands
```

Here `+` is the operator, and `5` and `3` are the operands.

## Types of Operators

1. Arithmetic operators
2. Relational (comparison) operators
3. Logical operators
4. Assignment operators
5. Unary operators
6. Increment and decrement operators

## 1. Arithmetic Operators

These do basic math.

| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| + | addition | 5 + 3 | 8 |
| - | subtraction | 5 - 3 | 2 |
| * | multiplication | 5 * 3 | 15 |
| / | division | 5 / 3 | 1 |
| % | modulus (remainder) | 5 % 3 | 2 |

```java
System.out.println(5 + 2);   // 7
System.out.println(5 - 2);   // 3
System.out.println(5 * 2);   // 10
System.out.println(5 / 2);   // 2
System.out.println(5 % 2);   // 1
```

Important: integer division drops the decimal part. `5 / 2` is `2`, not `2.5`. To get `2.5`, at least one value must be decimal.

```java
System.out.println(5.0 / 2);   // 2.5
System.out.println(5 / 2.0);   // 2.5
```

The remainder `%` is very useful in problems. Examples: checking odd/even (`n % 2`), last digit (`n % 10`).

## 2. Relational Operators

These compare two values and give true or false.

| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| > | greater than | 5 > 3 | true |
| < | less than | 5 < 3 | false |
| >= | greater than or equal to | 5 >= 5 | true |
| <= | less than or equal to | 4 <= 3 | false |
| == | equal to | 5 == 5 | true |
| != | not equal to | 5 != 3 | true |

Relational operators always produce a boolean result: true or false.

```java
int age = 18;
System.out.println(age >= 18);   // true
System.out.println(age == 20);   // false
```

## 3. Logical Operators

These combine boolean values.

| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| && | AND - true only when both are true | true && true | true |
| \|\| | OR - true when at least one is true | true \|\| false | true |
| ! | NOT - flips the value | !true | false |

AND truth table:

| A | B | A && B |
| --- | --- | --- |
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

OR truth table:

| A | B | A \|\| B |
| --- | --- | --- |
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

NOT table:

| A | !A |
| --- | --- |
| true | false |
| false | true |

Examples:

```java
int age = 20;
int marks = 85;

System.out.println(age > 18 && marks > 80);   // true - both true
System.out.println(age > 25 || marks > 80);   // true - marks part true
System.out.println(!(age > 18));              // false
```

Logical operators are used heavily in conditional problems.

## 4. Assignment Operators

The `=` operator stores a value in a variable.

```java
int x = 10;
```

Compound assignment operators combine arithmetic with assignment.

| Operator | Meaning | Equivalent to |
| --- | --- | --- |
| += | add and store | x = x + 5 |
| -= | subtract and store | x = x - 5 |
| *= | multiply and store | x = x * 5 |
| /= | divide and store | x = x / 5 |
| %= | remainder and store | x = x % 5 |

```java
int x = 10;
x += 5;      // x becomes 15
x -= 3;      // x becomes 12
x *= 2;      // x becomes 24
System.out.println(x);   // 24
```

## 5. Unary Operators

A unary operator works on one operand.

| Operator | Meaning | Example |
| --- | --- | --- |
| + | positive value | +5 |
| - | negative value | -5 |
| ++ | increment by 1 | x++ or ++x |
| -- | decrement by 1 | x-- or --x |
| ! | logical NOT | !flag |

## 6. Increment and Decrement

`++` adds 1, `--` subtracts 1.

```java
int count = 5;
count++;      // count becomes 6
count--;      // count becomes 5
```

Both `count++` and `++count` increase the value by 1. The difference appears when the result is used in the same statement.

Post-increment `x++`: use the old value first, then increase.

Pre-increment `++x`: increase first, then use the new value.

```java
int x = 5;
int result = x++;   // result = 5, x becomes 6

int y = 5;
int result2 = ++y;  // y becomes 6, result2 = 6
```

This is a common interview question. Understand it well:

```java
int a = 10;
int b = a++;      // b gets 10, a becomes 11
int c = ++a;      // a becomes 12, c gets 12
System.out.println(a + " " + b + " " + c);   // 12 10 12
```

## = vs == (Very Important)

- `=` is assignment. It stores a value.
- `==` is comparison. It checks if two values are equal.

```java
int x = 5;         // assignment: x is now 5
if (x == 5) {      // comparison: is x equal to 5? true
    System.out.println("Equal");
}
```

Common mistake: writing `if (x = 5)` inside a condition. This assigns 5 to x instead of comparing. In Java inside `if`, this causes a compile error because the condition must be boolean.

## Operator Precedence

Precedence decides which operator is calculated first when many appear together, like in math where multiplication runs before addition.

```java
System.out.println(2 + 3 * 4);   // 14, because 3*4 runs first
```

Priority order from high to low (simplified, only the operators we learned):

1. `++`, `--`, unary `-`, `!`
2. `*`, `/`, `%`
3. `+`, `-`
4. `<`, `<=`, `>`, `>=`
5. `==`, `!=`
6. `&&`
7. `||`
8. `=`, `+=` and other assignment operators

Rules to remember:

- Multiplication, division and remainder run before addition and subtraction.
- Comparisons run before logical operators.
- Assignment runs last.
- When unsure, use brackets. Bulk brackets make the intention clear and never hurt.

## Associativity

Associativity decides the order when operators have the same priority.

- Most operators go left to right. Example: `10 - 4 - 3` = `(10 - 4) - 3` = 3.
- Assignment operators go right to left. Example: `a = b = 5` assigns 5 to b first, then assigns b to a.

```java
int a, b;
a = b = 10;    // both become 10
```

## Practice with a Small Program

```java
public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        System.out.println(a + b);   // 19
        System.out.println(a / b);   // 3
        System.out.println(a % b);   // 3
        System.out.println(a > b);   // true
        System.out.println(a != b);  // true

        a += 5;                      // a becomes 20
        System.out.println(a);       // 20
    }
}
```

## Common Mistakes

- Using `=` instead of `==` in conditions.
- Expecting `5 / 2` to be `2.5`. Integer division gives 2.
- Writing the uppercase version `||` as a single pipe `|`.
- Forgetting that `%` gives the remainder, not the quotient.

## Important Points

- Relational and logical operators always give true or false.
- Integer division drops decimals.
- `%` gives the remainder and is very useful in number problems.
- `++` prefix and postfix differ only when used inside the same expression.
- Use brackets to make precedence clear.

## Common Interview Questions

Q. Difference between = and ==?

A. `=` assigns a value; `==` compares two values and returns true or false.

Q. What is 5/2 in Java?

A. 2, because both operands are integers. To get 2.5, use 5.0/2.

Q. Difference between x++ and ++x?

A. x++ returns the old value then increments. ++x increments first, then returns the new value.

Q. What is the result of 10 + 2 * 3?

A. 16, because `*` runs before `+`. Brackets would change it: (10 + 2) * 3 = 36.

Next: Number system - how numbers are stored as binary.