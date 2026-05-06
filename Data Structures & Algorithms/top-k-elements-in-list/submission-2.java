class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> resMap = new HashMap<>();

        for(int i : nums){
            resMap.put(i,resMap.getOrDefault(i,0)+1);
        }

        List<List<Integer>> bucket = new ArrayList<>();
        for(int i = 0; i < nums.length + 1; i++){
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> e : resMap.entrySet()){
            int num = e.getKey();
            int frq = e.getValue();
            bucket.get(frq).add(num);
        }

        int[] arr = new int[k];
        int idx = 0;

        for(int i = bucket.size() - 1; i >= 0; i--){
            for(Integer j : bucket.get(i)){
                arr[idx] = j;
                idx++;
                if(idx == k) return arr;
            }
        }

        return arr;
    }
}