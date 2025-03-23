package com.entity.view;

import com.entity.DiscusszhoubiancanyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 周边餐饮评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@TableName("discusszhoubiancanyin")
public class DiscusszhoubiancanyinView  extends DiscusszhoubiancanyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhoubiancanyinView(){
	}
 
 	public DiscusszhoubiancanyinView(DiscusszhoubiancanyinEntity discusszhoubiancanyinEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhoubiancanyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
