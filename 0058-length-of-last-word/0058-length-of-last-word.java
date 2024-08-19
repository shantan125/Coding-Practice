class Solution {
    public int lengthOfLastWord(String str) {
        String[] words = str.split(" ");
        String lastword = words[words.length() - 1];
        return lastword.length();
    }
}
