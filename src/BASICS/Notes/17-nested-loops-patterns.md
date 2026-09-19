# Nested Loops and Patterns

## What is a Nested Loop?

A nested loop is a loop inside another loop.

Simple definition: a loop sits inside the body of another loop.

```java
for (int i = 1; i <= 3; i++) {        // outer loop
    for (int j = 1; j <= 2; j++) {    // inner loop
        System.out.print("*");
    }
    System.out.println();
}
```

## Why Nested Loops Are Used

Patterns and tables have rows and columns. One loop handles the rows, another handles the columns inside each row.

## Outer Loop and Inner Loop

- Outer loop: controls the rows.
- Inner loop: controls the columns inside each row.

Rule: for every single round of the outer loop, the entire inner loop runs completely from start to finish.

```text
╔════════════════════════════════════╗
║       NESTED LOOPS EXECUTION       ║
╠════════════════════════════════════╣
║ ┌────────────────────────────────┐ ║
║ │       Outer loop round 1       │ ║
║ └────────────────────────────────┘ ║
║                 ▼                  ║
║ ┌────────────────────────────────┐ ║
║ │     Inner loop runs fully      │ ║
║ └────────────────────────────────┘ ║
║                 ▼                  ║
║ ┌────────────────────────────────┐ ║
║ │       Outer loop round 2       │ ║
║ └────────────────────────────────┘ ║
║                 ▼                  ║
║ ┌────────────────────────────────┐ ║
║ │     Inner loop runs fully      │ ║
║ └────────────────────────────────┘ ║
║                 ▼                  ║
║ ┌────────────────────────────────┐ ║
║ │ Continue until outer loop ends │ ║
║ └────────────────────────────────┘ ║
╚════════════════════════════════════╝
```

## Execution Flow

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```

Output:

```
1 2
1 2
1 2
```

Tracing:

| outer i | inner j runs | printed line |
| --- | --- | --- |
| 1 | 1, 2 | 1 2 |
| 2 | 1, 2 | 1 2 |
| 3 | 1, 2 | 1 2 |

For i = 1, the inner loop prints 1 then 2, then the outer loop moves to the new line. This repeats for i = 2 and i = 3.

Now the pattern problems. For each: show the expected output, then the code.

## Pattern 1: Rectangle (solid)

Expected output (rows = 3, columns = 5):

```
*****
*****
*****
```

Logic:

- Rows: 3.
- Columns: 5 stars per row.
- Outer loop runs rows times. Inner loop runs columns times, printing one star each.

```java
int rows = 3;
int cols = 5;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Dry run:

| row | stars printed | result line |
| --- | --- | --- |
| 1 | 5 | ***** |
| 2 | 5 | ***** |
| 3 | 5 | ***** |

## Pattern 2: Hollow rectangle

Expected output (3 rows, 5 columns):

```
*****
*   *
*****
```

Logic: print a star when it is the first or last row, or the first or last column. Otherwise print a space.

```java
int rows = 3;
int cols = 5;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        if (i == 1 || i == rows || j == 1 || j == cols) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
```

Dry run for row 2: positions 2,3,4 are not the borders, so they print spaces. Position 1 and 5 print stars.

## Pattern 3: Right-angled triangle

Expected output:

```
*
**
***
****
```

Logic:

- Row 1 has 1 star.
- Row 2 has 2 stars.
- Row n has n stars.
- Inner loop runs i times, where i is the current row number.

```java
int n = 4;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Dry run:

| row i | inner loop count | result line |
| --- | --- | --- |
| 1 | 1 | * |
| 2 | 2 | ** |
| 3 | 3 | *** |
| 4 | 4 | **** |

The important rule for triangles: the inner loop limit depends on `i`, not on `n`.

## Pattern 4: Inverted triangle

Expected output:

```
****
***
**
*
```

Logic:

- Row 1 has n stars.
- Row 2 has n-1 stars.
- Row n has 1 star.
- Inner loop runs `n - i + 1` times.

```java
int n = 4;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Dry run:

| row i | j limit = n - i + 1 | result line |
| --- | --- | --- |
| 1 | 4 | **** |
| 2 | 3 | *** |
| 3 | 2 | ** |
| 4 | 1 | * |

## Pattern 5: Pyramid

Expected output:

```
   *
  ***
 *****
*******
```

Logic:

- Space count decreases from top to bottom.
- Star count increases by 2 each row.
- Row i: `n - i` spaces, then `2*i - 1` stars.

```java
int n = 4;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Dry run for n = 4:

| row i | spaces (n - i) | stars (2*i - 1) | line |
| --- | --- | --- | --- |
| 1 | 3 | 1 |    * |
| 2 | 2 | 3 |   *** |
| 3 | 1 | 5 |  ***** |
| 4 | 0 | 7 | ******* |

## Pattern 6: Numerical rectangle

Expected output (3 rows, 4 columns):

```
1234
1234
1234
```

Logic: the inner loop prints `j`, and j goes from 1 to columns.

```java
int rows = 3;
int cols = 4;

for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

## Pattern 7: Number pattern (increasing across rows)

Expected output:

```
1
12
123
1234
```

Logic: same as the triangle, but print `j` instead of a star.

```java
int n = 4;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

## Pattern 8: Numerical triangle (row number repeated)

Expected output:

```
1
22
333
4444
```

Logic: print `i` (the row number) instead of `j`.

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
```

## Pattern 9: Numerical pyramid

Expected output:

```
    1
   232
  34543
 4567654
```

This pattern grows up to its middle value, then mirrors down. Simplify the beginner version first: numbers reverse at the middle.

A simpler beginner-friendly triangle version:

```
1
12
123
```

was already Pattern 7. For the mirrored pyramid:

Logic: row i prints numbers from i upward to the middle value, then downward. The middle value is `2*i - 1`.

```java
int n = 4;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    for (int j = i; j <= 2 * i - 1; j++) {
        System.out.print(j);
    }
    for (int j = 2 * i - 2; j >= i; j--) {
        System.out.print(j);
    }
    System.out.println();
}
```

Dry run for row 3:

| part | values printed |
| --- | --- |
| spaces (n - i = 1) | one space |
| j from 3 to 5 | 3 4 5 |
| j from 4 down to 3 | 4 3 |

Line: `34543`, which matches.

## Summary Table of Pattern Rules

| Pattern | Inner loop limit | Printed value |
| --- | --- | --- |
| Rectangle | cols (fixed) | * |
| Hollow rectangle | cols (fixed) | border star else space |
| Triangle | i | * |
| Inverted triangle | n - i + 1 | * |
| Pyramid | spaces n - i, stars 2*i - 1 | * |
| Numerical rectangle | cols | j |
| Number pattern | i | j |
| Numerical triangle | i | i |
| Numerical pyramid | 2*i - 1 used for middle | increasing then decreasing |

## The Two Golden Rules

1. The outer loop always controls rows. Change `i` there.
2. The inner loop controls what appears in a row. Its limit may depend on `i` to make triangles and pyramids.

## Common Mistakes

- Forgetting System.out.println() after the inner loop, so all stars join into one line.
- Using `n` as the inner loop limit for every pattern, producing rectangles instead of triangles.
- Confusing spaces with stars in the pyramid.
- Printing `System.out.println()` inside the inner loop, which breaks every row into a new output line.

## Common Interview Questions

Q. How many times does the inner loop run in total for a rectangle of r rows and c columns?

A. r * c times. This is O(r * c), which is O(n^2) when r = c = n.

Q. How do you change a rectangle pattern into a triangle?

A. Change the inner loop limit from the fixed column count to `i`, the current row number.

Q. What controls rows and what controls columns?

A. The outer loop controls rows; the inner loop controls columns (the content of each row).

Next: OOP introduction.