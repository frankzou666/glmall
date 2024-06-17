package com.gmall.glmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.gmall.glmall.common.valid.AddGroup;
import com.gmall.glmall.common.valid.ListShowStatus;
import com.gmall.glmall.common.valid.UpdateGroup;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Ʒ��
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
@Data
@TableName("pms_brand")
public class PmsBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ��id
	 */
	@TableId
	@Null(message = "新增时ID为空",groups = {AddGroup.class})   //AddGroup.class是一个自定的空接口
	@NotNull(message = "修改时ID不能为空",groups = {UpdateGroup.class})
	private Long brandId;
	/**
	 * Ʒ����
	 */
	@NotNull(message="品牌名称不能为空",groups = {AddGroup.class,UpdateGroup.class})
	@NotBlank(message = "还要输入品牌名称",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * Ʒ��logo��ַ
	 */
	private String logo;
	/**
	 * ����
	 */
	private String descript;
	/**
	 * ��ʾ״̬[0-����ʾ��1-��ʾ]
	 */
	@ListShowStatus(vals = {0,1},message = "显示状态只是0或是1",groups = {AddGroup.class,UpdateGroup.class})
	private Integer showStatus;
	/**
	 * ��������ĸ
	 */
	private String firstLetter;
	/**
	 * ����
	 */
	private Integer sort;

}
