class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }

        int maxsum=leftsum;
        int rightsum=0;
        for(int i=k-1,j=cardPoints.length-1;i>=0;i--,j--){
            leftsum-=cardPoints[i];
            rightsum+=cardPoints[j];

            maxsum=Math.max(maxsum,rightsum+leftsum);
        }
        return maxsum;

    }
}