package com.gmall.glmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.product.entity.PmsCategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * ��Ʒ��������
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
public interface PmsCategoryService extends IService<PmsCategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PmsCategoryEntity> listWithTree();

    void removeByMenuIds(List<Long> list);
}

