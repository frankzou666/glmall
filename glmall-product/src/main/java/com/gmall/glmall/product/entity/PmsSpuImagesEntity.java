package com.gmall.glmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spuͼƬ
 * 
 * @author gg
 * @email gg
 * @date 2024-04-17 11:37:32
 */
@Data
@TableName("pms_spu_images")
public class PmsSpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * ͼƬ��
	 */
	private String imgName;
	/**
	 * ͼƬ��ַ
	 */
	private String imgUrl;
	/**
	 * ˳��
	 */
	private Integer imgSort;
	/**
	 * �Ƿ�Ĭ��ͼ
	 */
	private Integer defaultImg;

}
