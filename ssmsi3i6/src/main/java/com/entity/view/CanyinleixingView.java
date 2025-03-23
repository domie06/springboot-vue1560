package com.entity.view;

import com.entity.CanyinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 餐饮类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("canyinleixing")
public class CanyinleixingView  extends CanyinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanyinleixingView(){
	}
 
 	public CanyinleixingView(CanyinleixingEntity canyinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, canyinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
