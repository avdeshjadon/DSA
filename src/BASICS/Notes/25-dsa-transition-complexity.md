# DSA Transition and Time Complexity

## What is DSA?

DSA stands for Data Structures and Algorithms.

- Data structure: a way to store and organize data. Examples: array, linked list, stack, queue, tree.
- Algorithm: a step-by-step method to process data. Examples: searching, sorting.

If a program is a recipe, data structures are the containers holding the ingredients and algorithms are the cooking steps.

## Why Transition into DSA?

Java fundamentals taught you the language. DSA teaches you to solve problems efficiently.

- Real interviews ask DSA questions, not just "what is a class".
- Distinguishes a beginner from a professional.
- Builds the logic needed for any kind of programming.
- Makes your code fast enough for real-world data sizes.

## What You Already Know From This Course

These basics are the foundation DSA builds on:

- Loops and conditions - the machinery of every algorithm.
- Pattern and number problems - the DSA warm-up exercises.
- Complexity basics (coming next) - how we compare solutions.
- OOP and classes - how real data structures are modeled.

```text
╔════════════════════════════╗
║        ROAD TO DSA         ║
╠════════════════════════════╣
║ ┌────────────────────────┐ ║
║ │      Java Basics       │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │  Loops and Conditions  │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │         Arrays         │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │    Data Structures     │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │       Algorithms       │ ║
║ └────────────────────────┘ ║
║             ▼              ║
║ ┌────────────────────────┐ ║
║ │    Problem Solving     │ ║
║ └────────────────────────┘ ║
╚════════════════════════════╝
```

## What is Complexity?

Complexity measures how much time and memory an algorithm needs as the input grows.

Simple definition: complexity tells us how fast and how light a solution is.

The bigger the input, the more we care. A program that is fine for 10 items may be far too slow for 10 million.

## Time Complexity

Time complexity describes how the running time grows when the input size grows.

We do not measure seconds. We measure how the number of operations grows.

## Space Complexity

Space complexity describes how the amount of memory grows with the input size.

Both are written with Big-O notation.

## Big-O Notation

Big-O shows the growth rate of an algorithm. It ignores small details and keeps only the biggest factor.

Example: if a loop runs 1000 times for n = 1000, it runs n times. Its complexity is O(n).

Constants are dropped. A loop that runs 2n times is still O(n).

## The Main Big-O Ranks (Beginner Level)

From best (fastest) to worst (slowest):

| Rank | Name | Example |
| --- | --- | --- |
| O(1) | constant | accessing one element |
| O(log n) | logarithmic | binary search (later) |
| O(n) | linear | one loop over n items |
| O(n log n) | linearithmic | good sorting |
| O(n^2) | quadratic | nested loops over n |

For now, only three are needed:

## O(1) - Constant Time

Time does not change with the input size.

```java
int first = numbers[0];   // one operation, always
System.out.println(first);
```

No matter if the array has 5 or 5 million items, this is one operation. O(1).

## O(n) - Linear Time

Time grows at the same rate as the input.

```java
int total = 0;
for (int i = 0; i < n; i++) {
    total = total + i;     // n operations
}
```

Double the input, double the work. O(n).

## O(n^2) - Quadratic Time

Time grows with the square of the input.

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.println(i * j);   // n*n operations
    }
}
```

For n = 100, about 10000 operations. Nested loops are usually O(n^2). This matches the rectangle pattern from the Nested Loops file.

## How to Estimate Complexity of Your Code

1. Simple statements: O(1) each.
2. One loop over n items: O(n).
3. Loop inside a loop, both over n: O(n^2).
4. Constant numbers of loops: still O(n) (2n is O(n)).

```java
for (int i = 1; i <= n; i++) { ... }   // O(n)
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) { ... }  // O(n^2)
}
```

## Why the Small Details Are Dropped

In O(n^2 + n), the n part means nothing compared to n^2 for large n. So we keep only the biggest growth: O(n^2).

3n + 10 is O(n). Discard the constant 3 and 10; n dominates.

## Simple Comparison

Assume 1 operation takes 1 millisecond.

| n | O(1) | O(n) | O(n^2) |
| --- | --- | --- | --- |
| 10 | 1 ms | 10 ms | 100 ms |
| 1000 | 1 ms | 1 s | ~17 minutes |
| 1000000 | 1 ms | ~17 minutes | ~31 years |

Same problem, different solutions, completely different outcomes. This is why DSA matters.

## Complexity of the Earlier Problems

- Count digits: one loop over digits, O(number of digits).
- Sum of first n numbers via loop: O(n).
- Rectangle pattern r rows, c columns: O(r * c). If r = c = n, O(n^2).

## How to Start DSA

1. Install an IDE and solve the problems from the Practice file.
2. Learn arrays first - the simplest data structure.
3. Practice searching and sorting.
4. Move to lists, stacks, queues, and trees.
5. Solve at least one problem daily.

The transition is easier because the logic in these notes (loops, conditions, dry runs, complexity) is exactly what DSA uses.

## Common Interview Questions

Q. What is time complexity?

A. A measure of how the running time of an algorithm grows as the input grows.

Q. What does O(1) mean?

A. Constant time - the algorithm always takes about the same number of operations, regardless of input size.

Q. What does O(n^2) mean?

A. The work grows with the square of the input, usually because of nested loops.

Q. Why do we drop constants in Big-O?

A. Big-O describes growth, not exact timing. For large inputs, constants become unimportant.

Next: Output prediction questions.