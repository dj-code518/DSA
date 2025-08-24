class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>mpp=new HashMap<>();
        mpp.put('I',1);
        mpp.put('V',5);
        mpp.put('X',10);
        mpp.put('L',50);
        mpp.put('C',100);
        mpp.put('D',500);
        mpp.put('M',1000);

        int result=0;
        for(int i=0;i<s.length();i++){
            int val=mpp.get(s.charAt(i));
            if(i+1<s.length() && val<mpp.get(s.charAt(i+1))){
                result-=val;
            }
            else{
                result+=val;
            }
        }
        return result;
    }
}