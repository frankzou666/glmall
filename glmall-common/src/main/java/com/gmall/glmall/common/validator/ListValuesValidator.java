package com.gmall.glmall.common.validator;

import com.gmall.glmall.common.valid.ListShowStatus;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Validator;
import java.util.HashSet;
import java.util.Set;

public class ListValuesValidator implements ConstraintValidator<ListShowStatus,Integer> {

    private Set<Integer> set = new HashSet<>();
    @Override
    public void initialize(ListShowStatus constraintAnnotation) {
        //得到注解上的值
       int[] vals =  constraintAnnotation.vals();
       for(int val:vals){
           set.add(val);
       }
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        //value就是提交过来的值
        return  set.contains(value);
    }
}
