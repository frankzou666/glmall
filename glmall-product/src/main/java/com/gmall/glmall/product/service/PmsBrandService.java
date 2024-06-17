package com.gmall.glmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * Ʒ��
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

