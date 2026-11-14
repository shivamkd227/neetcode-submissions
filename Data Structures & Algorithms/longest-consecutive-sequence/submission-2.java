class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int max = 0;

        for(int num:nums){
            s.add(num);
        }

        for(int num:nums){
            //Sequnce start 
            if(!s.contains(num-1)){
                int len = 1;
                while(s.contains(num+len)){
                    len++;
                }
                max = Math.max(max,len);
            }
        }
        return max;
        
    }
}
