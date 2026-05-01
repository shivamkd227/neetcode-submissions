class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setOfNum = new HashSet<>();
        if(nums==null || !(nums.length>0)) return false;
        for(int num : nums){
            if(!setOfNum.add(num)) return true;
        }
        return false;
        
    }
}