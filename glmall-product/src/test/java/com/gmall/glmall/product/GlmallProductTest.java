package com.gmall.glmall.product;


import com.gmall.glmall.product.entity.PmsBrandEntity;
import com.gmall.glmall.product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
public class GlmallProductTest {
    @Autowired
    PmsBrandService pmsBrandService;

    //测试Insert
//    @Test
//    public void contextLoad() {
//        PmsBrandEntity pmsBrandEntity = new PmsBrandEntity();
//        pmsBrandEntity.setName("good");
//        pmsBrandService.save(pmsBrandEntity);
//    }


}
