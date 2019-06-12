package com.kq.springboot.util;

/**
 * ByteUtilTest
 *
 * @author kq
 * @date 2019/6/13
 */
public class ByteUtilTest {

    public static void main(String[] args) {
        int n = 256;
//        int n = 2280;

        // 0010
        byte[] bs = ByteUtil.int2bytes(n);

        for(byte b : bs){
            System.out.println(b);
        }

        String str = ByteUtil.bytesToHexString(bs);
        System.out.println(str);


    }

}
