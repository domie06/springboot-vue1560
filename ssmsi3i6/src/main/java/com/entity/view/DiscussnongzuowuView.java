package com.entity.view;

import com.entity.DiscussnongzuowuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农作物评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("discussnongzuowu")
public class DiscussnongzuowuView  extends DiscussnongzuowuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussnongzuowuView(){
	}
 
 	public DiscussnongzuowuView(DiscussnongzuowuEntity discussnongzuowuEntity){
 	try {
			BeanUtils.copyProperties(this, discussnongzuowuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
