class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int num:mpp.keySet()){
            if(mpp.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
}