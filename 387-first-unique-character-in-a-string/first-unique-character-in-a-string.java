class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(char c:s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(mpp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}