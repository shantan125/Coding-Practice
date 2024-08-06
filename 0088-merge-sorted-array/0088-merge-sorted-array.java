import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create an ArrayList to store the merged elements
        List<Integer> list = new ArrayList<>();

        // Add elements from nums1 (up to m) to the list
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }

        // Add elements from nums2 (up to n) to the list
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }

        // Sort the list
        Collections.sort(list);

        // Copy sorted elements back to nums1
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }
}
