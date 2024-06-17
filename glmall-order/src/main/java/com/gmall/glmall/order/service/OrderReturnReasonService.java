package com.gmall.glmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * �˻�ԭ��
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:55:50
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

