# Linear Search

## Problem Statement

Given an array and a target element, return the index of the target if it exists.
Otherwise, return `-1`.

### Example

Input:
```text
nums = [4, 7, 1, 9, 5]
target = 9
```

Output:
```text
3
```

---

## Approach

- Traverse the array from left to right.
- Compare every element with the target.
- If the element matches the target, return its index.
- If the entire array is traversed and the target is not found, return `-1`.

---

## Algorithm

1. Start from index `0`.
2. Compare `nums[i]` with `target`.
3. If they are equal, return `i`.
4. Otherwise, continue to the next index.
5. If the loop finishes without finding the target, return `-1`.

---

## Java Code

```java
public static int linearSearch(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

        if (nums[i] == target) {
            return i;
        }
    }

    return -1;
}
```

---

## Dry Run

Array:

```text
[4, 7, 1, 9, 5]
```

Target = `9`

| Index | Value | Match? |
|------:|------:|:------:|
| 0 | 4 | ❌ |
| 1 | 7 | ❌ |
| 2 | 1 | ❌ |
| 3 | 9 | ✅ Return 3 |

---

## Time Complexity

- **Best Case:** `O(1)` (Target found at first index)
- **Worst Case:** `O(n)` (Target is last element or not present)

---

## Space Complexity

- **O(1)** (No extra space used)

---

## Interview Points

- Works on both **sorted** and **unsorted** arrays.
- Checks each element one by one.
- Simple to implement.
- Efficient for small arrays.
- Not suitable for large datasets because its worst-case time complexity is `O(n)`.

---

## Why not Binary Search?

Binary Search requires the array to be **sorted**.

In an unsorted array, comparing the target with the middle element does not tell us whether to search the left half or the right half. Therefore, Binary Search cannot be applied.

---

## Key Takeaways

- Traverse the array sequentially.
- Return the index as soon as the target is found.
- Return `-1` if the target is not present.
- Works for any array, regardless of sorting.