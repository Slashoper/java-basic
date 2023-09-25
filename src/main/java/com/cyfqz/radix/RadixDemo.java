package com.cyfqz.radix;

/**
 * java进制转换
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/25 14:43
 */
public class RadixDemo {

    public static void main(String[] args) {
        int a = 3;
        String hexStr = Integer.toHexString(a);
        String b ="100";
        Integer.parseInt(b,10);
        Integer.valueOf(b,2);
    }
}
