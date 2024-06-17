package com.gmall.glmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * ��Ա�ȼ�
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:19
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

