// Last updated: 7/14/2026, 3:57:53 PM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int maxLeft=nums[0];
            for(int j=k;j<n;j++){
                maxLeft=Math.max(maxLeft, nums[j-k]);
                maxSum=Math.max(maxSum,maxLeft+nums[j]);
            }
        return maxSum;
    }
}