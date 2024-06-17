package com.gmall.glmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ר����Ʒ
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 15:25:54
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ר������
	 */
	private String name;
	/**
	 * ר��id
	 */
	private Long subjectId;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ����
	 */
	private Integer sort;

}
