# LeetCode 75 - Sort Colors (Dutch National Flag Algorithm)

## Problem Statement

Given an array containing only

```text
0
1
2
```

Sort the array **in-place** without using any built-in sorting function.

---

# Example

### Input

```text
nums = [2,0,2,1,1,0]
```

### Output

```text
[0,0,1,1,2,2]
```

---

# Approaches

## Approach 1 : Brute Force

Use Java's built-in sorting.

```java
Arrays.sort(nums);
```

### Time Complexity

```text
O(n log n)
```

### Space Complexity

```text
O(1)
```

---

## Approach 2 : Counting

Count the number of

- 0's
- 1's
- 2's

Then overwrite the array.

Example

```text
nums = [2,0,2,1,1,0]

0 -> 2

1 -> 2

2 -> 2
```

Rewrite as

```text
0 0 1 1 2 2
```

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

# Approach 3 : Dutch National Flag Algorithm (Optimal)

This is the most famous solution.

Instead of sorting,

we place every number directly in its correct position.

---

# Main Idea

Remember only this:

```text
0 → Left

1 → Middle

2 → Right
```

---

# Three Pointers

```java
int low = 0;
int mid = 0;
int high = nums.length - 1;
```

### Meaning

```text
low
```

Where the next **0** should go.

---

```text
mid
```

Current element being checked.

---

```text
high
```

Where the next **2** should go.

---

# Visualization

Initially

```text
[2,0,2,1,1,0]

 ↑
low

 ↑
mid

           ↑
         high
```

Think of the array as

```text
Left | Middle | Unknown | Right
```

We gradually reduce the **Unknown** part until the entire array becomes sorted.

---

# Case 1

If

```java
nums[mid] == 0
```

A zero belongs on the **left**.

### Action

```java
swap(low, mid);

low++;

mid++;
```

---

# Case 2

If

```java
nums[mid] == 1
```

One is already in the correct position.

### Action

```java
mid++;
```

Nothing else.

---

# Case 3

If

```java
nums[mid] == 2
```

A two belongs on the **right**.

### Action

```java
swap(mid, high);

high--;
```

### Important

Do **NOT** increase `mid`.

Why?

Because after swapping,

a new element comes to the `mid` position.

That new element has not been checked yet.

---

# Dry Run

```text
nums = [2,0,2,1,1,0]
```

Initial

```text
low = 0

mid = 0

high = 5
```

---

### Step 1

```text
nums[mid] = 2
```

Swap

```text
mid ↔ high
```

Array

```text
[0,0,2,1,1,2]
```

Move

```text
high--
```

---

### Step 2

```text
nums[mid] = 0
```

Swap

```text
low ↔ mid
```

Move

```text
low++

mid++
```

---

### Step 3

Again

```text
nums[mid] = 0
```

Swap

```text
low ↔ mid
```

Move

```text
low++

mid++
```

---

### Step 4

```text
nums[mid] = 2
```

Swap

```text
mid ↔ high
```

Array

```text
[0,0,1,1,2,2]
```

Move

```text
high--
```

Do **NOT** move `mid`.

---

### Step 5

```text
nums[mid] = 1
```

Move

```text
mid++
```

---

### Step 6

```text
nums[mid] = 1
```

Move

```text
mid++
```

Now

```text
mid > high
```

Stop.

Sorted array

```text
[0,0,1,1,2,2]
```

---

# Java Code

```java
class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
```

---

# Time Complexity

```text
O(n)
```

Each element is visited at most once.

---

# Space Complexity

```text
O(1)
```

No extra array is used.

---

# Memory Trick

```text
0 → Left

1 → Stay

2 → Right
```

or

```text
0 → swap(low, mid)

1 → mid++

2 → swap(mid, high)
```

---

# Interview Points

- Uses **Three Pointers**.
- Known as the **Dutch National Flag Algorithm**.
- No extra space is required.
- Better than sorting because it runs in **O(n)**.
- After swapping with `high`, **do not increase `mid`**.

---

# Key Takeaways

- Three pointers: `low`, `mid`, `high`.
- `low` → next position for `0`.
- `mid` → current element.
- `high` → next position for `2`.
- Continue until `mid > high`.
- Sorts the array in one traversal.

---

# Pattern Learned

- Three Pointers
- In-place Partitioning
- Dutch National Flag Algorithm