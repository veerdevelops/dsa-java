# LC122 - Best Time to Buy and Sell Stock II (Greedy)

## Problem

You are given an array where `prices[i]` represents the stock price on the `i-th` day.

Rules:
- You can buy and sell **multiple times**.
- You can hold **only one stock** at a time.
- You must **sell before buying again**.

---

# Intuition

Unlike LC121, we are allowed to make multiple transactions.

So instead of finding one maximum profit, we collect **every small profit**.

Example:

```text
prices = [7,1,5,3,6,4]
```

Transactions:

```text
Buy at 1
Sell at 5
Profit = 4

Buy at 3
Sell at 6
Profit = 3

Total Profit = 7
```

---

# Main Greedy Idea

If today's price is greater than yesterday's price,

then add the difference.

```java
if (prices[i] > prices[i - 1]) {
    totalProfit += prices[i] - prices[i - 1];
}
```

We simply collect every positive increase.

---

# Why Does It Work?

Example:

```text
prices = [1,2,3,4,5]
```

Method 1:

```text
Buy at 1
Sell at 5

Profit = 4
```

Method 2:

```text
2 - 1 = 1
3 - 2 = 1
4 - 3 = 1
5 - 4 = 1

Total = 4
```

Both methods give the same answer.

So collecting every positive increase is enough.

---

# Dry Run

```text
prices = [7,1,5,3,6,4]
```

| Yesterday | Today | Difference | Action | Total Profit |
|-----------|-------|------------|--------|--------------|
| 7 | 1 | -6 | Ignore | 0 |
| 1 | 5 | +4 | Add | 4 |
| 5 | 3 | -2 | Ignore | 4 |
| 3 | 6 | +3 | Add | 7 |
| 6 | 4 | -2 | Ignore | 7 |

Answer:

```text
7
```

---

# Algorithm

1. Start from index `1`.
2. Compare today's price with yesterday's price.
3. If today's price is greater,
   add the difference.
4. Ignore negative differences.
5. Return total profit.

---

# Java Code

```java
int totalProfit = 0;

for (int i = 1; i < prices.length; i++) {

    if (prices[i] > prices[i - 1]) {
        totalProfit += prices[i] - prices[i - 1];
    }
}

System.out.println(totalProfit);
```

---

# Time Complexity

```text
O(n)
```

---

# Space Complexity

```text
O(1)
```

---

# Pattern to Remember

## LC53 - Kadane's Algorithm

```text
Keep positive running sum.
Discard negative running sum.
```

---

## LC121 - Stock Buy & Sell I

```text
Keep the minimum price seen so far.
```

---

## LC122 - Stock Buy & Sell II

```text
Take every positive increase.
```

Rule:

```text
If today's price > yesterday's price

Add today's price - yesterday's price
```

---

# Interview Keyword

**Greedy Algorithm**

Local Decision:

> Take every profitable opportunity.

Global Result:

> Maximum possible profit.

---

# Revision Points

- Multiple transactions are allowed.
- Hold only one stock at a time.
- Add only positive differences.
- Ignore losses.
- Traverse the array only once.
- Greedy solution.
- Time: O(n)
- Space: O(1)