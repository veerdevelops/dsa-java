# Prefix Sum Technique

## What is Prefix Sum?

A **Prefix Sum** is the **running sum of all elements from index 0 to the current index**.

In simple words:

> Prefix Sum = Running Total

---

## Example 1

Array:

```text
nums = [2,3,1]
```

Initially

```text
sum = 0
```

### Step 1

```text
sum = 0 + 2 = 2
```

### Step 2

```text
sum = 2 + 3 = 5
```

### Step 3

```text
sum = 5 + 1 = 6
```

Final Prefix Sums:

```text
[2,5,6]
```

---

## Example 2

Array:

```text
nums = [3,2,4,1]
```

Running Sum

| Element | Prefix Sum |
|--------:|-----------:|
| 3 | 3 |
| 2 | 5 |
| 4 | 9 |
| 1 | 10 |

Prefix Sum Array:

```text
[3,5,9,10]
```

---

## How is Prefix Sum Calculated?

Initialize

```java
int sum = 0;
```

Traverse the array

```java
sum += nums[i];
```

The value of `sum` after every iteration is the current Prefix Sum.

---

## Why Do We Use Prefix Sum?

Prefix Sum helps us solve subarray problems efficiently.

Instead of calculating the sum repeatedly, we keep a running total.

It is commonly used in:

- Longest Subarray with Sum K
- Subarray Sum Equals K
- Range Sum Queries
- Many HashMap-based problems

---

## Prefix Sum vs Normal Sum

Suppose

```text
nums = [2,3,1]
```

Normal Sum

```text
2 + 3 + 1 = 6
```

Prefix Sum

```text
After 2 → 2

After 3 → 5

After 1 → 6
```

Notice that the sum is updated continuously while traversing the array.

---

## Prefix Sum vs Sliding Window

| Sliding Window | Prefix Sum |
|---------------|------------|
| Sum of current window | Running sum from index 0 |
| Uses two pointers | Uses one running sum |
| Works only for positive numbers | Works for positive and negative numbers (with HashMap) |

---

## Time Complexity

```text
O(n)
```

Only one traversal is required.

---

## Space Complexity

```text
O(1)
```

Only one variable (`sum`) is used.

---

## Interview Points

- Prefix Sum stores the running total.
- It is calculated while traversing the array.
- Often combined with HashMap.
- Useful for solving subarray problems efficiently.
- Works with both positive and negative numbers when combined with HashMap.

---

## Key Takeaways

- Prefix Sum = Running Total.
- Initialize `sum = 0`.
- Add each element to `sum`.
- Every updated value of `sum` is a Prefix Sum.
- Prefix Sum is a foundation for many array and HashMap problems.

---

## Pattern Learned

- Prefix Sum
- Running Sum
- Array Traversal
- Foundation for Prefix Sum + HashMap