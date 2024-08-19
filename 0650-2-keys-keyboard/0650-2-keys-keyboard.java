class Solution {
    public int minSteps(int n) {
        int steps = 0;
        
        // Iterate over possible factors
        for (int i = 2; i <= n; i++) {
            // While i is a divisor of n
            while (n % i == 0) {
                // Add the factor i to the steps
                steps += i;
                
                // Divide n by i
                n /= i;
            }
        }
        
        return steps;
    }
}
