package recursion.fibonacci;

class Solution {
  static int nthFibonacciNumber(final int n) {
    if(n <= 2) {
      return 1;
    }
    return nthFibonacciNumber(n - 2) + nthFibonacciNumber(n - 1);
  }
}
