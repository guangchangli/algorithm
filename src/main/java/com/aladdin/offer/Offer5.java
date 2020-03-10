package com.aladdin.offer;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 限制：
 * 0 <= s 的长度 <= 10000
 *
 * @author lgc
 **/
public class Offer5 {
    public static void main(String[] args) {
        System.out.println(solution("We are happy."));
        System.out.println(solution1("We are happy."));
    }

    static String solution(String param) {
        return param.replaceAll(" ", "%20");
    }

    static String solution1(String param) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < param.length(); i++) {
            char c = param.charAt(i);
            if (c == ' ') {
                sb.append("%20");
            }
            //todo no else out error
            else {sb.append(param.charAt(i));}
        }
        return sb.toString();
    }
}
