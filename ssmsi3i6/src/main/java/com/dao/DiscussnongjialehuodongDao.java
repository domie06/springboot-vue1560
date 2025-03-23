package com.dao;

import com.entity.DiscussnongjialehuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongjialehuodongVO;
import com.entity.view.DiscussnongjialehuodongView;


/**
 * 农家乐活动评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscussnongjialehuodongDao extends BaseMapper<DiscussnongjialehuodongEntity> {
	
	List<DiscussnongjialehuodongVO> selectListVO(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
	
	DiscussnongjialehuodongVO selectVO(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
	
	List<DiscussnongjialehuodongView> selectListView(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);

	List<DiscussnongjialehuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
	
	DiscussnongjialehuodongView selectView(@Param("ew") Wrapper<DiscussnongjialehuodongEntity> wrapper);
	
}
