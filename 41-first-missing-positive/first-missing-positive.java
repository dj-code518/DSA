class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            if(n>0){
                set.add(n);
            }
        }
        int i=1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }
}