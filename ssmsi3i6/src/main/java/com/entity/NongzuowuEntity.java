package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农作物
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("nongzuowu")
public class NongzuowuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongzuowuEntity() {
		
	}
	
	public NongzuowuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 农作物图片
	 */
					
	private String nongzuowutupian;
	
	/**
	 * 农作物类型
	 */
					
	private String nongzuowuleixing;
	
	/**
	 * 农作物名称
	 */
					
	private String nongzuowumingcheng;
	
	/**
	 * 农作物价格
	 */
					
	private String nongzuowujiage;
	
	/**
	 * 农作物介绍
	 */
					
	private String nongzuowujieshao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农作物图片
	 */
	public void setNongzuowutupian(String nongzuowutupian) {
		this.nongzuowutupian = nongzuowutupian;
	}
	/**
	 * 获取：农作物图片
	 */
	public String getNongzuowutupian() {
		return nongzuowutupian;
	}
	/**
	 * 设置：农作物类型
	 */
	public void setNongzuowuleixing(String nongzuowuleixing) {
		this.nongzuowuleixing = nongzuowuleixing;
	}
	/**
	 * 获取：农作物类型
	 */
	public String getNongzuowuleixing() {
		return nongzuowuleixing;
	}
	/**
	 * 设置：农作物名称
	 */
	public void setNongzuowumingcheng(String nongzuowumingcheng) {
		this.nongzuowumingcheng = nongzuowumingcheng;
	}
	/**
	 * 获取：农作物名称
	 */
	public String getNongzuowumingcheng() {
		return nongzuowumingcheng;
	}
	/**
	 * 设置：农作物价格
	 */
	public void setNongzuowujiage(String nongzuowujiage) {
		this.nongzuowujiage = nongzuowujiage;
	}
	/**
	 * 获取：农作物价格
	 */
	public String getNongzuowujiage() {
		return nongzuowujiage;
	}
	/**
	 * 设置：农作物介绍
	 */
	public void setNongzuowujieshao(String nongzuowujieshao) {
		this.nongzuowujieshao = nongzuowujieshao;
	}
	/**
	 * 获取：农作物介绍
	 */
	public String getNongzuowujieshao() {
		return nongzuowujieshao;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
