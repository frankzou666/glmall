package com.gmall.glmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * �Ż�ȯ��ȡ��ʷ��¼
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

