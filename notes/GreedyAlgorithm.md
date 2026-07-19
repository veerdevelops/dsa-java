# Greedy Algorithm

## What is a Greedy Algorithm?

A **Greedy Algorithm** is an algorithmic technique that solves a problem by making the **best possible choice at the current step**.

It focuses only on the present decision without worrying about future choices.

---

## Definition

A Greedy Algorithm chooses the **locally optimal solution** at every step with the hope of reaching the **globally optimal solution**.

---

## Simple Idea

```text
Choose the best option now
        ↓
Move forward
        ↓
Repeat until the problem is solved
```

---

## Real-Life Example

Suppose you are climbing a staircase.

At every step, you choose the path that helps you move upward the fastest.

You do not go back to change previous decisions.

This is a greedy approach.

---

## Characteristics

- Makes the best decision at the current step.
- Never revisits previous decisions.
- Usually very fast.
- Does not work for every problem.

---

## When Does Greedy Work?

Greedy works only when:

- The locally best choice leads to the globally best solution.
- The problem satisfies the **Greedy Choice Property**.

---

## Advantages

- Easy to implement.
- Fast execution.
- Uses less memory.
- Efficient for many optimization problems.

---

## Disadvantages

- Does not guarantee the correct answer for every problem.
- Sometimes a local optimum is not the global optimum.

---

## Common Greedy Problems

- Maximum Subarray (Kadane's Algorithm)
- Activity Selection
- Fractional Knapsack
- Jump Game
- Best Time to Buy and Sell Stock
- Huffman Coding

---

## Time Complexity

There is **no fixed time complexity** for Greedy Algorithms.

It depends on the specific problem.

Examples:

| Problem | Time Complexity |
|----------|-----------------|
| Kadane's Algorithm | O(n) |
| Activity Selection | O(n log n) |
| Fractional Knapsack | O(n log n) |

---

## Memory Trick

```text
Best choice now
        ↓
Move forward
        ↓
Never look back
```

---

## Interview Tip

A Greedy Algorithm **does not always give the correct answer**.

Before applying it, always check whether the problem satisfies the Greedy Choice Property.