class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);
        int f = 0;
        int end = s.length()-1;
        while(end>f){
            if(s.charAt(f)!=s.charAt(end)){
                System.out.println(f+":"+end);
                    return false;
            } 
            f++;
            end--;
        }
        return true;
        
    }
}
