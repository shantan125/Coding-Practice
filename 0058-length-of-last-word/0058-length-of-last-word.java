class Solution {
    public int lengthOfLastWord(String str) {
        String[] words = str.split(" ");
        int cnt = 0;
        for (String word : words) {
            cnt++;
        }
        String lastword = null;
        lastword = words[cnt - 1];
        return lastword.length();
    }
}