package com.gmall.glmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.Query;

import com.gmall.glmall.product.dao.PmsSkuSaleAttrValueDao;
import com.gmall.glmall.product.entity.PmsSkuSaleAttrValueEntity;
import com.gmall.glmall.product.service.PmsSkuSaleAttrValueService;


@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl extends ServiceImpl<PmsSkuSaleAttrValueDao, PmsSkuSaleAttrValueEntity> implements PmsSkuSaleAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSkuSaleAttrValueEntity> page = this.page(
                new Query<PmsSkuSaleAttrValueEntity>().getPage(params),
                new QueryWrapper<PmsSkuSaleAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}