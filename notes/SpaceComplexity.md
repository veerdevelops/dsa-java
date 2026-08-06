# 💾 Space Complexity Notes (DSA)

## What is Space Complexity?

Space Complexity tells us **how much extra memory (RAM)** an algorithm uses as the input size (`n`) increases.

It **does not** count the memory used by the input itself.

It only counts the **extra space** created by the algorithm.

---

# How to Think

Ask yourself:

> **"Am I creating any extra arrays, lists, maps, stacks, queues or recursion memory?"**

If yes,

How much memory do they use?

---

# 1. Constant Extra Space → O(1)

```java
int max = arr[0];
int sum = 0;

for(int i=0;i<n;i++){
    sum += arr[i];
}
```

Extra variables

```
max
sum
i
```

Only a few variables.

Even if

```
n = 10
```

or

```
n = 1000000
```

Still only

```
3 variables
```

Therefore

```
Space Complexity = O(1)
```

---

# 2. Extra Array → O(n)

```java
int[] result = new int[n];
```

If

```
n = 5
```

Extra memory

```
5 elements
```

If

```
n = 100
```

Extra memory

```
100 elements
```

Pattern

```
n
```

Therefore

```
Space Complexity = O(n)
```

---

# Example

LC2149 Rearrange Array by Sign

```java
int[] result = new int[n];
```

Used an extra array.

Time

```
O(n)
```

Space

```
O(n)
```

---

# 3. Two Extra Arrays

```java
int[] left = new int[n];
int[] right = new int[n];
```

Memory used

```
n + n = 2n
```

Big-O ignores constants.

Therefore

```
O(2n)

↓

O(n)
```

---

# 4. ArrayList

```java
ArrayList<Integer> list = new ArrayList<>();
```

If eventually it stores

```
n elements
```

Space

```
O(n)
```

---

# 5. HashMap

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

Worst case

Stores

```
n key-value pairs
```

Therefore

```
O(n)
```

---

# 6. Nested Loops

```java
for(...)
{
    for(...)
    {

    }
}
```

Important!

Nested loops affect

```
Time Complexity
```

NOT

```
Space Complexity
```

Because

No new memory is created.

Only variables.

Space remains

```
O(1)
```

---

# Example

```java
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){

    }
}
```

Time

```
O(n²)
```

Space

```
O(1)
```

---

# Compare

Example 1

```java
int[] result = new int[n];
```

Space

```
O(n)
```

---

Example 2

```java
int sum = 0;
```

Space

```
O(1)
```

---

# Interview Trick

Interviewers love asking

```
Can you reduce O(n) space to O(1)?
```

That usually means

```
Don't create another array.

Modify the original one.

or

Use only variables.
```

---

# Time vs Space

Example

```java
int[] temp = new int[n];

for(int i=0;i<n;i++){

}
```

Time

```
O(n)
```

Space

```
O(n)
```

---

Example

```java
for(int i=0;i<n;i++){

}
```

Time

```
O(n)
```

Space

```
O(1)
```

---

# Common Space Complexities

| Code | Space |
|------|--------|
| Few variables | O(1) |
| One extra array | O(n) |
| ArrayList | O(n) |
| HashMap | O(n) |
| Stack | O(n) |
| Queue | O(n) |

---

# Golden Rules ⭐

Time Complexity

```
How much work?
```

Space Complexity

```
How much extra memory?
```

---

# My Thinking Process

Whenever I see code, I ask

1.

```
Did I create an extra data structure?
```

If NO

```
O(1)
```

If YES

Ask

```
How big can it become?
```

If it grows with

```
n
```

Then

```
O(n)
```

---

# Revision

✅ Variables

```
O(1)
```

✅ Extra Array

```
O(n)
```

✅ HashMap

```
O(n)
```

✅ ArrayList

```
O(n)
```

✅ Nested loops

Increase

```
Time
```

NOT

```
Space
```

---

# One Line to Remember

> **Time Complexity = How much work is done.**

> **Space Complexity = How much extra memory is used.**