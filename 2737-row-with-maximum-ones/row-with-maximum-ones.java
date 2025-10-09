class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int maxrow=-1;
        int maxcnt=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>maxcnt){
                maxcnt=count;
                maxrow=i;
            }
        }
        return new int[]{maxrow,maxcnt};
    }
}