package com.gmall.glmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * ��ɱ���Ʒ����
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

