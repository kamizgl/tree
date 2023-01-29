package com.example.tree.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class checkInclusion {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int l=0 ,r=0;
        int valid= 0;

        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            need.put(aChar, need.getOrDefault(aChar, 0) + 1);
        }
        while (r < s2.length()) {
            char c = s2.charAt(r);
            r++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (r - l == s1.length()) {
                if (valid == need.size()) {
                    return true;
                }
                char d = s2.charAt(l);
                l++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid--;
                    }
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mid = 1 + (2 - 1) / 2;
        System.out.println(mid);
        System.out.println((2-1)/2);
    }
}
