# HashSet Notes (Java)

## What is HashSet?

A `HashSet` is a collection used to store **unique elements**.

Unlike a `HashMap`, it does not store data in:

    key → value

It stores only the elements:

    {1, 2, 3, 4, 5}

---

## Creating a HashSet

```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();