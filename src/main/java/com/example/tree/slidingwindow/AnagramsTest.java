package com.example.tree.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramsTest {

    /**
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int valid = 0;
        int l = 0, r = 0;
        char[] chars = p.toCharArray();
        for (char achars : chars) {
            need.put(achars, need.getOrDefault(achars, 0) + 1);
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
            System.out.println(l+"-"+r);
            while (r - l == p.length()) {
                char d = s.charAt(l);
                if (valid == need.size()) {
                    res.add(l);
                }
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
                l++;
            }
        }
        return res;
    }

//"cbaebabacd"
//        "abc"

    //"baa"
//        "aa"
    public static void main(String[] args) {
        AnagramsTest anagrams = new AnagramsTest();
        List<Integer> anagrams1 = anagrams.findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams1);
    }
}
