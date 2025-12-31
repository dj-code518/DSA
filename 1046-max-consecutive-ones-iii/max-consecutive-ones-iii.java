class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0,maximum=0;
        int zero=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            maximum=Math.max(maximum,right-left+1);
        }
        return maximum;
    }
}