package com.gmall.glmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * ����������Ϣ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:55:50
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

