package com.gmall.glmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.product.entity.PmsProductAttrValueEntity;

import java.util.Map;

/**
 * spu����ֵ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
public interface PmsProductAttrValueService extends IService<PmsProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

