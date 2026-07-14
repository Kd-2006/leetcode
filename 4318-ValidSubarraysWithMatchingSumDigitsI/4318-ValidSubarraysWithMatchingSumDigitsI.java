// Last updated: 7/14/2026, 3:57:57 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum +=nums[j];
                long temp =sum;
                int last=(int)(temp%10);
                while(temp>=10){
                    temp /=10;
                }
                int first=(int)temp;
                if(first==x&&last==x){
                    count++;
                }
            }
        }
        return count;
        
    }
}