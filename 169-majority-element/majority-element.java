class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            mpp.put(num,mpp.getOrDefault(num,0)+1);

            if(mpp.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}