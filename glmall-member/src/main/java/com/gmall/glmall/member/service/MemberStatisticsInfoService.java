package com.gmall.glmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * ��Աͳ����Ϣ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:19
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

