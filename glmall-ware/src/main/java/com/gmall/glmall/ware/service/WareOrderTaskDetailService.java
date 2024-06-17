package com.gmall.glmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 16:03:48
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

