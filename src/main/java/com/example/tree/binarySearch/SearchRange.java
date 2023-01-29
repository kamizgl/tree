package com.example.tree.binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SearchRange {
    public int searchFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if(mid==0|| nums[mid-1]!=target){
                    return mid;
                }else {
                    right = mid-1;
                }

            }else if(nums[mid]<target){
                left=mid+1;
            } else if (nums[mid] > target) {
                right =mid -1;
            }
        }
        return  -1;
    }

    public int searchLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                if(mid==nums.length-1|| nums[mid+1]!=target){
                    return mid;
                }else {
                    left = mid+1;
                }
            }else if(nums[mid]<target){
                left=mid+1;
            } else if (nums[mid] > target) {
                right =mid -1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        int[] ints = {5,7,7,8,8,10};


//        int i = searchRange.searchFirst(ints, 8);
//        int i1 = searchRange.searchLast(ints, 8);
//        System.out.println(i1);
//         Random rand = new Random();

//        int target = rand.nextInt(2) ;
//        System.out.println(target);
        int[] left = {1,5,7};

        int i2 = searchRange.left_bound(left, 2);
        int i4 = searchRange.left_bound2(left, 2);
        int i3 = searchRange.right_bound(left, 2);




        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }



    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 别返回，锁定左侧边界
                right = mid - 1;
            }
        }
        // 判断 target 是否存在于 nums 中
        // 此时 target 比所有数都大，返回 -1
        if (left == nums.length) return -1;
        // 判断一下 nums[left] 是不是 target
        return nums[left] == target ? left : -1;
    }

    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 这里改成收缩左侧边界即可
                left = mid + 1;
            }
        }
        // 最后改成返回 left - 1
        return left;
    }
    int left_bound2(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                // 当找到 target 时，收缩右侧边界
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left;
    }
}
