package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongzuowuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongzuowuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongzuowuView;


/**
 * 农作物评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscussnongzuowuService extends IService<DiscussnongzuowuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongzuowuVO> selectListVO(Wrapper<DiscussnongzuowuEntity> wrapper);
   	
   	DiscussnongzuowuVO selectVO(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
   	
   	List<DiscussnongzuowuView> selectListView(Wrapper<DiscussnongzuowuEntity> wrapper);
   	
   	DiscussnongzuowuView selectView(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongzuowuEntity> wrapper);
   	
}

