class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; //Edge case : if array size is 1

        int jumps = 0, maxReach = 0, currentEnd = 0;

        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]); 

            if (i == currentEnd) { 
                jumps++;
                currentEnd = maxReach;
                
                if (currentEnd >= n - 1) break;
            }
        }

        return jumps;
    }
}