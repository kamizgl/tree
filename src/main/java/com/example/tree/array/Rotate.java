package com.example.tree.array;

/**
 * 48. 旋转图像
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 *
 */
public class Rotate {

    public static void main(String[] args) {
        int[][] matirix = new int[2][2];
        //先沿着对角线转一下
        int n = matirix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matirix[i][j];
                matirix[i][j] = matirix[j][i];
                matirix[j][i] =tmp;

            }
        }

        //再把每一行的数字给反过来。用双指针

        for (int[] ints : matirix) {
            int i =0;
            int j = ints.length - 1;
            while (j > i) {
                //换起来
                int tmp = ints[i];
                ints[i] = ints[j];
                ints[j ]= tmp;
                i++;
                j--;
            }
        }
    }


    // 将二维矩阵原地顺时针旋转 90 度
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 先沿对角线镜像对称二维矩阵
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // swap(matrix[i][j], matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 然后反转二维矩阵的每一行
        for (int[] row : matrix) {
            reverse(row);
        }
    }

    // 反转一维数组
    void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (j > i) {
            // swap(arr[i], arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }





}
