package com.gmall.glmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.Query;

import com.gmall.glmall.product.dao.PmsSpuImagesDao;
import com.gmall.glmall.product.entity.PmsSpuImagesEntity;
import com.gmall.glmall.product.service.PmsSpuImagesService;


@Service("pmsSpuImagesService")
public class PmsSpuImagesServiceImpl extends ServiceImpl<PmsSpuImagesDao, PmsSpuImagesEntity> implements PmsSpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuImagesEntity> page = this.page(
                new Query<PmsSpuImagesEntity>().getPage(params),
                new QueryWrapper<PmsSpuImagesEntity>()
        );

        return new PageUtils(page);
    }

}