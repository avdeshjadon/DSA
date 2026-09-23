# Loops - while, for, do-while

## Why Loops Are Needed

Repetition is common in programming. Printing numbers 1 to 100, summing digits, printing patterns - all need the same work done many times.

A loop runs a block of code repeatedly until a condition becomes false.

Simple definition: a loop repeats code while a condition is true.

Without loops, printing five numbers means writing five print statements:

```java
System.out.println(1);
System.out.println(2);
System.out.println(3);
System.out.println(4);
System.out.println(5);
```

With a loop, the same job is one structure:

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## The Three Parts of Every Loop

1. Initialization - set the starting value.
2. Condition - the loop keeps running while this is true.
3. Update - change the value so the loop reaches the exit.

```text
╔════════════════════════════════════════╗
║             LOOP MECHANISM             ║
╠════════════════════════════════════════╣
║         ┌──────────────────────┐       ║
║ Start   │    Initialization    │       ║
║         └──────────────────────┘       ║
║                     ▼ yes              ║
║         ┌──────────────────────┐       ║
║     ┌───◄  Is condition true?  ▶────┐  ║
║     │   └──────────────────────┘  no│  ║
║     │               ▼               │  ║
║     │   ┌──────────────────────┐    │  ║
║ back│   │    Run loop body     │    │  ║
║     │   └──────────────────────┘    │  ║
║     │               ▼               │  ║
║     │   ┌──────────────────────┐    │  ║
║     └───◄        Update        │    │  ║
║         └──────────────────────┘    │  ║
║                                     │  ║
║         ┌──────────────────────┐    │  ║
║         │      Exit loop       ◄────┘  ║
║         └──────────────────────┘       ║
╚════════════════════════════════════════╝
```

## while Loop

```java
while (condition) {
    // body
}
```

The condition is checked before the body runs. If it is false at the start, the body never runs.

```java
int i = 1;
while (i <= 3) {
    System.out.println("i = " + i);
    i++;
}
```

Output:

```
i = 1
i = 2
i = 3
```

Tracing:

| iteration | i at check | condition | prints | i after update |
| --- | --- | --- | --- | --- |
| 1 | 1 | 1 <= 3 true | 1 | 2 |
| 2 | 2 | 2 <= 3 true | 2 | 3 |
| 3 | 3 | 3 <= 3 true | 3 | 4 |
| 4 | 4 | 4 <= 3 false | none | stop |

## for Loop

The for loop keeps all three parts in one line.

```java
for (initialization; condition; update) {
    // body
}
```

```java
for (int i = 1; i <= 3; i++) {
    System.out.println("i = " + i);
}
```

Output:

```
i = 1
i = 2
i = 3
```

The three parts are easy to read in one line: start at 1, run while i <= 3, add 1 each time.

The for loop and the while loop work exactly the same. They are two ways to write the same idea. Use for when the count is known, use while when the end depends on a changing value.

## do-while Loop

```java
do {
    // body
} while (condition);
```

The difference: the body runs at least once, because the condition is checked after the body.

```java
int i = 10;
do {
    System.out.println(i);
    i++;
} while (i <= 3);
```

Output:

```
10
```

Even though 10 is not less than or equal to 3, the body ran once anyway.

## while vs for vs do-while

| Point | while | for | do-while |
| --- | --- | --- | --- |
| Condition checked | before body | before body | after body |
| Runs at least once? | no | no | yes |
| Best used when | number of repeats is unknown | count is known | must run at least once |
| Syntax | condition only | init, condition, update in one line | condition at the end |

## break

`break` immediately exits the loop. The rest of the loop is skipped.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```

Output:

```
1
2
3
4
```

Loop stopped at 5.

## continue

`continue` skips the rest of the current round and moves to the next one.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

Output:

```
1
2
4
5
```

Number 3 was skipped; the rest ran normally.

## Difference Between break and continue

| break | continue |
| --- | --- |
| Exits the loop completely | Skips only one iteration |
| Loop stops | Loop continues with the next value |
| Used to stop early | Used to ignore certain values |

## Nested Loops (First Look)

A loop inside another loop is a nested loop. The inner loop completes fully for every single round of the outer loop.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i=" + i + " j=" + j);
    }
}
```

Output:

```
i=1 j=1
i=1 j=2
i=2 j=1
i=2 j=2
i=3 j=1
i=3 j=2
```

Nested loops are covered in detail in the Nested Loops and Patterns file.

## Infinite Loop

A loop whose condition never becomes false runs forever. This is usually a bug.

```java
int i = 1;
while (i > 0) {
    System.out.println(i);
    i++;          // i keeps growing, condition stays true forever
}
```

This never ends because i only increases. Ensure the update moves toward the exit condition.

## Common Mistakes

- Forgetting the update statement, causing an infinite loop.
- Writing a semicolon after the while condition: `while (i <= 5);` - the body becomes empty and the loop runs forever.
- Using `=` in the condition instead of `==`.
- Forgetting the semicolon after do-while's closing bracket.
- Off-by-one: condition `i < 5` gives 4 prints, `i <= 5` gives 5 prints.

## Important Points

- All loops use the same three parts: init, condition, update.
- while and for check the condition first; do-while checks it last.
- break exits the whole loop.
- continue skips one round only.

## Common Interview Questions

Q. Difference between while and do-while?

A. while checks the condition before running the body; do-while runs the body once first.

Q. Difference between break and continue?

A. break ends the loop; continue jumps to the next iteration.

Q. When do you prefer for over while?

A. When the number of iterations is known (for example, printing 1 to n).

Next: Number problems - loops applied to digits and numbers.