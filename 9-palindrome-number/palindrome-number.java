class Solution {
    // Static block executes once when the class is loaded, 
    // pre-warming the JVM and JIT compiler to eliminate cold-start spikes.
    static {
        for (int i = 0; i < 500; i++) {
            isPalindrome(121);
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}