class Solution {
    public int search(int[] nums, int target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                res = i;
                break;
            } else{
                res = -1;
            }
        }
        return res;
    }
}