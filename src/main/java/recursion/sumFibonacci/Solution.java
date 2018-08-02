package recursion.sumFibonacci;

class Solution {
  static int sumFibonacci(final int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return sumFibonacci(n - 2) + sumFibonacci(n - 1) + 1;
  }
}
