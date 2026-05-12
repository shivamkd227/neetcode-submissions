class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] pre = new int[size];
        int[] post = new int[size];
        int[] res = new int[size];

        pre[0] = nums[0];
        post[size-1] = nums[size-1];

        for(int i = 1;i<size;i++){
            pre[i] = nums[i]*pre[i-1];
        }
        for(int i = size-2;i>-1;i--){
            post[i] = nums[i]*post[i+1];
        }
        res[0] = post[1];
        res[size-1] = pre[size-2];
         for(int i = 1;i<size-1;i++){
           res[i] = pre[i-1]*post[i+1];
        }

        return res;
    }
}  
