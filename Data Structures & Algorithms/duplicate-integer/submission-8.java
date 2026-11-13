class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setOfNum = new HashSet<>();
        if(nums==null || !(nums.length>0)) return false;
        for(int num : nums){
            boolean result = setOfNum.add(num);
            if(!result) return true;
        }
        return false;
        
    }
}