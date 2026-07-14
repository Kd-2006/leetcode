// Last updated: 7/14/2026, 3:57:49 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle=nums[nums.length/2];
        int count=0;
        for(int num:nums){
            if(num==middle){
                count++;
            }
        }
        return count==1;
        
    }
}