package com.cyfqz.str;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串操作
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/08/31 15:44
 */
public class StrDemo {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0));

        StringBuffer sb = new StringBuffer();
        String str1 = "good";
        sb.append(str1);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

        StringJoiner sj = new StringJoiner(",");
        sj.add("hello").add("world");
        System.out.println(sj.toString());

        String str3 = "hello world hell world";
        int index = str3.indexOf("hello");
        System.out.println(index);

        String str4 = "helloworld234243";
        System.out.println(str4.matches("\\d+"));

        String str5 ="19216801";
        System.out.println(str5.substring(0,8));

        String str6 = "Hello, World!";
        int maxLength = 5;
        String subStr = str6.substring(0, maxLength);
        System.out.println(subStr);

        String str7 = "h";
        String str8 = "h";
        System.out.println(str7== str8);
        System.out.println("h" == "h");

        String str9 = new String("hell");
        String str10 = new String("hell");
        System.out.println(str9 == str10);


    }
}
