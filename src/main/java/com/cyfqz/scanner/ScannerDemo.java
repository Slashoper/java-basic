package com.cyfqz.scanner;

import java.util.Scanner;

/**
 * scanner测试
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/08/31 17:02
 */
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str5 = scanner.nextLine();
        if(str5.matches("\\d{10}")){
            System.out.println("10 digit mumbers matched");
        }else{
            System.out.println("10 digit numbers not matched");
        }

    }
}
