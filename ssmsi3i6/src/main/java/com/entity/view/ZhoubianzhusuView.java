package com.entity.view;

import com.entity.ZhoubianzhusuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边住宿
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("zhoubianzhusu")
public class ZhoubianzhusuView  extends ZhoubianzhusuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhoubianzhusuView(){
	}
 
 	public ZhoubianzhusuView(ZhoubianzhusuEntity zhoubianzhusuEntity){
 	try {
			BeanUtils.copyProperties(this, zhoubianzhusuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
