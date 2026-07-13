# LeetCode 1 - Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to the target.

**Note:** You cannot use the same element twice.

---

# Example

### Input

```text
nums = [2,7,11,15]

target = 9
```

### Output

```text
[0,1]
```

### Explanation

```text
nums[0] = 2

nums[1] = 7

2 + 7 = 9
```

Return

```text
[0,1]
```

---

# Approach 1 : Brute Force

Check every possible pair.

### Algorithm

- Pick one element.
- Compare it with every remaining element.
- If their sum equals the target, return the indices.

---

## Brute Force Code

```java
for(int i=0;i<nums.length;i++){

    for(int j=i+1;j<nums.length;j++){

        if(nums[i]+nums[j]==target){
            return new int[]{i,j};
        }

    }

}
```

---

## Why does j start from i+1?

If

```text
j = 0
```

we will compare

```text
nums[1] + nums[0]
```

even though

```text
nums[0] + nums[1]
```

was already checked.

Also,

```text
j = i
```

would compare the same element with itself.

So we start from

```text
i + 1
```

---

## Time Complexity

```text
O(n²)
```

---

## Space Complexity

```text
O(1)
```

---

# Approach 2 : HashMap (Optimal)

Instead of checking every number again,

ask

> **What number do I need to reach the target?**

Example

```text
nums = [2,7,11,15]

target = 9
```

Current number

```text
2
```

Needed number

```text
9 - 2 = 7
```

Now simply ask the HashMap

> Have I already seen **7**?

If YES,

return both indices.

If NO,

store the current number.

---

# What does the HashMap store?

```text
Number → Index
```

Example

```text
2 → 0

7 → 1

11 → 2

15 → 3
```

---

# Algorithm

### Step 1

Create a HashMap.

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

Stores

```text
Number → Index
```

---

### Step 2

Traverse the array.

---

### Step 3

Calculate

```java
remaining = target - nums[i];
```

Ask

> What number do I need?

---

### Step 4

Check

```java
if(map.containsKey(remaining))
```

If YES,

return

```java
new int[]{map.get(remaining),i};
```

---

### Step 5

Otherwise,

store the current number.

```java
map.put(nums[i],i);
```

---

# Why do we check before storing?

Example

```text
nums = [3,3]

target = 6
```

Correct order

```java
Check

↓

Store
```

If we store first,

the current element may match with itself,

which is not allowed.

---

# Dry Run

```text
nums = [2,7,11,15]

target = 9
```

### i = 0

Current

```text
2
```

Need

```text
7
```

HashMap

```text
Empty
```

Store

```text
2 → 0
```

---

### i = 1

Current

```text
7
```

Need

```text
2
```

HashMap

```text
2 → 0
```

Found!

Return

```text
[0,1]
```

---

# Java Code

```java
class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int remaining = target - nums[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }

            map.put(nums[i],i);

        }

        return new int[]{};
    }
}
```

---

# Time Complexity

```text
O(n)
```

---

# Space Complexity

```text
O(n)
```

---

# Brute Force vs Optimal

| Brute Force | HashMap |
|-------------|----------|
| O(n²) | O(n) |
| Two loops | One loop |
| No extra space | Uses HashMap |
| Simple | Interview preferred |

---

# Important Interview Points

- HashMap stores **Number → Index**.
- Calculate

```text
remaining = target - nums[i]
```

- Check HashMap before storing.
- Return indices, not values.
- Cannot use the same element twice.

---

# Key Takeaways

- Think "What number do I need?"
- Calculate

```text
remaining = target - nums[i]
```

- Search the HashMap.
- If found, return indices.
- Otherwise store the current number.

---

# Pattern Learned

- HashMap
- Complement Technique
- One Pass HashMap