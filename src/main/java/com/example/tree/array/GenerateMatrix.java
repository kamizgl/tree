package com.example.tree.array;


import java.util.ArrayList;
import java.util.List;

public class GenerateMatrix {

    int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int up = 0, down = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int num = 1;
        while (num <= matrix.length * matrix[0].length) {
            // 开始跑上边边框，等到缩圈到 上边框和下边框一样了就结束了
            if (up <= down) {
                //从左边框开始 一直跑到右边框
                for (int j = left; j <= right; j++) {
                    matrix[up][j] = num++;
                }
                //上圈开始缩圈
                up++;
            }
            // 开始跑右边的边框
            if (left <= right) {
                //做上开始往下跑
                for (int i = up; i <= down; i++) {
                    matrix[i][right] = num++;
                }
                //右边框缩圈
                right--;
            }
            //开始跑下边框
            if (down >= up) {
                // 右边向左边跑
                for (int j = right; j >= left; j--) {
                    matrix[down][j] = num++;

                }
                //下边往上开始缩圈
                down--;
            }
            // 开始跑左边 啥时候停止 ，一直到左边和右边要合并了 这一层就结束了
            if (left <= right) {
                for (int i = down; i >= up; i--) {
                    matrix[i][left] = num++;
                }
                //向左边缩圈
                left++;
            }
        }
        return matrix;
    }
    public void reverseString(char[] s) {
        int l =0,r=s.length-1;
        while(l<r){
            char tmp = s[r];
            s[r] = s[l];
            s[l] =tmp;
            l++;
            r++;
        }
    }

    List<Integer> spiralOrder(int[][] matrix) {
        return null;
    }

    public static void main(String[] args) {
        GenerateMatrix generateMatr = new GenerateMatrix();
        int[][] matrix = generateMatr.generateMatrix(3);
        char tmp ='1';
    }
}
