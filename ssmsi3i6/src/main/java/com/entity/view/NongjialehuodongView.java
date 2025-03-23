package com.entity.view;

import com.entity.NongjialehuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农家乐活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("nongjialehuodong")
public class NongjialehuodongView  extends NongjialehuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongjialehuodongView(){
	}
 
 	public NongjialehuodongView(NongjialehuodongEntity nongjialehuodongEntity){
 	try {
			BeanUtils.copyProperties(this, nongjialehuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
