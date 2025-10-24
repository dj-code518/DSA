class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        mpp.put(0,1);
        int count=0;
        int prefixsum=0;
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];

            if(mpp.containsKey(prefixsum-k)){
                count+=mpp.get(prefixsum-k);
            }
            mpp.put(prefixsum,mpp.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}