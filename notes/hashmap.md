# Single Number (LeetCode 136) - HashMap Approach

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

## Approach (HashMap)

Use a **HashMap** to store the frequency of each element.

- Traverse the array.
- Store each number as the **key**.
- Store its frequency as the **value**.
- Traverse the array again.
- Return the element whose frequency is `1`.

---

## What is a HashMap?

A HashMap stores data in the form of:

```text
Key → Value
```

For this problem:

```text
Number → Frequency
```

Example:

```text
4 → 1
1 → 2
2 → 2
```

---

## Algorithm

1. Create an empty HashMap.
2. Traverse the array.
3. Increase the frequency of each element.
4. Traverse the array again.
5. If the frequency of an element is `1`, return it.

---

## Java Code

```java
import java.util.HashMap;

public static int singleNumber(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();

    // Store frequency
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Find element with frequency 1
    for (int num : nums) {
        if (map.get(num) == 1) {
            return num;
        }
    }

    return -1;
}
```

---

## Explanation

### Create HashMap

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Creates an empty HashMap.

The key is the array element.

The value is its frequency.

---

### Traverse Array

```java
for (int num : nums)
```

Visits every element of the array one by one.

Example:

```text
nums = [4,1,2]

Iteration 1 → num = 4

Iteration 2 → num = 1

Iteration 3 → num = 2
```

---

### Update Frequency

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

Meaning:

- Check if the numbers already exists.
- If it exists, get its frequency.
- If it does not exist, use `0`.
- Increase the frequency by `1`.
- Store the updated frequency back into the HashMap.

Equivalent code:

```java
int frequency = map.getOrDefault(num, 0);

frequency++;

map.put(num, frequency);
```

---

## Dry Run

Input

```text
nums = [4,1,2,1,2]
```

### After First Loop

| Number | Frequency |
|-------:|----------:|
| 4 | 1 |
| 1 | 2 |
| 2 | 2 |

### Second Loop

```text
Check 4 → Frequency = 1 ✅
```

Return

```text
4
```

---

## Time Complexity

```text
O(n)
```

- First traversal → O(n)
- Second traversal → O(n)

Overall:

```text
O(n)
```

---

## Space Complexity

```text
O(n)
```

Extra space is used to store the HashMap.

---

## Interview Points

- HashMap stores data as **Key → Value** pairs.
- Here, **Key = Number** and **Value = Frequency**.
- `getOrDefault()` prevents `null` values.
- Frequency counting using HashMap is a very common interview pattern.
- This solution is accepted on LeetCode.

---

## Key Takeaways

- Use a HashMap when you need to count frequencies.
- `map.put(key, value)` inserts or updates data.
- `map.get(key)` returns the value of a key.
- `map.getOrDefault(key, 0)` returns `0` if the key is not present.
- Traverse once to build the frequency table.
- Traverse again to find the element with frequency `1`.

---

## Pattern Learned

- HashMap
- Frequency Counting
- Key–Value Pair
- Array Traversal