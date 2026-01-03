class Solution {
    public int numOfWays(int n) {
        long c3 = 6L;  // 3! ways for row with 3 distinct colors
        long c2 = 6L;  // 3*2 ways for row with 2 colors (ABA)
        long mod = 1000000007L;

        for (int i = 2; i <= n; i++) {
            long temp = c3;
            c3 = (2 * c2 + 2 * c3) % mod;
            c2 = (2 * temp + 3 * c2) % mod;
        }

        return (int)((c2 + c3) % mod);
    }
}