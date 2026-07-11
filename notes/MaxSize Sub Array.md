# LeetCode 325 - Maximum Size Subarray Sum Equals K

## Problem Statement

Given an integer array `nums` (can contain **positive, negative, and zero**) and an integer `k`, return the **length of the longest subarray** whose sum is equal to `k`.

---

# Example

### Input

```text
nums = [1, -1, 5, -2, 3]
k = 3
```

### Output

```text
4
```

### Explanation

The longest subarray is

```text
[1, -1, 5, -2]
```

Sum

```text
1 - 1 + 5 - 2 = 3
```

Length

```text
4
```

---

# Approach Used

- Prefix Sum
- HashMap

---

# Step 1 : Prefix Sum

Prefix Sum means **Running Total**.

Example

```text
nums = [2,3,1]
```

Running Sum

```text
2

5

6
```

---

# Step 2 : Main Idea

Suppose

```text
Current Prefix Sum = 15

k = 6
```

Ask

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

then we found a subarray whose sum is **6**.

---

# Why HashMap?

HashMap stores

```text
Prefix Sum → First Index
```

Example

```text
1 → 0

3 → 1

6 → 2

7 → 3
```

This helps us quickly check whether a required Prefix Sum already exists.

---

# Why First Index?

We need the **longest** subarray.

Example

```text
Prefix Sum = 5

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

The earlier index gives a longer subarray.

So we always store the **first occurrence**.

---

# Algorithm

### Step 1

Create

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Stores

```text
Prefix Sum → First Index
```

---

### Step 2

Initialize

```java
int prefixSum = 0;
int maxLen = 0;
```

---

### Step 3

Traverse the array.

```java
prefixSum += nums[i];
```

Update the running total.

---

### Step 4

Check

```java
if(prefixSum == k)
```

If true,

the subarray starts from index **0**.

Update

```java
maxLen = i + 1;
```

---

### Step 5

Find

```java
remaining = prefixSum - k;
```

This is the Prefix Sum we are searching for.

---

### Step 6

If

```java
map.containsKey(remaining)
```

then calculate

```java
length = i - map.get(remaining);
```

Update

```java
maxLen = Math.max(maxLen, length);
```

---

### Step 7

Store the current Prefix Sum only if it has not appeared before.

```java
if(!map.containsKey(prefixSum)){
    map.put(prefixSum, i);
}
```

---

# Dry Run

```text
nums = [1,-1,5,-2,3]

k = 3
```

| Index | Element | Prefix Sum | Action |
|------:|--------:|-----------:|--------|
|0|1|1|Store 1 → 0|
|1|-1|0|Store 0 → 1|
|2|5|5|Store 5 → 2|
|3|-2|3|prefixSum == k → maxLen = 4|
|4|3|6|Need 6-3 = 3 → Found|

Answer

```text
4
```

---

# Java Code

```java
public static int maxSubArrayLen(int[] nums, int k) {

    HashMap<Integer, Integer> map = new HashMap<>();

    int prefixSum = 0;
    int maxLen = 0;

    for (int i = 0; i < nums.length; i++) {

        prefixSum += nums[i];

        if (prefixSum == k) {
            maxLen = i + 1;
        }

        int remaining = prefixSum - k;

        if (map.containsKey(remaining)) {
            int length = i - map.get(remaining);
            maxLen = Math.max(maxLen, length);
        }

        if (!map.containsKey(prefixSum)) {
            map.put(prefixSum, i);
        }
    }

    return maxLen;
}
```

---

# Time Complexity

```text
O(n)
```

One traversal of the array.

---

# Space Complexity

```text
O(n)
```

HashMap stores Prefix Sums.

---

# Important Interview Points

- Prefix Sum = Running Total.
- HashMap stores **Prefix Sum → First Index**.
- Magic Formula:

```text
Remaining = Prefix Sum - k
```

- If Remaining exists, a valid subarray is found.
- Store only the **first occurrence** of every Prefix Sum.
- Works for positive and negative numbers.

---

# Key Takeaways

- Prefix Sum = Running Sum.
- Calculate `remaining = prefixSum - k`.
- Search `remaining` in the HashMap.
- Store only the first occurrence of every Prefix Sum.
- Earlier index gives the longest subarray.
- Prefix Sum + HashMap is the optimal solution.

---

# Pattern Learned

- Prefix Sum
- HashMap
- Longest Subarray
- Running Sum
- Prefix Sum + HashMap