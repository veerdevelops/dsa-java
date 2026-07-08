# Sliding Window Technique (Positive Numbers)

## What is Sliding Window?

Sliding Window is an optimization technique used to solve problems involving **continuous subarrays** or **substrings**.

Instead of checking every possible subarray, we maintain a **window** and move it efficiently using two pointers.

---

## When to Use Sliding Window?

Use Sliding Window when:

- The problem involves **continuous subarrays** or **substrings**.
- The array contains **only positive numbers** (for sum-based problems).
- You need the **longest**, **shortest**, or **maximum/minimum** continuous segment.

---

## Window Representation

```text
Array

1 2 3 1 1 1 1 4 2
    ↑       ↑
    L       R
```

- **L (Left Pointer)** → Removes elements from the window.
- **R (Right Pointer)** → Adds elements to the window.

Current Window:

```text
[3,1,1,1]
```

---

## Golden Rules

### Rule 1

If

```text
sum < k
```

Expand the window.

Move:

```text
R++
```

Reason:

```text
We need a larger sum.
```

---

### Rule 2

If

```text
sum > k
```

Shrink the window.

Move:

```text
L++
```

Reason:

```text
We need a smaller sum.
```

---

### Rule 3

If

```text
sum == k
```

Update the answer.

Example:

```text
maxLen = Math.max(maxLen, currentWindowLength)
```

Then continue searching.

---

## Example

```text
nums = [1,2,3,1,1,1,1,4,2]

k = 3
```

### Step 1

Window

```text
[1]
```

Sum

```text
1
```

Since

```text
1 < 3
```

Move Right.

---

### Step 2

Window

```text
[1,2]
```

Sum

```text
3
```

Update answer.

---

### Step 3

Window

```text
[1,2,3]
```

Sum

```text
6
```

Since

```text
6 > 3
```

Move Left.

---

### Step 4

Window

```text
[3]
```

Sum

```text
3
```

Update answer again.

---

## Why does Sliding Window work?

For **positive numbers**, adding an element always **increases** the sum.

Removing an element always **decreases** the sum.

Therefore:

- Expand → Sum increases
- Shrink → Sum decreases

This makes the window predictable.

---

## Why doesn't it work with negative numbers?

Example:

```text
[2,-1,2]
```

If you add:

```text
-1
```

the sum decreases.

If you remove:

```text
2
```

the sum also decreases.

Since the sum is no longer predictable, Sliding Window fails.

For arrays containing negative numbers, use:

- Prefix Sum
- HashMap

---

## Time Complexity

```text
O(n)
```

Each element is visited at most twice.

---

## Space Complexity

```text
O(1)
```

Only a few variables are used.

---

## Interview Points

- Uses two pointers.
- Works only for continuous subarrays.
- Best suited for positive numbers.
- Avoids nested loops.
- Much faster than the brute-force approach.

---

## Key Takeaways

- L removes elements.
- R adds elements.
- If sum < k → Move R.
- If sum > k → Move L.
- If sum == k → Update answer.
- Works efficiently only when all elements are positive.

---

## Pattern Learned

- Sliding Window
- Two Pointers
- Window Expansion
- Window Shrinking
- Longest/Shortest Subarray