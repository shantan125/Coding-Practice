
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<>();
        
        // Add all elements to the TreeSet (automatically removes duplicates and sorts)
        for (int num : nums) {
            s.add(num);
        }
        
        // Transfer unique elements back to the original array `nums`
        int c = 0;
        for (Integer e : s) {
            nums[c] = e; // Use assignment operator = instead of ==
            c++;
        }
        
        return c; // Return the length of the array with unique elements
    }
}
