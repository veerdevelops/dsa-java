# ⏱️ Time Complexity Notes (DSA)

## What is Time Complexity?

Time Complexity tells us **how the number of operations grows as the input size (`n`) increases.**

It does **NOT** measure the actual time in seconds.

---

# How to Think (Instead of Memorizing)

Ask yourself:

> **"How many times is my code doing work?"**

Count the total operations.

---

# 1. Single Loop → O(n)

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Example

If `n = 5`

```
0
1
2
3
4
```

`println()` executes **5** times.

If `n = 100`

It executes **100** times.

Work grows like:

```
n
```

Therefore,

```
Time Complexity = O(n)
```

---

# 2. Two Nested Loops → O(n²)

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

### Example

If `n = 3`

Outer loop:

```
3 times
```

Inner loop:

```
3 times
```

Total work:

```
3 × 3 = 9
```

If `n = 5`

```
5 × 5 = 25
```

Pattern:

```
n × n = n²
```

Therefore,

```
Time Complexity = O(n²)
```

---

# 3. Three Nested Loops → O(n³)

```java
for (...) {
    for (...) {
        for (...) {

        }
    }
}
```

Example:

If `n = 2`

```
2 × 2 × 2 = 8
```

If `n = 3`

```
3 × 3 × 3 = 27
```

Pattern:

```
n × n × n = n³
```

Therefore,

```
Time Complexity = O(n³)
```

---

# Separate Loops (NOT Nested)

```java
for (...) {

}

for (...) {

}
```

Work:

```
n + n = 2n
```

In Big-O we ignore constants.

So,

```
O(2n) = O(n)
```

Even

```java
for (...) { }

for (...) { }

for (...) { }
```

is

```
n + n + n = 3n

O(3n) = O(n)
```

---

# Constant Time → O(1)

```java
int sum = a + b;
```

or

```java
arr[5];
```

Only one operation.

No matter how large `n` becomes, the work stays the same.

```
Time Complexity = O(1)
```

---

# Common Time Complexities

| Code Pattern | Time Complexity |
|--------------|-----------------|
| One loop | O(n) |
| Two nested loops | O(n²) |
| Three nested loops | O(n³) |
| Constant work | O(1) |

---

# My Thinking Process

Instead of memorizing:

❌ One loop → O(n)

Think:

1. Count how many times the work happens.
2. Find the pattern.
3. Write the complexity.

Example:

```
n = 5
↓

5 operations

n = 100
↓

100 operations

Pattern = n

Answer = O(n)
```

---

# Interview Tip

Whenever you see code, ask:

> **"How many total operations are being performed as `n` grows?"**

The answer to that question gives you the Time Complexity.

---

# Quick Revision

✅ One loop → O(n)

✅ Two nested loops → O(n²)

✅ Three nested loops → O(n³)

✅ Separate loops → Add

```
O(n) + O(n) = O(n)
```

✅ Nested loops → Multiply

```
O(n × n) = O(n²)
```

---

# Golden Rule ⭐

**Never memorize Big-O.**

Always derive it by asking:

> **"How many times is the work happening?"**