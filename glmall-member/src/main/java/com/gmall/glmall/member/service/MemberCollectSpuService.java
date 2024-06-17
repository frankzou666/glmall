package com.gmall.glmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * ��Ա�ղص���Ʒ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:18
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

