package com.gmall.glmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ����
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class PmsAttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ����id
	 */
	private Long attrId;
	/**
	 * ���Է���id
	 */
	private Long attrGroupId;
	/**
	 * ������������
	 */
	private Integer attrSort;

}
