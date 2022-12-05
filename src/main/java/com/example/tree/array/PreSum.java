package com.example.tree.array;

public class PreSum {


    private int[] preSum;

    public void preSum(int[] nums) {
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    /**
     *
     * @param left
     * @param right
     * @return
     */
    public int sumRange(int left, int right) {
        return preSum[right+1] - preSum[left];
    }
}
