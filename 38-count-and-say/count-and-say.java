class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String s="1";
        for(int i=2;i<=n;i++){
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(j+1)){
                    count++;
                }
                else{
                    sb.append(count).append(s.charAt(j));
                    count=1;
                }
            }
            sb.append(count).append(s.charAt(s.length()-1));
            s=sb.toString();
        }
        return s;
    }
}