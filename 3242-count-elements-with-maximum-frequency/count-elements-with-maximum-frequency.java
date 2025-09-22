class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfreq=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
            maxfreq=Math.max(maxfreq,mpp.get(num));
        }
        int sum=0;
        for(int n:mpp.values()){
            if(n==maxfreq){
                sum+=n;
            }
        }
        return sum;
    }
}