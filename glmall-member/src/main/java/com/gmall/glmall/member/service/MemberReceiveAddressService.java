package com.gmall.glmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * ��Ա�ջ���ַ
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:19
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

