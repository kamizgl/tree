package com.example.tree.array;

/**
 * 删除有序数组中的重复项
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        //index表示下前index+1个元素不重复，当只有一个即index=0时不用考虑去重
        int index = 0;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                //判断索引为index的元素是否与nums数组中index后面的元素相等，如果不相等将元素赋给下标为index的下一个元素（index—+1）,index++判断下一个
                nums[index + 1] = nums[i];//第一个元素index=0 还为初始元素
                index++;
            }
        }
        return index + 1;//数组新长度
    }

    /**
     * 删除重复的元素，首先搞个两个指针 第一个从0开始。第二个从1开始，。当他们值不一样的时候 第一个指针就一直往前推，并且把第一个指针的值赋给第一个指针，如果一样的时候，第一个指针就在原地啥也不干，第二个指针继续往前推
     * https://www.bilibili.com/video/BV125411f7vN/?spm_id_from=333.337.search-card.all.click&vd_source=934832b478365634a2299068a760bd56
     * @param nums
     * @return
     */
    public int removeDuplicates2(int[] nums) {
        int index = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index +1;
    }

    public int removeDuplications3(int[] nums) {
        //定义两个指针
        int index = 0;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }
}
