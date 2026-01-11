class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i],i);
            }
            else{
                int pastIdx=mpp.get(nums[i]);
                if(Math.abs(pastIdx-i)<=k){
                    return true;
                }
                else{
                    mpp.put(nums[i],i);
                }
            }
        }
        return false;
    }
}