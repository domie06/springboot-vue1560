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
 * 周边住宿
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("zhoubianzhusu")
public class ZhoubianzhusuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhoubianzhusuEntity() {
		
	}
	
	public ZhoubianzhusuEntity(T t) {
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
	 * 房子名称
	 */
					
	private String fangzimingcheng;
	
	/**
	 * 房子地址
	 */
					
	private String fangzidizhi;
	
	/**
	 * 房子大小
	 */
					
	private String fangzidaxiao;
	
	/**
	 * 房子类型
	 */
					
	private String fangzileixing;
	
	/**
	 * 房子价格
	 */
					
	private String fangzijiage;
	
	/**
	 * 房子封面
	 */
					
	private String fangzifengmian;
	
	/**
	 * 房子详情
	 */
					
	private String fangzixiangqing;
	
	/**
	 * 预定时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
	/**
	 * 结算时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiesuanshijian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：房子名称
	 */
	public void setFangzimingcheng(String fangzimingcheng) {
		this.fangzimingcheng = fangzimingcheng;
	}
	/**
	 * 获取：房子名称
	 */
	public String getFangzimingcheng() {
		return fangzimingcheng;
	}
	/**
	 * 设置：房子地址
	 */
	public void setFangzidizhi(String fangzidizhi) {
		this.fangzidizhi = fangzidizhi;
	}
	/**
	 * 获取：房子地址
	 */
	public String getFangzidizhi() {
		return fangzidizhi;
	}
	/**
	 * 设置：房子大小
	 */
	public void setFangzidaxiao(String fangzidaxiao) {
		this.fangzidaxiao = fangzidaxiao;
	}
	/**
	 * 获取：房子大小
	 */
	public String getFangzidaxiao() {
		return fangzidaxiao;
	}
	/**
	 * 设置：房子类型
	 */
	public void setFangzileixing(String fangzileixing) {
		this.fangzileixing = fangzileixing;
	}
	/**
	 * 获取：房子类型
	 */
	public String getFangzileixing() {
		return fangzileixing;
	}
	/**
	 * 设置：房子价格
	 */
	public void setFangzijiage(String fangzijiage) {
		this.fangzijiage = fangzijiage;
	}
	/**
	 * 获取：房子价格
	 */
	public String getFangzijiage() {
		return fangzijiage;
	}
	/**
	 * 设置：房子封面
	 */
	public void setFangzifengmian(String fangzifengmian) {
		this.fangzifengmian = fangzifengmian;
	}
	/**
	 * 获取：房子封面
	 */
	public String getFangzifengmian() {
		return fangzifengmian;
	}
	/**
	 * 设置：房子详情
	 */
	public void setFangzixiangqing(String fangzixiangqing) {
		this.fangzixiangqing = fangzixiangqing;
	}
	/**
	 * 获取：房子详情
	 */
	public String getFangzixiangqing() {
		return fangzixiangqing;
	}
	/**
	 * 设置：预定时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预定时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
	/**
	 * 设置：结算时间
	 */
	public void setJiesuanshijian(Date jiesuanshijian) {
		this.jiesuanshijian = jiesuanshijian;
	}
	/**
	 * 获取：结算时间
	 */
	public Date getJiesuanshijian() {
		return jiesuanshijian;
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

}
