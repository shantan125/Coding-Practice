class Solution {
    public int minSteps(int n) {
        int operations = 0;

        for (int factor = 2; factor <= n; factor++) {
            while (n % factor == 0) {
                operations += factor;

                n /= factor;
            }
        }

        return operations;
    }
}
