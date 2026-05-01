class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setOfNum = new HashSet<>();
        for(int num : nums){
            boolean result = setOfNum.add(num);
            if(!result) return true;
        }
        return false;
        
    }
}