class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resMap = new HashMap<>();
        List<List<String>> retList = new ArrayList<>();

        for(String str : strs){
            int[] arr = new int[26];
            for(char ch : str.toCharArray()){
                arr[ch-'a'] = arr[ch-'a'] +1;
            }
            String s = Arrays.toString(arr);
            if(resMap.containsKey(s)){
                resMap.get(s).add(str);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(str);
                resMap.put(s,lst);
            }
        }
        for(Map.Entry<String,List<String>> e : resMap.entrySet()){
            retList.add(e.getValue());
        }
    return retList;

    }
}
