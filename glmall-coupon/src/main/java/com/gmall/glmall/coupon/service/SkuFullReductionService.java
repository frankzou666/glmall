package com.gmall.glmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * ��Ʒ������Ϣ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

