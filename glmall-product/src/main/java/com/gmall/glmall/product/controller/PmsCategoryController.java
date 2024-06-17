package com.gmall.glmall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gmall.glmall.product.entity.PmsCategoryEntity;
import com.gmall.glmall.product.service.PmsCategoryService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.R;



/**
 * ��Ʒ��������
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 12:27:27
 */
@RestController
@RequestMapping("/pmscategory")
public class PmsCategoryController {
    @Autowired
    private PmsCategoryService pmsCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:pmscategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = pmsCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }

    //查找所有分类，并以树形结构组装起来
    @RequestMapping("/list/tree")
    public R listWithGree(){
        List<PmsCategoryEntity> pmsCategoryEntityList = pmsCategoryService.listWithTree();
        return R.ok().put("data", pmsCategoryEntityList);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:pmscategory:info")
    public R info(@PathVariable("catId") Long catId){
		PmsCategoryEntity pmsCategory = pmsCategoryService.getById(catId);

        return R.ok().put("pmsCategory", pmsCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("product:pmscategory:save")
    public R save(@RequestBody PmsCategoryEntity pmsCategory){
		pmsCategoryService.save(pmsCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:pmscategory:update")
    public R update(@RequestBody PmsCategoryEntity pmsCategory){
		pmsCategoryService.updateById(pmsCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:pmscategory:delete")
    //@RequestBody,请求体的数据，只能是post, 一般就是发送json,一般就是把请求数据封装
    public R delete(@RequestBody Long[] catIds){
		//pmsCategoryService.removeByIds(Arrays.asList(catIds));
        //1,检查所删的菜单在别的地方是否有引用
        pmsCategoryService.removeByMenuIds(Arrays.asList(catIds));

        return R.ok();
    }

}
