class Solution {
    public int[] twoSum(int[] nums, int target) {
        //<Index,Value>
        Map<Integer,Integer> resMap = new HashMap<>();
        int[] arr = new int[2];

        for(int i =0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(resMap.containsKey(compliment)){
                return new int[]{resMap.get(compliment),i};
            }
             resMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
