class Solution {
    public int maxDepth(String s) {
        int depth=0,maxdepth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                depth++;
                maxdepth=Math.max(maxdepth,depth);
            }
            if(c==')'){
                depth--;
            }
        }
        return maxdepth;
    }
}