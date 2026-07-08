# Single Number (LeetCode 136) - XOR Approach

## Problem Statement

Given a **non-empty** array of integers, every element appears **twice** except for **one** element.

Find that single element.

---

## Example 1

### Input

```text
nums = [2,2,1]
```

### Output

```text
1
```

---

## Example 2

### Input

```text
nums = [4,1,2,1,2]
```

### Output

```text
4
```

---

# Approach (XOR)

Use the **XOR (`^`) operator**.

### XOR Rules

```text
x ^ x = 0
```

A number XOR itself becomes **0**.

Example:

```text
5 ^ 5 = 0
8 ^ 8 = 0
```

---

```text
x ^ 0 = x
```

A number XOR with `0` remains the same.

Example:

```text
5 ^ 0 = 5
9 ^ 0 = 9
```

---

### Why does XOR work?

Since every element appears **twice**, the duplicate elements cancel each other.

Only the single element remains.

Example:

```text
4 ^ 1 ^ 2 ^ 1 ^ 2

= 4 ^ (1 ^ 1) ^ (2 ^ 2)

= 4 ^ 0 ^ 0

= 4
```

---

## Algorithm

1. Initialize `xor = 0`.
2. Traverse the array.
3. XOR every element with `xor`.
4. Return `xor`.

---

## Java Code

```java
public static int singleNumber(int[] nums) {

    int xor = 0;

    for (int num : nums) {
        xor ^= num;
    }

    return xor;
}
```

---

## Dry Run

Input

```text
nums = [4,1,2,1,2]
```

| Step | Current Number | XOR Value |
|-----:|---------------:|----------:|
| Start | - | 0 |
| 1 | 4 | 0 ^ 4 = 4 |
| 2 | 1 | 4 ^ 1 |
| 3 | 2 | 4 ^ 1 ^ 2 |
| 4 | 1 | 4 ^ 1 ^ 2 ^ 1 = 4 ^ 2 |
| 5 | 2 | 4 ^ 2 ^ 2 = 4 |

Output

```text
4
```

---

## Why does this work?

Duplicate numbers always cancel each other.

Example:

```text
7 ^ 7 ^ 5 ^ 9 ^ 9

= (7 ^ 7) ^ (9 ^ 9) ^ 5

= 0 ^ 0 ^ 5

= 5
```

Only the unique element remains.

---

## Time Complexity

```text
O(n)
```

The array is traversed only once.

---

## Space Complexity

```text
O(1)
```

Only one variable (`xor`) is used.

---

## Interview Points

- XOR is a **Bit Manipulation** operator.
- `x ^ x = 0`
- `x ^ 0 = x`
- XOR is **commutative**, so the order of XOR operations does not matter.
- Every duplicate element cancels itself.
- This is the **optimal solution** expected by LeetCode.

---

## Key Takeaways

- Initialize `xor = 0`.
- XOR every element of the array.
- Duplicate elements become `0`.
- Only the single element remains.
- Short, elegant, and optimal solution.

---

## Pattern Learned

- Bit Manipulation
- XOR Operator
- Space Optimization
- Single Traversal