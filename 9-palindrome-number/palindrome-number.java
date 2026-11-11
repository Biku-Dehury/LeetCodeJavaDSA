class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers that end with 0 (except 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example, when the input is 12321, at the end of the loop we get x = 12, revertedNumber = 123,
        // so the middle digit doesn't matter in the comparison.
        return x == revertedNumber || x == revertedNumber / 10;
    }
}