class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int num:arr){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int freq:mpp.values()){
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}