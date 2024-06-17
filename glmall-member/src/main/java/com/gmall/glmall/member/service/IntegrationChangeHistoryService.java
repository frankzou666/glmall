package com.gmall.glmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * ���ֱ仯��ʷ��¼
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:19
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

