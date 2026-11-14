class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f = 0, e = numbers.length - 1;
        while(true){
            int sum = numbers[f]+numbers[e];
            if(sum==target)
                return new int[]{f+1,e+1};
            else if(sum>target) e--;
            else f++;        
        }
        
    }
}
