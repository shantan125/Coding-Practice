import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            list.add(num);
        }
        Collections.sort(list);  

        for (int i = 0; i < nums.length; i++) {
            boolean isRotation = true;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[(i + j) % nums.length] != list.get(j)) {
                    isRotation = false;
                    break;
                }
            }
            if (isRotation) {
                return true;
            }
        }
        return false; 
    }
}
