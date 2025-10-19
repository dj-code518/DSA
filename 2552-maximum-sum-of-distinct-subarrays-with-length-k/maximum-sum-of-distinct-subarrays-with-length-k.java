class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        long sum=0,maxsum=0;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            sum+=nums[i];

            if(i>=k){
                int j=nums[i-k];
                sum-=j;
                mpp.put(j,mpp.get(j)-1);
                if(mpp.get(j)==0){
                    mpp.remove(j);
                }
            }
            if(i>=k-1 && mpp.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}