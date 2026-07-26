class Solution {
    public int maxFrequency(int[] nums, int k) {
        // cost = target * windowsize - windowSum;
        // cost = nums[right] * (right - left + 1) - windowSum;
        Arrays.sort(nums);

        int left = 0;
        long windowSum = 0;
        int answer = 0;

        for(int right=0; right<nums.length; right++){
            windowSum+=nums[right];

            while((long) nums[right] * (right-left+1) - windowSum > k){
                windowSum-=nums[left];
                left++;
            }

            answer = Math.max(answer, right-left+1);
        }
        return answer;
    }
}