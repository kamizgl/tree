package com.example.tree.array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * https://www.bilibili.com/video/BV12m4y1D7JE/?spm_id_from=333.337.search-card.all.click&vd_source=934832b478365634a2299068a760bd56
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            //如果f指针遇到了0 f往前推，s不动
            //如果f指针不是0 那么就把f指针的值赋值给s指针 并且s指针往前推
            if (nums[fast] == 0) {
                fast++;
            }else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
