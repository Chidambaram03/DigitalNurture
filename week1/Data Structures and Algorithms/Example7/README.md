# Financial Forecasting

## Recursion

Recursion is a technique where a method calls itself to solve a problem.

A recursive solution contains:

1. Base Case
   - Stops recursion.

2. Recursive Case
   - Calls itself with a smaller subproblem.

## Future Value Formula

Future Value = Present Value × (1 + Growth Rate)^Years

The recursive solution applies the growth rate year by year.

## Time Complexity

The recursive method performs one call per year.

Time Complexity: O(n)

Space Complexity: O(n)

where n = number of years.

## Optimization

For very large values of n:

- Use iteration instead of recursion.
- Use memoization to avoid repeated calculations.
- Use the direct mathematical formula:

Future Value = PV × (1 + r)^n

This gives O(1) computation.