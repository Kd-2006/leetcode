// Last updated: 7/14/2026, 3:58:07 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> prefixSumMap = new HashMap<>();

        long sum = 0;
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (prefixSumMap.containsKey(nums[i] - k)) {
                maxSum = Math.max(maxSum, sum- prefixSumMap.get(nums[i] - k));
            }
             if (prefixSumMap.containsKey(nums[i] + k)) {
                maxSum = Math.max(maxSum, sum- prefixSumMap.get(nums[i] + k));
            }

            if (!prefixSumMap.containsKey(nums[i]) || prefixSumMap.get(nums[i])>(long)(sum- nums[i])) {
                prefixSumMap.put(nums[i], (long)(sum- nums[i]));
            }
        }
        return maxSum== Long.MIN_VALUE? 0 : maxSum;
    }
}