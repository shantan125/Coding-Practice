class Solution {
    public int majorityElement(int[] nums) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> l = new HashMap<Integer, Integer>();

        // Iterate through the array and count the occurrences of each element
        for (int i = 0; i < nums.length; i++) {
            l.put(nums[i], l.getOrDefault(nums[i], 0) + 1);
        }

        // Calculate the threshold for the majority element
        int appears = nums.length / 2;

        // Iterate through the map to find the majority element
        for (Map.Entry<Integer, Integer> entry : l.entrySet()) {
            if (entry.getValue() > appears) {
                return entry.getKey();
            }
            
        }

        // The problem guarantees that a majority element always exists
        // So this line will never be reached
        return -1;
    }
}
