class Solution {
    public boolean isAnagram(String s, String t) {
        if(s== null || t==null) return false;
        if(s.length() !=t.length()) return false;

        Map<Character,Integer> resMap = new HashMap<>();
        Map<Character,Integer> resMap2 = new HashMap<>();

        for(char ch : s.toCharArray()){
            Integer val = resMap.get(ch);
            if(val==null){
                resMap.put(ch,1);
            }else{
                int i = val+1;
                resMap.put(ch,i);
            }
        }

       for(char ch : t.toCharArray()){
            Integer val = resMap2.get(ch);
            if(val==null){
                resMap2.put(ch,1);
            }else{
                int i = val+1;
                resMap2.put(ch,i);
            }
        }
        
        for(Map.Entry<Character,Integer> entry : resMap.entrySet()){
            Integer j = resMap2.get(entry.getKey());
            if(j == null) return false;
            if(!entry.getValue().equals(j)) return false;
    }
    return true;
    }
}
