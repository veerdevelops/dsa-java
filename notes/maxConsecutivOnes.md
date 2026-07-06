# Maximum Consecutive Ones (LeetCode 485)

## Problem Statement

Given a binary array `nums` containing only `0`s and `1`s, return the maximum number of consecutive `1`s in the array.

---

## Example

### Input

```text
nums = [1,1,0,1,1,1]
```

### Output

```text
3
```

### Explanation

The longest continuous sequence of `1`s is:

```text
1 1 1
```

So, the answer is **3**.

---

## Approach

- Traverse the array once.
- Maintain a variable `count` to count the current consecutive `1`s.
- Maintain another variable `max` to store the maximum consecutive `1`s found so far.
- If the current element is `1`, increment `count`.
- If the current element is `0`, reset `count` to `0`.
- Update `max` after every `1`.

---

## Algorithm

1. Initialize `count = 0` and `max = 0`.
2. Traverse the array.
3. If the current element is `1`:
    - Increment `count`.
    - Update `max`.
4. If the current element is `0`:
    - Reset `count` to `0`.
5. Return `max`.

---

## Java Code

```java
public static int findMaxConsecutiveOnes(int[] nums) {

    int count = 0;
    int max = 0;

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] == 1) {
            count++;
            max = Math.max(max, count);
        } else {
            count = 0;
        }
    }

    return max;
}
```

---

## Dry Run

Input

```text
nums = [1,1,0,1,1,1]
```

| Element | Count | Max |
|--------:|------:|----:|
| 1 | 1 | 1 |
| 1 | 2 | 2 |
| 0 | 0 | 2 |
| 1 | 1 | 2 |
| 1 | 2 | 2 |
| 1 | 3 | 3 |

Output

```text
3
```

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

Only two variables (`count` and `max`) are used.

---

## Interview Points

- Traverse the array only once.
- Keep track of the current streak using `count`.
- Update the maximum streak using `Math.max()`.
- Reset the count whenever a `0` is encountered.
- Very common running-count pattern in arrays and strings.

---

## Key Takeaways

- `count` stores the current consecutive `1`s.
- `max` stores the maximum consecutive `1`s found so far.
- On encountering `1`:
    - `count++`
    - Update `max`
- On encountering `0`:
    - Reset `count` to `0`.

---

## Pattern Learned

- Running Count
- Maximum Tracking
- Single Array Traversal