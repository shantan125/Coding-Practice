
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new TreeSet<>();
                for (int num : nums) {
            s.add(num);
        }
        int c = 0;
        for (Integer e : s) {
            nums[c] = e; 
            c++;
        }
        return c;
    }
}
