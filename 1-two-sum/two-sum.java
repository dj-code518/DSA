class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            int needed=target-num;
            if(mpp.containsKey(needed)){
                return new int[] {mpp.get(needed),i};
            }
            mpp.put(num,i);
        }
        return new int[]{-1,-1};
    }
}