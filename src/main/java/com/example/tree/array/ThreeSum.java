package com.example.tree.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    List<List<Integer>> res;
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return null;
        }
        res = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            //每次选定一个基准，并对后面的两个数求twoSum即可
            if(nums[i] > 0 ){
                break;
            }
            twoSum(nums,i,0 - nums[i]);
            //为了避免重复组合，只需要保证每一个组合的第一个数字不同
            //然而并不方便在循环开始时比较i 和 i-1的大小，所以在这里用while进行过滤
            while(i < nums.length - 1 && nums[i] == nums[i+1]){
                i++;
            }
        }
        return res;
    }

    public void twoSum(int[] nums, int index, int target){
        int left = index + 1;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else{
                res.add(Arrays.asList(nums[index], nums[left], nums[right]));
                //除了这一对，还有可能有其他对之和也是target
                //而且其他对有可能与现在的twoSum是重合的所以也要过滤掉
                while (right > left && nums[right] == nums[right - 1]) right--;
                while (right > left && nums[left] == nums[left + 1]) left++;
                //以上代码只是侦测到下一个元素跟自己不不同了，但是还是停留在当前位置，所以还得移动一次
                right--;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        var a = new int[]{-1,0,1,2,-1,-4};

        var b = new int[]{1,2,3,4};
        List<List<Integer>> lists = threeSum.threeSum(a);
//        List<Integer> integers = threeSum.twoSum(b, 5);
        System.out.println(lists);
    }

}
