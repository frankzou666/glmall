package com.gmall.glmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * ��Ʒ��������
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
@Data
@TableName("pms_category")
public class PmsCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ����id
	 */
	@TableId
	private Long catId;
	/**
	 * ��������
	 */
	private String name;
	/**
	 * ������id
	 */
	private Long parentCid;
	/**
	 * �㼶
	 */
	private Integer catLevel;
	/**
	 * �Ƿ���ʾ[0-����ʾ��1��ʾ]
	 */
	@TableLogic(value="1",delval = "0")
	private Integer showStatus;
	/**
	 * ����
	 */
	private Integer sort;
	/**
	 * ͼ���ַ
	 */
	private String icon;
	/**
	 * ������λ
	 */
	private String productUnit;
	/**
	 * ��Ʒ����
	 */
	private Integer productCount;

	//表示这个属性在表里不存在
	@TableField(exist = false)
	private List<PmsCategoryEntity> children;

}
