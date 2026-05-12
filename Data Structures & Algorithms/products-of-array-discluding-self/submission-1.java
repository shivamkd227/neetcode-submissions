class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int totalSum = 1;
        int zeroCount = 0;
        int zeroIdx = 0;
        int[] arr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                zeroIdx = i;
            }else{
                totalSum = totalSum*nums[i];
            }
        }
        if(zeroCount>0){
            if(zeroCount==1) {
                arr[zeroIdx] = totalSum;
            }
        }else{
        for(int i = 0;i<nums.length;i++){
            arr[i] = totalSum/nums[i];
        }
        }
        return arr;
    }
}  
