package com.example.tree.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * 思路 搞一个map 存key 是值，value是下标，每次遍历的时候把这个东西存起来。然后找目标数-当前数的值。是否能在map扎到。 找打了就返回两个下标
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.containsKey(target - nums[i])) {
                return new int[]{integerMap.get(target - nums[i]), i};
            }
            integerMap.put(nums[i], i);
        }
        return new int[0];
    }
}
