package com.example.tree.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/minimum-window-substring/
 * s = "ADOBECODEBANC", t = "ABC"
 */
public class MinWindow {
    public String minWindow(String s, String t) {
        Map<Character,Integer> needMap = new HashMap<Character,Integer>();
        Map<Character,Integer> windowsMap = new HashMap<Character,Integer>();
        for(char c : t.toCharArray()){
            needMap.put(c,needMap.getOrDefault(c,0)+1);
        }

        int left = 0,right = 0;
        int count= 0;

        int start = 0;
        int len =Integer.MAX_VALUE ;

        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if (needMap.containsKey(c)) {
                windowsMap.put(c,windowsMap.getOrDefault(c,0)+1);
                if (windowsMap.get(c).equals(needMap.get(c))) {
                    count++;
                }
            }
            // 这个 needmap.size很关键， 不能用t.length 有可能是aaa，aa的情况， 那么needMap 和 t.size是不相等的  count又只有在map的value相等的时候才会+1 所以只能用needmap的大小来比较
            while (count == needMap.size()) {
                int tmp = right - left;
                if (tmp < len) {
                    start =left;
                    len= tmp;
                }
                char d = s.charAt(left);
                left++;
                if (windowsMap.containsKey(d)) {
                    if (windowsMap.get(d).equals(needMap.get(d))) {
                        count--;
                    }
                    windowsMap.put(d,windowsMap.getOrDefault(d,0)-1);

                }
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);
    }


    public static void main(String[] args) {
        MinWindow minWindow = new MinWindow();
        String s = minWindow.minWindow("aaa", "aa");
        System.out.println(s);
    }
}
