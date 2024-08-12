import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        // Use LinkedHashMap to maintain order of keys
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder result = new StringBuilder();
        
        // Convert number to Roman numeral
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String roman = entry.getValue();
            while (num >= value) {
                result.append(roman);
                num -= value;
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 1994; // Example number
        String roman = solution.intToRoman(number);
        System.out.println("The Roman numeral for " + number + " is: " + roman);
    }
}
