package com.cyfqz.str;

/**
 * 字符操作
 * <p>
 * short int long
 * float double
 * byte boolean char
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/25 10:36
 */
public class CharDemo {

    public static void main(String[] args) {
        char[] chars ={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        char lastChar = '@';
        int lastCharNum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                lastChar = chars[i];
                lastCharNum++;
                continue;
            }
            if (chars[i] == lastChar) {
                lastCharNum++;
            } else {
                sb.append(lastChar).append(lastCharNum);
                lastChar = chars[i];
                lastCharNum = 1;
            }

//            if (i == chars.length) {
//
//            }
        }
        sb.append(lastChar).append(lastCharNum);
        return chars.length <= sb.length() ? chars.length : sb.length();
    }

}
