Problem:
Left Rotate Array by D Places (Brute Force)

Technique:
Temporary Array + Shifting

Steps:

1. Store first d elements in temp[].

2. Shift remaining elements left.

3. Copy temp[] to the last d positions.

Code Pattern:

temp = first d elements

Shift:
arr[i] = arr[i + d]

Copy Back:
arr[i] = temp[i - (n - d)]

Time Complexity:
O(n)

Space Complexity:
O(d)