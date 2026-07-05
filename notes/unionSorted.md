# Union of Two Sorted Arrays

## Problem Statement

Given two **sorted arrays**, return their **union**.

The union should:
- Contain only **unique** elements.
- Be in **sorted order**.

---

## Example

### Input

```text
arr1 = [1,2,2,3,4]
arr2 = [2,3,5]
```

### Output

```text
[1,2,3,4,5]
```

---

## Approach (Optimal - Two Pointers)

Since both arrays are already sorted:

- Use two pointers `i` and `j`.
- Compare elements of both arrays.
- Add the smaller element.
- If both elements are equal, add it only once.
- Before adding any element, check whether it is already the last element in the answer list.
- After one array finishes, copy the remaining elements of the other array.

---

## Algorithm

1. Create two pointers `i` and `j`.
2. Create an empty `ArrayList` to store the answer.
3. Traverse both arrays together.
4. Compare `arr1[i]` and `arr2[j]`.
5. Add the smaller element if it is not already present.
6. If both elements are equal, add it only once and move both pointers.
7. After one array finishes, copy the remaining elements.
8. Return the answer.

---

## Java Code

```java
import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {

                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }

                i++;

            } else {

                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }

                j++;
            }
        }

        while (i < n) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }

            i++;
        }

        while (j < m) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }

            j++;
        }

        return union;
    }
}
```

---

## Dry Run

```text
arr1 = [1,2,2,3,4]
arr2 = [2,3,5]
```

| arr1[i] | arr2[j] | Added | Result |
|---------:|---------:|:-----:|--------|
| 1 | 2 | 1 | [1] |
| 2 | 2 | 2 | [1,2] |
| 2 | 3 | Skip (duplicate) | [1,2] |
| 3 | 3 | 3 | [1,2,3] |
| 4 | 5 | 4 | [1,2,3,4] |
| - | 5 | 5 | [1,2,3,4,5] |

---

## Why do we check?

```java
union.isEmpty() || union.get(union.size() - 1) != value
```

### Explanation

- If the answer list is empty, add the element.
- Otherwise, compare the current element with the **last element** of the answer list.
- If both are different, add the element.
- If they are the same, skip it.

This prevents duplicates.

---

## Why do we use `&&`?

```java
while(i < n && j < m)
```

We compare elements from **both arrays**.

If one array finishes, there is nothing left to compare.

Using `||` may access an invalid index and cause:

```text
ArrayIndexOutOfBoundsException
```

The remaining elements are handled using two separate `while` loops.

---

## Time Complexity

- **O(n + m)**

Both arrays are traversed only once.

---

## Space Complexity

- **O(n + m)**

Extra space is used to store the union.

---

## Interview Points

- Uses the **Two Pointer** technique.
- Works only because both arrays are **sorted**.
- Duplicates are avoided by comparing with the **last inserted element**.
- More efficient than using nested loops.
- Commonly asked in coding interviews.

---

## Key Takeaways

- Two pointers (`i` and `j`) traverse both arrays.
- Always add the smaller element.
- If elements are equal, add only once.
- Compare with the **last element of the answer** to avoid duplicates.
- After one array ends, copy the remaining elements.

---

## Pattern Learned

- Two Pointer Technique
- Merge Process (similar to Merge Sort)
- Duplicate Handling