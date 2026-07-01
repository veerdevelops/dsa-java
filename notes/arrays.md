# Arrays

## Techniques Learned

### 1. Linear Traversal

Used In:
- Largest Element
- Second Largest Element
- Check Sorted

Time Complexity:
O(n)

Space Complexity:
O(1)

---

### 2. Adjacent Comparison

Used In:
- Check if Array is Sorted
- Check if Array is Sorted and Rotated

Key Idea:
Compare current element with next element.

---

### 3. Circular Array

Key Formula

```java
nums[(i + 1) % nums.length]
```

Used In:
- LC 1752

Purpose:
Compare the last element with the first element.

---

### 4. Two Pointers

Slow Pointer
- Stores the last unique element.

Fast Pointer
- Traverses the entire array.

Used In:
- Remove Duplicates
- LC 26

Time Complexity:
O(n)

Space Complexity:
O(1)

---

## Problems Completed

### Striver

- Largest Element
- Second Largest Element
- Check if Array is Sorted
- Remove Duplicates from Sorted Array

### LeetCode

- LC 1929 - Concatenation of Array
- LC 1752 - Check if Array is Sorted and Rotated
- LC 26 - Remove Duplicates from Sorted Array
- LC 414 - Third maximum number 

---

## Common Mistakes

- Using `i` instead of `i + 1`
- Forgetting `%` in circular arrays
- Returning `i` instead of `i + 1`
- Creating an extra array when not needed

---

## Revision Formula

Largest Element
→ Linear Traversal

Second Largest
→ Linear Traversal

Check Sorted
→ Adjacent Comparison

LC 1752
→ Circular Array

Remove Duplicates
→ Two Pointers