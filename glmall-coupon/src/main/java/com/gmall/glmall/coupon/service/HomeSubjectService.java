package com.gmall.glmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ��ҳר�����jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

