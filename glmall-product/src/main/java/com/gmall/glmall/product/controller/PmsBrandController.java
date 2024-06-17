package com.gmall.glmall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.gmall.glmall.common.valid.AddGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmall.glmall.product.entity.PmsBrandEntity;
import com.gmall.glmall.product.service.PmsBrandService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.R;

import javax.validation.Valid;


/**
 * Ʒ��
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 12:27:28
 */
@RestController
@RequestMapping("/pmsbrand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmsbrand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:pmsbrand:info")
    public R info(@PathVariable("brandId") Long brandId){
		PmsBrandEntity pmsBrand = pmsBrandService.getById(brandId);

        return R.ok().put("pmsBrand", pmsBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("product:pmsbrand:save")
    // bindingResult就可以获取到校验错
    public R save(@Validated({AddGroup.class}) @RequestBody PmsBrandEntity pmsBrand){
        //使用controllerAdvice来处理，异常让其抛出
//        if (bindingResult.hasErrors()) {
//            Map<String,String > errorMap = new HashMap<>();
//            //获取校验证错误信息
//            bindingResult.getFieldErrors().forEach(item->{
//                //获取信息和错误
//                String message = item.getDefaultMessage();
//                String filed = item.getField();
//                errorMap.put(filed,message);
//            });
//            return  R.error(400,"数据效验非法").put("data",errorMap);
//        }
		pmsBrandService.save(pmsBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmsbrand:update")
    public R update(@RequestBody PmsBrandEntity pmsBrand){
		pmsBrandService.updateById(pmsBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmsbrand:delete")
    public R delete(@RequestBody Long[] brandIds){
		pmsBrandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
