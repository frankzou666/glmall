package com.gmall.glmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * ����������ʷ��¼
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:55:50
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

