class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int second = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit >= max) {
                second = max;
                max = digit;
            } else if (digit > second) {
                second = digit;
            }

            n /= 10;
        }

        return max * second;
    }
}