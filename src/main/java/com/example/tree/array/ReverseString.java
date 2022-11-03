package com.example.tree.array;

/**
 * 反转字符串
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int head = 0, last = s.length-1;
        char tmp = ' ';

        while (head < last) {
            tmp = s[head];
            s[head] = s[last];
            s[last] = tmp;
            head++;
            last--;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] chars = {'h', 'e', 'l', 'l', '0'};
        reverseString.reverseString(chars);

    }
}
