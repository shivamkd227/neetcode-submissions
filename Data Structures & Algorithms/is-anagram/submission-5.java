class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chh = new int[26];
        for(char ch : s.toCharArray()) chh[ch-'a']++;
        for(char ch : t.toCharArray()) chh[ch-'a']--;
        for(int ch : chh){
            if(ch!=0) return false;
        }
        return true;

    }
}
