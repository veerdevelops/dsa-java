# Prefix Sum + HashMap (Longest Subarray Sum = K)

## Problem Statement

Given an array (can contain **positive and negative numbers**) and an integer `k`, find the **length of the longest subarray whose sum is equal to `k`**.

---

# Main Idea

We use two concepts together:

- Prefix Sum
- HashMap

---

# Step 1 : What is Prefix Sum?

Prefix Sum means **Running Total**.

Example:

```text
nums = [2,3,1]
```

Initially

```text
sum = 0
```

After 2

```text
sum = 2
```

After 3

```text
sum = 5
```

After 1

```text
sum = 6
```

Running sums become

```text
2
5
6
```

These are called **Prefix Sums**.

---

# Step 2 : The Magic Formula

Suppose

```text
Current Prefix Sum = 15

k = 6
```

Ask yourself

```text
15 - ? = 6
```

Answer

```text
9
```

So we check

> **Have we seen Prefix Sum = 9 before?**

If YES,

then

```text
Current Prefix Sum - Old Prefix Sum = k
```

which means

```text
15 - 9 = 6
```

So we found a subarray whose sum is **6**.

---

# Why HashMap?

We need to quickly answer:

```text
Have I seen this Prefix Sum before?
```

HashMap stores

```text
Prefix Sum → Index
```

Example

```text
1 → 0

3 → 1

6 → 2

7 → 3
```

Instead of searching the whole array, we can check the HashMap instantly.

---

# Why store the Index?

We need the length of the subarray.

Formula

```text
Length = Current Index - Old Index
```

Example

```text
Current Index = 8

Old Index = 3
```

Length

```text
8 - 3 = 5
```

---

# Why store ONLY the first occurrence?

Example

```text
Prefix Sum 5

First appears at index 2

Appears again at index 6

Current index = 10
```

Using first occurrence

```text
10 - 2 = 8
```

Using second occurrence

```text
10 - 6 = 4
```

Since we want the **longest subarray**, we always keep the **first occurrence**.

---

# Algorithm

1. Create a HashMap.
2. Initialize

```text
sum = 0

maxLen = 0
```

3. Traverse the array.

4. Add current element to Prefix Sum.

```text
sum += nums[i]
```

5. If

```text
sum == k
```

Update

```text
maxLen = i + 1
```

because the subarray starts from index **0**.

6. Calculate

```text
remaining = sum - k
```

7. If `remaining` exists in the HashMap,

calculate

```text
length = currentIndex - oldIndex
```

Update

```text
maxLen
```

8. Store the current Prefix Sum **only if it is not already present**.

---

# Dry Run

```text
nums = [1,2,3,1]

k = 3
```

| Index | Element | Prefix Sum | Action |
|------:|--------:|-----------:|--------|
|0|1|1|Store 1 → 0|
|1|2|3|sum == k → maxLen = 2|
|2|3|6|Need 6-3 = 3 → Found at index 1|
|3|1|7|Need 7-3 = 4 → Not found|

Answer

```text
2
```

---

# Java Formula

```java
remaining = sum - k;
```

If

```java
map.containsKey(remaining)
```

then

```java
length = i - map.get(remaining);
```

Update

```java
maxLen = Math.max(maxLen, length);
```

---

# Time Complexity

```text
O(n)
```

Only one traversal.

---

# Space Complexity

```text
O(n)
```

HashMap stores Prefix Sums.

---

# Sliding Window vs Prefix Sum

| Sliding Window | Prefix Sum + HashMap |
|---------------|----------------------|
| Positive numbers only | Positive + Negative numbers |
| Two Pointers | Prefix Sum + HashMap |
| O(1) Space | O(n) Space |
| Simpler | More powerful |

---

# Interview Points

- Prefix Sum = Running Total.
- HashMap stores **Prefix Sum → First Index**.
- Check `sum - k`.
- Store only the first occurrence.
- Works for arrays containing negative numbers.
- Used in many interview questions.

---

# Key Takeaways

- Prefix Sum = Running Sum.
- Magic Formula:

```text
Remaining = Current Prefix Sum - k
```

- If Remaining exists in HashMap, a valid subarray is found.
- Store the first occurrence of every Prefix Sum.
- Earlier index = Longer subarray.

---

# Pattern Learned

- Prefix Sum
- HashMap
- Running Sum
- Longest Subarray
- Prefix Sum + HashMap