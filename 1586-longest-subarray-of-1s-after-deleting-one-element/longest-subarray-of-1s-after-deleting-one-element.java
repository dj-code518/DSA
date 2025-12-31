class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0,maxi=0;
        int zero=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zero++;
            }
            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            maxi=Math.max(maxi,right-left);
        }
        return maxi;
    }
}