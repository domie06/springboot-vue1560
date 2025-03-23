package com.entity.view;

import com.entity.FangzileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房子类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("fangzileixing")
public class FangzileixingView  extends FangzileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangzileixingView(){
	}
 
 	public FangzileixingView(FangzileixingEntity fangzileixingEntity){
 	try {
			BeanUtils.copyProperties(this, fangzileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
