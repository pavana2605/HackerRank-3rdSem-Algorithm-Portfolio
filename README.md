# HackerRank 3rd Semester Algorithm Portfolio

## Student Details

* **Name:** Pavana M
* **USN:** R25EF179
* **Semester:** 3rd Semester
* **Course:** Computer Science and Engineering
* **Programming Language:** Java

## Profile Links

* **HackerRank Profile:** https://www.hackerrank.com/profile/pavana260507
* **GitHub Repository:** https://github.com/pavana2605/HackerRank-3rdSem-Algorithm-Portfolio

## Introduction

This portfolio presents five algorithmic problems solved using Java as part of the 3rd Semester HackerRank Algorithms and GitHub Coding Portfolio activity. It demonstrates problem-solving skills, sorting, searching, greedy techniques, array operations, and algorithm efficiency analysis.

## Problem Solutions and Analysis

| No. | Problem                                      | Approach                                                              | Time Complexity | Auxiliary Space                            |
| --- | -------------------------------------------- | --------------------------------------------------------------------- | --------------- | ------------------------------------------ |
| 1   | Mini-Max Sum                                 | Find minimum and maximum values and calculate sums                    | O(N)            | O(1)                                       |
| 2   | Birthday Cake Candles                        | Find maximum height and count its occurrences                         | O(N)            | O(1)                                       |
| 3   | Insertion Sort – Part 1                      | Shift elements to insert the value in the correct position            | O(N)            | O(1)                                       |
| 4   | Intro to Tutorial Challenges (Binary Search) | Repeatedly divide the sorted array search range in half               | O(log N)        | O(1)                                       |
| 5   | Mark and Toys                                | Sort prices and greedily purchase the cheapest toys within the budget | O(N log N)      | O(1) auxiliary, excluding sorting overhead |

## Problem Details

### 1. Mini-Max Sum

**Approach:** Calculate the total sum of the array, then subtract the maximum value to get the minimum sum and subtract the minimum value to get the maximum sum.

**Time Complexity:** O(N)

**Auxiliary Space:** O(1)

### 2. Birthday Cake Candles

**Approach:** Find the tallest candle and count how many candles have that maximum height.

**Time Complexity:** O(N)

**Auxiliary Space:** O(1)

### 3. Insertion Sort – Part 1

**Approach:** Store the last element, shift larger elements one position to the right, and insert the stored element into its correct position.

**Time Complexity:** O(N) for this specific single-pass insertion operation.

**Auxiliary Space:** O(1)

### 4. Intro to Tutorial Challenges

**Approach:** Apply binary search on the sorted array. Compare the target with the middle element and reduce the search range until the target is found.

**Time Complexity:** O(log N)

**Auxiliary Space:** O(1)

### 5. Mark and Toys

**Approach:** Sort the toy prices in ascending order and purchase the cheapest toys as long as the total cost does not exceed the budget.

**Time Complexity:** O(N log N)

**Auxiliary Space:** O(1) auxiliary, excluding sorting overhead.

## Challenge Links

* [Mini-Max Sum](https://www.hackerrank.com/challenges/mini-max-sum/problem)
* [Birthday Cake Candles](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)
* [Insertion Sort – Part 1](https://www.hackerrank.com/challenges/insertionsort1/problem)
* [Intro to Tutorial Challenges](https://www.hackerrank.com/challenges/tutorial-intro/problem)
* [Mark and Toys](https://www.hackerrank.com/challenges/mark-and-toys/problem)

## Evidence

Screenshots of accepted HackerRank submissions and any earned badges will be included in the final PDF report.

## Reflection

Through this activity, I developed a better understanding of algorithmic problem-solving using Java. Solving Mini-Max Sum and Birthday Cake Candles helped me improve my skills in array traversal, minimum and maximum tracking, and counting occurrences. Insertion Sort – Part 1 taught me how shifting elements can be used to maintain an ordered sequence efficiently.

The binary-search challenge introduced me to the divide-and-conquer approach. By repeatedly reducing the search range, I learned how to achieve logarithmic time complexity instead of checking every element sequentially. Mark and Toys helped me understand greedy algorithms, where choosing the cheapest available options first leads to the maximum number of purchases within a fixed budget.

I also learned to analyze time and auxiliary space complexity, compare algorithmic approaches, and organize source code in a structured GitHub repository. This activity strengthened my confidence in implementing algorithms, testing solutions, and documenting my work for future projects and technical interviews.
