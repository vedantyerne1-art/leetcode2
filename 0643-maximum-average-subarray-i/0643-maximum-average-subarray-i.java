class Solution {
    public double findMaxAverage(int[] nums, int k) {

        long sum=0;

        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }

       long maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]; // to remove the 1 st element 
            sum=sum+nums[i];  // to add the element 

            if(sum>maxsum){
                maxsum=sum;
            }
        }

        return (double) maxsum/k;


        
    }
}