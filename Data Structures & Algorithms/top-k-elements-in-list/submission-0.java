class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> resMap = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        int[] arr = new int[k];

        for(int i : nums){
            if(resMap.containsKey(i)){
                int count = resMap.get(i)+1;
                resMap.put(i,count);
            }else{
                resMap.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:resMap.entrySet()){
            lst.add(entry.getValue());
        }
        lst.sort(Collections.reverseOrder());
        lst = new ArrayList<>(lst.subList(0,k));
        Set<Integer> resSet = new HashSet<>(lst);
        int i =0;
        for(Map.Entry<Integer,Integer> e : resMap.entrySet()){
            if(resSet.contains(e.getValue())){
                arr[i]=e.getKey();
                i++;
            }
        }
return arr;



    }
}
