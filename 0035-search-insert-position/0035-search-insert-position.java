

class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
       for (int num : nums) {
            list.add(num);
        } 

            Collections.sort(list);
        if (list.contains(target)) {
            return list.indexOf(target);
        } else {
            list.add(target);
            Collections.sort(list);
            return list.indexOf(target);
        }
    }
}
