# Boyer-Moore Voting Algorithm

## 📌 What is Boyer-Moore?

The Boyer-Moore Voting Algorithm is an **optimal algorithm** used to find the **Majority Element** in an array.

A **Majority Element** is an element that appears **more than n/2 times**.

Example:

```text
nums = [2,2,1,1,1,2,2]

2 appears 4 times

n = 7

n/2 = 3

4 > 3

Answer = 2
```

---

# Time Complexity

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | O(n²) | O(1) |
| HashMap | O(n) | O(n) |
| Boyer-Moore | O(n) | O(1) ⭐ |

---

# Core Idea

Different elements **cancel each other**.

```text
Same Element
↓

count++

Different Element
↓

count--

count becomes 0
↓

Choose a new candidate
```

Since the majority element appears **more than half of the array**, it can never be completely cancelled.

It will always remain the final candidate.

---

# Variables Used

```java
int candidate = 0;
int count = 0;
```

### candidate

Stores the current majority candidate.

### count

Keeps track of the vote count.

---

# Algorithm

For every element in the array:

### Step 1

If

```java
count == 0
```

make the current element the new candidate.

```java
candidate = num;
```

---

### Step 2

If

```java
num == candidate
```

Increase count.

```java
count++;
```

---

### Step 3

Else

Decrease count.

```java
count--;
```

---

# Dry Run

Array

```text
[2,2,1,1,1,2,2]
```

| Number | Candidate | Count |
|---------|-----------|------:|
|2|2|1|
|2|2|2|
|1|2|1|
|1|2|0|
|1|1|1|
|2|1|0|
|2|2|1|

Final Candidate

```text
2
```

---

# Why Does It Work?

Imagine every different element cancels one occurrence of the candidate.

```text
2 vs 1

↓

Both Cancel
```

Since the majority element appears **more than n/2 times**, there are not enough different elements to cancel all of its occurrences.

Therefore, it survives until the end.

---

# Java Code

```java
public int majorityElement(int[] nums) {

    int candidate = 0;
    int count = 0;

    for (int num : nums) {

        if (count == 0) {
            candidate = num;
        }

        if (num == candidate) {
            count++;
        } else {
            count--;
        }
    }

    return candidate;
}
```

---

# Complexity

**Time Complexity**

```text
O(n)
```

**Space Complexity**

```text
O(1)
```

---

# Interview Tip

Remember this pattern:

```text
count == 0

↓

Choose Candidate

↓

Same

↓

count++

↓

Different

↓

count--
```

This is one of the most famous interview algorithms and is frequently asked in coding interviews.