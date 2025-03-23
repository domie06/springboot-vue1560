package com.entity.view;

import com.entity.NongzuowuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农作物
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("nongzuowu")
public class NongzuowuView  extends NongzuowuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongzuowuView(){
	}
 
 	public NongzuowuView(NongzuowuEntity nongzuowuEntity){
 	try {
			BeanUtils.copyProperties(this, nongzuowuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
