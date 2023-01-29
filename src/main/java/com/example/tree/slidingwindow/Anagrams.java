package com.example.tree.slidingwindow;

import java.util.*;

public class Anagrams {

    /**
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int count,l,r;
        count=l=r=0;
        char[] chars = p.toCharArray();
        for (char aChar : chars) {
            need.put(aChar,window.getOrDefault(aChar,0)+1);
        }
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    count++;
                }

            }
            while (r-l ==p.length()){
                if(count==need.size()){
                    res.add(l);
                }
                char d = s.charAt(l);
                l++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        count--;
                    }
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return res;
    }

//"cbaebabacd"
//        "abc"

//"baa"
//        "aa"
    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        List<Integer> anagrams1 = anagrams.findAnagrams("baa", "aa");
        System.out.println(anagrams1);
    }
}
