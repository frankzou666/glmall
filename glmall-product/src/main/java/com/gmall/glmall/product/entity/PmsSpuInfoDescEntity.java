package com.gmall.glmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu��Ϣ����
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
@Data
@TableName("pms_spu_info_desc")
public class PmsSpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ��Ʒid
	 */
	@TableId
	private Long spuId;
	/**
	 * ��Ʒ����
	 */
	private String decript;

}
