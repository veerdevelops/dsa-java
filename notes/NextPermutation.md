# LC31 - Next Permutation

## Problem

Given an array of integers, rearrange it into the **next lexicographically greater permutation**.

If no greater permutation exists, rearrange it into the **smallest possible order (ascending order)**.

---

# What is a Permutation?

A permutation is a different arrangement of the same elements.

Example:

```text
[1,2,3]

Permutations:

123
132
213
231
312
321
```

The next permutation of:

```text
123
```

is

```text
132
```

because it is the **smallest number greater than 123**.

---

# Goal

Make the **smallest possible increase** to the current permutation.

---

# Intuition

Example:

```text
1 2 3 6 5 4
```

We start searching from the **RIGHT**.

Why?

Because changing the left side makes a huge increase.

We always try to make the **smallest possible change**.

---

# Step 1 - Find the Pivot

Move from right to left.

Find the first index where:

```java
nums[i] < nums[i + 1]
```

Example:

```text
1 2 3 6 5 4

6 > 5 ✅
5 > 4 ✅

3 < 6 ✅

Pivot = 3
```

The part after the pivot:

```text
6 5 4
```

is already in **decreasing order**.

This means it is already the **largest possible arrangement** of those numbers.

---

# Step 2 - Find the Next Greater Element

Search from the RIGHT again.

Find the first element greater than the pivot.

Example:

```text
Pivot = 3

Right side:

6 5 4
```

Searching from right:

```text
4 > 3 ✅
```

Swap:

Before:

```text
1 2 3 6 5 4
```

After:

```text
1 2 4 6 5 3
```

Why 4?

Because it is the **smallest number greater than 3**.

This creates the smallest possible increase.

---

# Step 3 - Reverse the Suffix

Current suffix:

```text
6 5 3
```

It is still in decreasing order.

Reverse it.

```text
6 5 3

↓

3 5 6
```

Final Answer:

```text
1 2 4 3 5 6
```

---

# Why Reverse?

After increasing the pivot, we want the remaining part to be the **smallest possible**.

Ascending order is the smallest arrangement.

Since the suffix is already decreasing,

we can simply reverse it.

No sorting is required.

---

# Memory Trick

Remember these four words:

```text
Right
↓

Pivot
↓

Swap
↓

Reverse
```

---

# Complete Example

Input:

```text
1 2 3 6 5 4
```

Find Pivot:

```text
Pivot = 3
```

Swap:

```text
1 2 4 6 5 3
```

Reverse suffix:

```text
1 2 4 3 5 6
```

Output:

```text
1 2 4 3 5 6
```

---

# Time Complexity

```text
O(n)
```

---

# Space Complexity

```text
O(1)
```

---

# New Concept Learned

## Lexicographical Order

The next permutation is the **smallest permutation that is greater than the current permutation**.

## Pivot Technique

- Search from the right.
- Find the pivot.
- Swap with the smallest greater element.
- Reverse the suffix.

---

# Interview Revision

✔ Start from the right.

✔ Find the pivot.

✔ Swap with the smallest greater element.

✔ Reverse the suffix

✔ Goal = Smallest possible increase.