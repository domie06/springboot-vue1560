package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongjialehuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongjialehuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongjialehuodongView;


/**
 * 农家乐活动评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscussnongjialehuodongService extends IService<DiscussnongjialehuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongjialehuodongVO> selectListVO(Wrapper<DiscussnongjialehuodongEntity> wrapper);
   	
   	DiscussnongjialehuodongVO selectVO(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
   	
   	List<DiscussnongjialehuodongView> selectListView(Wrapper<DiscussnongjialehuodongEntity> wrapper);
   	
   	DiscussnongjialehuodongView selectView(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongjialehuodongEntity> wrapper);
   	
}

