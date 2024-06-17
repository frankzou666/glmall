package com.gmall.glmall.coupon;

import com.gmall.glmall.coupon.entity.CouponEntity;
import com.gmall.glmall.coupon.service.CouponService;
import org.assertj.core.internal.Bytes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
public class GlmallSmsTest {

    @Autowired
    CouponService couponService;

    //测试Insert
    @Test
    public void contextLoad() {

        String inHex ="f09f90b4";
        // \xF0\x9F\x90\xB4

        int hexlen = inHex.length();
        byte[] result;
        if (hexlen % 2 == 1){
            //奇数
            hexlen++;
            result = new byte[(hexlen/2)];
            inHex="0"+inHex;
        }else {
            //偶数
            result = new byte[(hexlen/2)];
        }
        int j=0;
        for (int i = 0; i < hexlen; i+=2){
            result[j]=hexToByte(inHex.substring(i,i+2));
            j++;
        }

        CouponEntity couponEntity = new CouponEntity();



    }

    @Test
    public void emojiConvert1()
            throws UnsupportedEncodingException {
        String patternString = "([\\x{10000}-\\x{10ffff}\ud800-\udfff])";
        String str = "\\xF0\\x9F\\x90\\xB4";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()) {
            try {
                matcher.appendReplacement(
                        sb,
                        "[["
                                + URLEncoder.encode(matcher.group(1),
                                "UTF-8") + "]]");
            } catch(UnsupportedEncodingException e) {
                System.out.println(e);
                throw e;
            }
        }
        matcher.appendTail(sb);
        System.out.println("emojiConvert " + str + " to " + sb.toString()
                + ", len：" + sb.length());
        System.out.println(sb.toString());
    }

    @Test
    public void emojiRecovery2()
            throws UnsupportedEncodingException {
        String inHex ="f09f90b4";
        // \xF0\x9F\x90\xB4

        int hexlen = inHex.length();
        byte[] result;
        if (hexlen % 2 == 1){
            //奇数
            hexlen++;
            result = new byte[(hexlen/2)];
            inHex="0"+inHex;
        }else {
            //偶数
            result = new byte[(hexlen/2)];
        }
        int j=0;
        for (int i = 0; i < hexlen; i+=2){
            result[j]=hexToByte(inHex.substring(i,i+2));
            j++;
        }
        System.out.println(result);


    }

    public static byte hexToByte(String inHex){
        return (byte)Integer.parseInt(inHex,16);
    }


}
