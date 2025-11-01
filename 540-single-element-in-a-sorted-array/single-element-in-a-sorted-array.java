class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int key:mpp.keySet()){
            if(mpp.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}