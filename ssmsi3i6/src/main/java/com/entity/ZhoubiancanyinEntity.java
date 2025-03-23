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
 * 周边餐饮
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("zhoubiancanyin")
public class ZhoubiancanyinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhoubiancanyinEntity() {
		
	}
	
	public ZhoubiancanyinEntity(T t) {
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
	 * 餐饮名称
	 */
					
	private String canyinmingcheng;
	
	/**
	 * 餐饮类型
	 */
					
	private String canyinleixing;
	
	/**
	 * 餐饮图片
	 */
					
	private String canyintupian;
	
	/**
	 * 餐饮简介
	 */
					
	private String canyinjianjie;
	
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
	 * 设置：餐饮名称
	 */
	public void setCanyinmingcheng(String canyinmingcheng) {
		this.canyinmingcheng = canyinmingcheng;
	}
	/**
	 * 获取：餐饮名称
	 */
	public String getCanyinmingcheng() {
		return canyinmingcheng;
	}
	/**
	 * 设置：餐饮类型
	 */
	public void setCanyinleixing(String canyinleixing) {
		this.canyinleixing = canyinleixing;
	}
	/**
	 * 获取：餐饮类型
	 */
	public String getCanyinleixing() {
		return canyinleixing;
	}
	/**
	 * 设置：餐饮图片
	 */
	public void setCanyintupian(String canyintupian) {
		this.canyintupian = canyintupian;
	}
	/**
	 * 获取：餐饮图片
	 */
	public String getCanyintupian() {
		return canyintupian;
	}
	/**
	 * 设置：餐饮简介
	 */
	public void setCanyinjianjie(String canyinjianjie) {
		this.canyinjianjie = canyinjianjie;
	}
	/**
	 * 获取：餐饮简介
	 */
	public String getCanyinjianjie() {
		return canyinjianjie;
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
