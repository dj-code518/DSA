class Solution {
    int getBeauty(int[] freq){
        int maxfreq=0,minfreq=Integer.MAX_VALUE;
        for(int num:freq){
            if(num>0){
                maxfreq=Math.max(maxfreq,num);
                minfreq=Math.min(minfreq,num);
            }
        }
        return maxfreq-minfreq;
    }
    public int beautySum(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;
                res+=getBeauty(freq);
            }
        }
        return res;
    }
}