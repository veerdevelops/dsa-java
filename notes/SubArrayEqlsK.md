# LeetCode 560 - Subarray Sum Equals K

## Problem Statement

Given an integer array `nums` and an integer `k`, return the **total number of subarrays** whose sum is equal to `k`.

> The array can contain **positive, negative, and zero**.

---

# Example

### Input

```text
nums = [1,1,1]

k = 2
```

### Output

```text
2
```

### Explanation

The valid subarrays are:

```text
[1,1]  (Index 0 → 1)

[1,1]  (Index 1 → 2)
```

So the answer is

```text
2
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

Nothing complicated.

Just keep adding elements while traversing the array.

---

# Step 2 : The Main Idea

Suppose

```text
Current Prefix Sum = 15

k = 6
```

Ask yourself

```text
15 - ? = 6
```

Answer

```text
9
```

Now ask

> **Have I seen Prefix Sum = 9 before?**

If YES,

then we found a subarray whose sum is **6**.

---

# Why HashMap?

HashMap stores

```text
Prefix Sum → Frequency
```

Example

```text
0 → 1

1 → 2

3 → 1

6 → 1
```

Instead of storing the index, we store **how many times** a Prefix Sum has appeared.

---

# Why Frequency?

Because we want to **count** all valid subarrays.

Example

```text
Prefix Sum 5 appeared

2 times
```

Current Prefix Sum

```text
8
```

Target

```text
k = 3
```

Calculate

```text
remaining = 8 - 3 = 5
```

Since Prefix Sum **5** appeared **2 times**,

we found

```text
2 new subarrays
```

So

```java
count += map.get(remaining);
```

---

# Why map.put(0,1)?

Before starting the array,

we assume

```text
Prefix Sum = 0
```

has already appeared **once**.

So we write

```java
map.put(0,1);
```

This automatically counts subarrays that start from index **0**.

Example

```text
nums = [1,2]

k = 3
```

Prefix Sum

```text
1

3
```

At Prefix Sum = 3

```text
remaining = 3 - 3 = 0
```

HashMap already contains

```text
0 → 1
```

So

```text
[1,2]
```

is counted automatically.

---

# Algorithm

### Step 1

Create a HashMap.

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

Stores

```text
Prefix Sum → Frequency
```

---

### Step 2

Initialize

```java
int prefixSum = 0;

int count = 0;
```

---

### Step 3

Store

```java
map.put(0,1);
```

This handles subarrays starting from index **0**.

---

### Step 4

Traverse the array.

```java
prefixSum += nums[i];
```

Update the running total.

---

### Step 5

Calculate

```java
remaining = prefixSum - k;
```

---

### Step 6

If

```java
map.containsKey(remaining)
```

Increase the count.

```java
count += map.get(remaining);
```

---

### Step 7

Increase the frequency of the current Prefix Sum.

```java
map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
```

---

### Step 8

Return

```java
count;
```

---

# Dry Run

```text
nums = [1,1,1]

k = 2
```

Initially

```text
map

0 → 1
```

---

### Index 0

```text
Prefix Sum = 1

remaining = -1

Not Found
```

Store

```text
1 → 1
```

---

### Index 1

```text
Prefix Sum = 2

remaining = 0
```

Found

```text
0 → 1
```

Count

```text
1
```

Store

```text
2 → 1
```

---

### Index 2

```text
Prefix Sum = 3

remaining = 1
```

Found

```text
1 → 1
```

Count

```text
2
```

Answer

```text
2
```

---

# Java Code

```java
class Solution {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        map.put(0,1);

        for(int i=0;i<nums.length;i++){

            prefixSum += nums[i];

            int remaining = prefixSum - k;

            if(map.containsKey(remaining)){
                count += map.get(remaining);
            }

            map.put(prefixSum,
                    map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
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

HashMap stores Prefix Sum frequencies.

---

# LC 325 vs LC 560

| LC 325 | LC 560 |
|---------|---------|
| Find longest length | Count subarrays |
| Prefix Sum → First Index | Prefix Sum → Frequency |
| Answer = maxLen | Answer = count |
| Store first occurrence | Store frequency |
| Uses index | Uses frequency |

---

# Interview Points

- Prefix Sum = Running Total.
- HashMap stores **Prefix Sum → Frequency**.
- Magic Formula:

```text
remaining = prefixSum - k
```

- If `remaining` exists, increase `count`.
- Store every Prefix Sum by increasing its frequency.
- `map.put(0,1)` handles subarrays starting from index `0`.

---

# Key Takeaways

- Prefix Sum = Running Sum.
- Calculate

```text
remaining = prefixSum - k
```

- Search `remaining` in the HashMap.
- Increase `count` by its frequency.
- Update the frequency of the current Prefix Sum.
- Prefix Sum + HashMap is the optimal solution.

---

# Pattern Learned

- Prefix Sum
- HashMap
- Frequency Counting
- Running Sum
- Subarray Problems.