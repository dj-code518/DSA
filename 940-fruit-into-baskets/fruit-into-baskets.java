class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left=0,maxlen=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int right=0;right<n;right++){
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);

            while(mpp.size()>2){
                mpp.put(fruits[left],mpp.get(fruits[left])-1);
                if(mpp.get(fruits[left])==0){
                    mpp.remove(fruits[left]);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}