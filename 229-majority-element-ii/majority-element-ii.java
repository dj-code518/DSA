class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer>res=new ArrayList<>();
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int num:mpp.keySet()){
            if(mpp.get(num)>n/3){
                res.add(num);
            }
        }
        return res;
    }
}