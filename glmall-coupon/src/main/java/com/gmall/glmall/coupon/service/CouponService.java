package com.gmall.glmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * �Ż�ȯ��Ϣ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

