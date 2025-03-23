package com.entity.vo;

import com.entity.NongzuowuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 农作物
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public class NongzuowuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
