package com.gmall.glmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.product.entity.PmsSkuInfoEntity;

import java.util.Map;

/**
 * sku��Ϣ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
public interface PmsSkuInfoService extends IService<PmsSkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

