package com.example.tree.array;

/**
 *  两数之和 II - 输入有序数组
 *  方法 搞两个指针 ，一个在头一个尾巴，相加比较一下是否小于目标值，
 *  如果小于那么就挪动 头指针，然后再加，如果大于就挪动尾指针，继续循环，最终就能得到两个小标
 */
public class TwoSum2 {

    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                break;
            }
        }
        return new int[]{i + 1, j + 1};
    }


    /**
     * [2,7,11,15]
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int[] ints1 = twoSum(ints, 9);
        System.out.println(ints1[0]);
        System.out.println(ints1[1]);
    }
}
