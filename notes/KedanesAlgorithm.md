# Kadane's Algorithm

## What is Kadane's Algorithm?

Kadane's Algorithm is an optimal greedy algorithm used to find the **maximum sum of a contiguous subarray**.

It solves the Maximum Subarray problem in **O(n)** time.

---

## Problem Statement

Given an integer array, find the contiguous subarray having the maximum sum.

A **subarray** contains consecutive elements.

---

## Example

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

Maximum Sum Subarray:

```text
[4,-1,2,1]
```

Sum:

```text
6
```

---

## Core Idea

At every element, decide:

```text
Continue the current subarray
```

or

```text
Start a new subarray
```

If the running sum becomes negative, discard it.

---

## Variables Used

```java
int sum = 0;
int maxSum = Integer.MIN_VALUE;
```

### sum

Stores the sum of the current subarray.

### maxSum

Stores the maximum subarray sum found so far.

---

## Algorithm

### Step 1

Add the current element.

```java
sum += num;
```

---

### Step 2

Update the maximum sum.

```java
maxSum = Math.max(maxSum, sum);
```

---

### Step 3

If the current sum becomes negative,

```java
if(sum < 0){
    sum = 0;
}
```

Reset it because a negative sum can never help a future subarray.

---

## Why Reset to Zero?

Example:

```text
Current Sum = -5

Next Number = 4
```

Option 1:

```text
-5 + 4 = -1
```

Option 2:

```text
Start from 4

Sum = 4
```

Clearly,

```text
4 > -1
```

So carrying a negative sum is useless.

---

## Dry Run

Array:

```text
[-2,1,-3,4,-1,2,1,-5,4]
```

| Element | Current Sum | Maximum Sum |
|---------:|------------:|------------:|
| -2 | -2 | -2 |
| 1 | 1 | 1 |
| -3 | -2 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Final Answer:

```text
6
```

---

## Java Code

```java
public int maxSubArray(int[] nums) {

    int sum = 0;
    int maxSum = Integer.MIN_VALUE;

    for(int num : nums){

        sum += num;

        maxSum = Math.max(maxSum, sum);

        if(sum < 0){
            sum = 0;
        }
    }

    return maxSum;
}
```

---

## Time Complexity

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

---

## Why is Kadane's Algorithm Greedy?

At every step, it greedily chooses whether to:

```text
Continue the current subarray
```

or

```text
Discard the negative sum and start a new subarray.
```

It never goes back to previous elements.

---

## Important Edge Case

Array:

```text
[-5,-2,-8]
```

Answer:

```text
-2
```

Therefore,

```java
int maxSum = Integer.MIN_VALUE;
```

must be used instead of

```java
int maxSum = 0;
```

---

## Memory Trick

```text
Add current element
        ↓
Update maximum
        ↓
If sum < 0
        ↓
Reset to 0
```

---

## Compariso

| Approach | Time | Space |
|----------|------|------|
| Brute Force | O(n³) | O(1) |
| Better | O(n²) | O(1) |
| Kadane's Algorithm | O(n) | O(1) |
