package com.cyfqz.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式测试
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/08/31 17:02
 */
public class RegDemo {

    public static void main(String[] args) {
        String str6 = "helloworld234243";
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str6);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
