package com.example.tree.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/minimum-window-substring/
 * s = "ADOBECODEBANC", t = "ABC"
 */
public class MinWindowTest {
    public String minWindow(String s, String t) {

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int valid = 0, start = 0, len = Integer.MAX_VALUE, l = 0, r = 0;

        char[] chars = t.toCharArray();
        for (char aChar : chars) {
            need.put(aChar, need.getOrDefault(aChar,0)+1);
        }

        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
                char d = s.charAt(l);
                int lentmp = r - l;
                if (lentmp < len) {
                    start=l;
                    len=lentmp;
                }
                l++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    //左指针移动和 更新valid没有关系所以要放在外面
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }


    public static void main(String[] args) {
        MinWindowTest minWindow = new MinWindowTest();
        String s = minWindow.minWindow("aaa", "aa");
        System.out.println(s);
    }
}
