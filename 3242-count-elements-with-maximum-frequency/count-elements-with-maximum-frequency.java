class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int maxfreq=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            maxfreq=Math.max(maxfreq,count);
        }
        int total=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==maxfreq){
                total++;
            }
        }
        return total;
    }
}