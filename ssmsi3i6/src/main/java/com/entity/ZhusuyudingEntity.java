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
 * 住宿预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("zhusuyuding")
public class ZhusuyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhusuyudingEntity() {
		
	}
	
	public ZhusuyudingEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 房子名称
	 */
					
	private String fangzimingcheng;
	
	/**
	 * 房子封面
	 */
					
	private String fangzifengmian;
	
	/**
	 * 房子地址
	 */
					
	private String fangzidizhi;
	
	/**
	 * 房子价格
	 */
					
	private String fangzijiage;
	
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
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
