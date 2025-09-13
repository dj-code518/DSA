class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=0;i<=n-3;i++){
            int a=nums[i];
            int b=nums[i+1];
            int c=nums[i+2];
            if(b==2*(a+c)){
                count++;
            }
        }
        return count;
    }
}