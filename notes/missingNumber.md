# Missing Number (LeetCode 268)

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number that is missing from the array.

---

## Example

### Input

```text
nums = [3,0,1]
```

### Output

```text
2
```

---

## Approach (Sum Formula)

The array contains numbers from **0 to n** with exactly one number missing.

1. Calculate the expected sum of numbers from `0` to `n`.
2. Calculate the actual sum of all elements in the array.
3. The difference between the two sums is the missing number.

---

## Formula

```text
Expected Sum = n × (n + 1) / 2
```

```text
Missing Number = Expected Sum - Actual Sum
```

---

## Algorithm

1. Find the length of the array (`n`).
2. Calculate the expected sum using the formula.
3. Traverse the array and calculate the actual sum.
4. Return:

```text
Expected Sum - Actual Sum
```

---

## Java Code

```java
public static int missingNumber(int[] nums) {

    int n = nums.length;

    long expectedSum = (long) n * (n + 1) / 2;

    long actualSum = 0;

    for (int i = 0; i < n; i++) {
        actualSum += nums[i];
    }

    return (int)(expectedSum - actualSum);
}
```

---

## Dry Run

Input

```text
nums = [3,0,1]
```

### Step 1

```text
n = 3
```

### Step 2

Expected Sum

```text
3 × (3 + 1) / 2

= 3 × 4 / 2

= 6
```

### Step 3

Actual Sum

```text
3 + 0 + 1 = 4
```

### Step 4

Missing Number

```text
6 - 4 = 2
```

Output

```text
2
```

---

## Time Complexity

```text
O(n)
```

One traversal of the array.

---

## Space Complexity

```text
O(1)
```

No extra space is used.

---

## Why use `long`?

For very large values of `n`, the expression

```text
n × (n + 1)
```

may exceed the range of `int`, causing **integer overflow**.

Using

```java
long expectedSum = (long) n * (n + 1) / 2;
```

ensures the multiplication is performed using the `long` data type.

---

## Interview Points

- Uses the mathematical sum formula.
- More efficient than sorting (`O(n log n)`).
- Requires only one traversal.
- Use `long` to prevent integer overflow.
- Easy to implement and commonly accepted in interviews.

---

## Key Takeaways

- Numbers are in the range **0 to n**.
- Exactly one number is missing.
- Missing Number = Expected Sum − Actual Sum.
- Remember to use `long` for large inputs.

---

## Pattern Learned

- Mathematical Formula
- Array Traversal
- Overflow Handling