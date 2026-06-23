# E-commerce Platform Search Function

## Big O Notation

Big O notation describes the performance of an algorithm as the input size grows.

It helps:
- Measure efficiency
- Compare algorithms
- Predict scalability

## Search Scenarios

### Best Case
Element found immediately.

### Average Case
Element found somewhere in the middle.

### Worst Case
Element found at the end or not found.

## Algorithms Implemented

### Linear Search
Checks each element one by one.

Time Complexity:
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### Binary Search
Works on a sorted array by repeatedly dividing the search space.

Time Complexity:
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Comparison

| Algorithm | Best | Average | Worst |
|------------|------|----------|--------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Conclusion

Binary Search is more suitable for large e-commerce platforms because it provides much faster search performance on sorted data.