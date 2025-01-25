class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxConsOne=0;

        int currCount=0;
        for(int i : nums){
            if(i==1){
                currCount++;
                maxConsOne=Math.max(maxConsOne, currCount);
            }
            else{
                currCount=0;
            }

        }
        return maxConsOne;
    }
}