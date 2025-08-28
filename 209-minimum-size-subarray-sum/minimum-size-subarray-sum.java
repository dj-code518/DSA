class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlen=n+1;
        int left=0,sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];

            while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(minlen==n+1){
            return 0;
        }
        return minlen;
    }
}