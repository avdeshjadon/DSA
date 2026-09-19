# Conditional Problems

This file is a solved-problem bank. Every problem uses `if-else` from the Conditionals file.

For each problem you get:

- Problem statement
- Approach and logic
- Java code
- Dry run or edge-case note
- Common mistake

Suggested habit: write the code yourself first, then compare with the solution.

## Problem 1: Check if a number is odd or even

Problem: given number n, print "Even" if it is divisible by 2, otherwise "Odd".

Approach: a number is even when `n % 2 == 0`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

Dry run with n = 7: 7 % 2 = 1, condition is false, so output "Odd".

Common mistake: writing `n / 2 == 0` instead of `n % 2 == 0`.

## Problem 2: Check if a number is divisible by 5

Problem: print "Divisible" if n % 5 == 0, else "Not divisible".

```java
if (n % 5 == 0) {
    System.out.println("Divisible by 5");
} else {
    System.out.println("Not divisible by 5");
}
```

Dry run with n = 25: 25 % 5 = 0, so yes.

## Problem 3: Leap year

Problem: a year is a leap year if it is divisible by 4. Exception: a century year (divisible by 100) is a leap year only if also divisible by 400.

Rules:
- 2000: divisible by 100 and 400, so leap year.
- 1900: divisible by 100 but not 400, so not a leap year.
- 2024: divisible by 4 and not a century, so leap year.

Logic: `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`.

```java
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println("Leap year");
} else {
    System.out.println("Not a leap year");
}
```

Common mistake: forgetting the century rule, so 1900 is wrongly called a leap year.

## Problem 4: Absolute value

Problem: print the absolute value of n. Absolute value means remove the negative sign.

Approach: if n is negative, multiply by -1.

```java
int abs = n;
if (n < 0) {
    abs = -n;
}
System.out.println(abs);
```

Dry run with n = -12: n < 0 is true, abs = 12. With n = 7: condition false, abs = 7.

## Problem 5: Profit or loss with CP and SP

Problem: given cost price (CP) and selling price (SP), print Profit, Loss, or No Profit No Loss.

Approach: if SP > CP, profit = SP - CP. If SP < CP, loss = CP - SP. Equal means no profit no loss.

```java
if (sp > cp) {
    System.out.println("Profit = " + (sp - cp));
} else if (sp < cp) {
    System.out.println("Loss = " + (cp - sp));
} else {
    System.out.println("No Profit No Loss");
}
```

## Problem 6: Area vs perimeter of a rectangle

Problem: given length and breadth, print "Area" if area is greater, "Perimeter" if perimeter is greater, else "Equal".

Approach: area = length * breadth. perimeter = 2 * (length + breadth).

```java
int area = length * breadth;
int perimeter = 2 * (length + breadth);

if (area > perimeter) {
    System.out.println("Area");
} else if (perimeter > area) {
    System.out.println("Perimeter");
} else {
    System.out.println("Equal");
}
```

## Problem 7: Square or rectangle

Problem: given length and breadth, print "Square" if equal, else "Rectangle".

```java
if (length == breadth) {
    System.out.println("Square");
} else {
    System.out.println("Rectangle");
}
```

## Problem 8: Is the number three-digit?

Problem: check if n lies between 100 and 999.

Approach: `n >= 100 && n <= 999`.

```java
if (n >= 100 && n <= 999) {
    System.out.println("Three-digit number");
} else {
    System.out.println("Not three-digit");
}
```

Edge case: 100 is included, 999 is included, 1000 is not.

## Problem 9: Is the number two-digit?

Problem: check if n lies between 10 and 99.

```java
if (n >= 10 && n <= 99) {
    System.out.println("Two-digit number");
} else {
    System.out.println("Not two-digit");
}
```

## Problem 10: Divisible by 3 and 5

Problem: print "Yes" if n is divisible by both 3 and 5.

```java
if (n % 3 == 0 && n % 5 == 0) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

Dry run with n = 15: 15 % 3 = 0 and 15 % 5 = 0, both true, so Yes.

Alternative: a number divisible by 3 and 5 is divisible by 15.

## Problem 11: Divisible by 5 but not by 3

```java
if (n % 5 == 0 && n % 3 != 0) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

Dry run with n = 10: 10 % 5 = 0 (true), 10 % 3 = 1 (not 0, so true). Both pass.

Dry run with n = 15: divisible by both, so this prints No.

## Problem 12: Divisible by 3 or 5

Problem: print "Yes" if n is divisible by 3 OR by 5.

```java
if (n % 3 == 0 || n % 5 == 0) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

Dry run with n = 9: divisible by 3, so Yes even though not divisible by 5.

## Problem 13: Greatest of three numbers

Problem: given a, b, c, print the largest.

Approach: start by assuming a is greatest. Improve the answer with each comparison.

```java
int greatest = a;
if (b > greatest) {
    greatest = b;
}
if (c > greatest) {
    greatest = c;
}
System.out.println(greatest);
```

Dry run with a=15, b=27, c=9:

| Step | greatest before | comparison | greatest after |
| --- | --- | --- | --- |
| start | 15 | - | 15 |
| b > 15? | 15 | 27 > 15 true | 27 |
| c > 27? | 27 | 9 > 27 false | 27 |

Result: 27.

Alternative with else-if:

```java
if (a >= b && a >= c) {
    System.out.println(a);
} else if (b >= a && b >= c) {
    System.out.println(b);
} else {
    System.out.println(c);
}
```

## Problem 14: Least age of three people

Problem: print the smallest of three ages.

```java
int least = age1;
if (age2 < least) {
    least = age2;
}
if (age3 < least) {
    least = age3;
}
System.out.println(least);
```

## Problem 15: Can three numbers form a triangle

Problem: three sides form a triangle when the sum of any two sides is greater than the third side.

Conditions:
- a + b > c
- b + c > a
- a + c > b

All three must be true.

```java
if (a + b > c && b + c > a && a + c > b) {
    System.out.println("Valid triangle");
} else {
    System.out.println("Invalid triangle");
}
```

Dry run with sides 3, 4, 5:

| Condition | Calculation | Result |
| --- | --- | --- |
| a + b > c | 3 + 4 > 5 = 7 > 5 | true |
| b + c > a | 4 + 5 > 3 = 9 > 3 | true |
| a + c > b | 3 + 5 > 4 = 8 > 4 | true |

All true, so valid.

Common mistake: checking only one pair of sides.

## Problem 16: Divisible by 5 and 3 using nesting

Problem: same as Problem 10 but solved with nested if.

```java
if (n % 5 == 0) {
    if (n % 3 == 0) {
        System.out.println("Divisible by 5 and 3");
    } else {
        System.out.println("Divisible by 5 only");
    }
} else {
    System.out.println("Not divisible by 5");
}
```

Nesting first filters on 5, then on 3.

## Problem 17: Divisible by 5 and 3 but not by 15

Problem: check if n is divisible by both 5 and 3, but not divisible by 15.

Logic: numbers divisible by 3 and 5 are divisible by 15. This condition can never be true. But as an exercise in nested logic:

```java
if (n % 5 == 0) {
    if (n % 3 == 0) {
        if (n % 15 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("Divisible by 15 too");
        }
    }
}
```

Run it with n = 15: first two pass, inner condition `15 % 15 != 0` is false, so prints the else.

## Problem 18: Three or more conditions in one if

Combine multiple conditions freely with && and ||.

Example: valid triangle uses three conditions joined with &&.

Example: check a year that is leap OR a multiple of 7:

```java
if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) || year % 7 == 0) {
    System.out.println("Special year");
}
```

This is allowed. Just keep it readable.

## Problem 19: Greatest of three using nested if-else

```java
if (a >= b) {
    if (a >= c) {
        System.out.println(a);
    } else {
        System.out.println(c);
    }
} else {
    if (b >= c) {
        System.out.println(b);
    } else {
        System.out.println(c);
    }
}
```

Compare a with b first. The bigger one is then compared with c.

## Problem 20: Least age using nested if-else

```java
if (age1 <= age2) {
    if (age1 <= age3) {
        System.out.println(age1);
    } else {
        System.out.println(age3);
    }
} else {
    if (age2 <= age3) {
        System.out.println(age2);
    } else {
        System.out.println(age3);
    }
}
```

## Problem 21: Do three coordinates lie on a straight line

Problem: given three points (x1,y1), (x2,y2), (x3,y3), check if they are collinear (on the same line).

Approach: three points are collinear when the area formed by them is 0.

Area formula (multiplied by 2 to avoid fractions):

```
area2 = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)
```

If area == 0, the points are on a straight line.

```java
int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

if (area == 0) {
    System.out.println("Collinear");
} else {
    System.out.println("Not collinear");
}
```

Dry run with (1,1), (2,2), (3,3):

```
area = 1*(2-3) + 2*(3-1) + 3*(1-2)
     = 1*(-1) + 2*2 + 3*(-1)
     = -1 + 4 - 3
     = 0
```

Result collinear. Correct, because all three are on the line y = x.

## Problem 22: Where does the point lie - X-axis, Y-axis, origin, or elsewhere

Rules:
- On X-axis: y == 0.
- On Y-axis: x == 0.
- At origin: x == 0 and y == 0 (check first).
- Elsewhere: neither is 0.

```java
if (x == 0 && y == 0) {
    System.out.println("Origin");
} else if (y == 0) {
    System.out.println("X-axis");
} else if (x == 0) {
    System.out.println("Y-axis");
} else {
    System.out.println("Elsewhere");
}
```

The origin is checked first because it also satisfies y == 0.

## Problem 23: Point inside, on, or outside a circle

Problem: given circle center (cx, cy), radius r and a point (px, py), classify the point.

Approach: compute the squared distance from center to point:

```
distanceSq = (px - cx)^2 + (py - cy)^2
```

Compare with r^2 (we compare squares to avoid square root, which keeps numbers as ints):

- distanceSq < r^2: inside
- distanceSq == r^2: on the circumference
- distanceSq > r^2: outside

```java
int distanceSq = (px - cx) * (px - cx) + (py - cy) * (py - cy);
int radiusSq = r * r;

if (distanceSq < radiusSq) {
    System.out.println("Inside");
} else if (distanceSq == radiusSq) {
    System.out.println("On the circle");
} else {
    System.out.println("Outside");
}
```

Why compare squares: comparing distance directly needs a square root, which involves decimals. Comparing squared values gives the same result with integers only.

## Problem 24: Output prediction pattern

The most asked format of this topic in assignments and interviews. A full set is in the Output Questions file.

```java
int x = 5;
if (x > 3) {
    if (x < 10) {
        System.out.println("Small");
    }
} else {
    System.out.println("Big");
}
```

Output: Small, because x = 5 is greater than 3 and less than 10.

## Practice (solve yourself)

1. Print the day name with switch for input 1 to 7.
2. Given marks, print pass or fail.
3. Given a character, check if it is a vowel.
4. Given three sides, print the type of triangle: equilateral, isosceles, or scalene.
5. Given two numbers, print the smaller one without using else.

## Key Takeaways

- Most decision problems reduce to writing one correct boolean condition.
- Check edge values: 0, negative numbers, exact boundaries.
- Prefer single conditions with && and || when the logic is simple.
- Use nested if when the decisions happen in stages.
- Compare squared distances to avoid decimals.

Next: Loops.