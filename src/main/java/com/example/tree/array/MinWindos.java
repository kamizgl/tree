package com.example.tree.array;

import java.util.HashMap;
import java.util.Map;

/**
 *最小覆盖子串
 */
public class MinWindos {

    public String minWindow(String s, String t) {

        Map<Character, Integer> window = new HashMap(); // 存储当前窗口中字符及其个数
        Map<Character, Integer> need = new HashMap(); // 存储字符串t中字符及其个数

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1); // 存放字符串t
        }

        int left = 0, right = 0; // 窗口左右指针(左闭右开)
        int start = 0, len = Integer.MAX_VALUE; // 存储最终结果的起始下标与长度.
        int valid = 0; // 表示window中包含need中字符的个数
        while (right < s.length()) {
            char ch = s.charAt(right); // 当前位置字符
            right++; // 由于是左闭右开[0,0)，最开始时是没有元素的，需要更新窗口

            if (need.containsKey(ch)) { // 扩大窗口
                window.put(ch, window.getOrDefault(ch, 0) + 1); // 如果字符串t包含ch，则更新窗口中的字符
                // 只有window中与need同时包含该字符，则个数也相同时，才更新valid
                // 使用equals判断，因为Integer是对象， == 判断的是内存地址，equals重写后判断的是内容
                if (window.get(ch).equals(need.get(ch))) valid++;
            }
            // 判断是否收缩左窗口
            while (valid == need.size()) { // 说明当前已满足s包含t，但不一定是最小的窗口

                // 更新最小覆盖子串
                if (right - left < len) { // 如果当前窗口的长度小于前一个窗口，则收缩窗口
                    start = left;
                    len = right - left;
                }
                // 窗口最左端的字符
                char remove = s.charAt(left);
                left++; // 开始收缩
                if (need.containsKey(remove)) {
                    // 使用equals判断，因为Integer是对象， == 判断的是内存地址，equals重写后判断的是内容
                    if (window.get(remove).equals(need.get(remove))) {
                        valid--;
                    }
                    window.put(remove, window.get(remove) - 1); // 此时window一定包含remove
                }
            }

        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        MinWindos windos = new MinWindos();
        String s = windos.minWindow("ABAACB", "ABC");
        System.out.println(s);
    }
}
