package com.gmall.glmall.product.exception;


import com.gmall.glmall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

//用来处理控制器抛出的异常,这样所有业务异常放到一个单独类处理
@RestControllerAdvice(basePackages = "com.gmall.glmall.product.controller")
@Slf4j
public class ControllerException {

    //比如这个是返回校验错误
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R hanleValidException(MethodArgumentNotValidException ex) {
        log.error("数据校验出现问题{}", ex.getClass());
        BindingResult bindingResult = ex.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        //获取校验证错误信息
        bindingResult.getFieldErrors().forEach(item -> {
            //获取信息和错误
            String message = item.getDefaultMessage();
            String filed = item.getField();
            errorMap.put(filed, message);});
        return R.error(400, "数据效验非法1").put("data", errorMap);
    }

    //提供一个最一般的控制处理代码。
    @ExceptionHandler(value = Throwable.class)
    public R hanleCommonException(Exception ex) {
        log.error("控制器异常出现问题{}", ex.getMessage());
        return R.error(400, "控制器异常");
    }

}