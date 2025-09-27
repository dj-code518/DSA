class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        int maxsum=leftsum,rightsum=0;
        for(int i=0;i<k;i++){
            leftsum-=cardPoints[k-1-i];
            rightsum+=cardPoints[n-1-i];
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}