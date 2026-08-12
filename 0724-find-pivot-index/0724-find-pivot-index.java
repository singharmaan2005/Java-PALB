class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int totalMax = 0;

        for(int i = 0; i < nums.length; i++) {
            totalMax += nums[i];
        }

        rightsum = totalMax;

        for(int j = 0; j < nums.length; j++) {
            rightsum -= nums[j];

            if(rightsum == leftsum) {
                return j;
            } else {
                leftsum += nums[j];
            }
        }
        return -1;
    }
}