class Solution {
    public void rotate(int[] nums, int k) {
            int n=nums.length;
        k=k%n;
        if(k<0){
            return;
        }
        if(n<0){
            return;
        }

        rotateArray(nums,0,n-1);
        rotateArray(nums,k,n-1);
        rotateArray(nums,0,k-1);
        
    }


    public void rotateArray(int nums[], int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}