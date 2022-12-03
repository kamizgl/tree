package com.example.tree.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class SpiralOrder {

    List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int upper_bound = 0, lower_bound = m - 1;
        int left_bound = 0, right_bound = n - 1;
        List<Integer> res = new LinkedList<>();
        // res.size() == m * n 则遍历完整个数组
        while (res.size() < m * n) {
            if (upper_bound <= lower_bound) {
                // 在顶部从左向右遍历
                for (int j = left_bound; j <= right_bound; j++) {
                    res.add(matrix[upper_bound][j]);
                }
                // 上边界下移
                upper_bound++;
            }

            if (left_bound <= right_bound) {
                // 在右侧从上向下遍历
                for (int i = upper_bound; i <= lower_bound; i++) {
                    res.add(matrix[i][right_bound]);
                }
                // 右边界左移
                right_bound--;
            }

            if (upper_bound <= lower_bound) {
                // 在底部从右向左遍历
                for (int j = right_bound; j >= left_bound; j--) {
                    res.add(matrix[lower_bound][j]);
                }
                // 下边界上移
                lower_bound--;
            }

            if (left_bound <= right_bound) {
                // 在左侧从下向上遍历
                for (int i = lower_bound; i >= upper_bound; i--) {
                    res.add(matrix[i][left_bound]);
                }
                // 左边界右移
                left_bound++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        // 上下左右的边界

        int[][] matrix = new int[2][2];
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        //定义一个list
        List<Integer> res = new ArrayList<>();

        //循环开始 循环的内容是res.size == 二维数组的大小
        while (res.size() < matrix.length * matrix[0].length) {
            // 开始跑上边边框，等到缩圈到 上边框和下边框一样了就结束了
            if (up <= down) {
                //从左边框开始 一直跑到右边框
                for (int j = left; j <= right; j++) {
                    res.add(matrix[up][j]);
                }
                //上圈开始缩圈
                up++;
            }
            // 开始跑右边的边框
            if (left <= right) {
                //做上开始往下跑
                for (int i = up; i <= down; i++) {
                    res.add(matrix[i][right]);
                }
                //右边框缩圈
                right--;
            }
            //开始跑下边框
            if (down >= up) {
                // 右边向左边跑
                for (int j = right; j >= left; j--) {
                    res.add(matrix[down][j]);
                }
                //下边往上开始缩圈
                down--;
            }
            // 开始跑左边 啥时候停止 ，一直到左边和右边要合并了 这一层就结束了
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    res.add(matrix[i][left]);
                }
                //向左边缩圈
                left++;
            }
        }
    }
}
