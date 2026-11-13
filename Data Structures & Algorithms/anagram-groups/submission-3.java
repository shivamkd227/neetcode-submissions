class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> returnList = new ArrayList<>();


        for(String str : strs){
            int[] lst = new int[26];
            for(char s : str.toCharArray()){
                lst[s-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(lst), k -> new ArrayList<>()).add(str);
        }
       for(List<String> value : map.values()){
            returnList.add(value);
       }
            return returnList;
    }
}
