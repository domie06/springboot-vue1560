package com.dao;

import com.entity.DiscussnongzuowuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongzuowuVO;
import com.entity.view.DiscussnongzuowuView;


/**
 * 农作物评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscussnongzuowuDao extends BaseMapper<DiscussnongzuowuEntity> {
	
	List<DiscussnongzuowuVO> selectListVO(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
	
	DiscussnongzuowuVO selectVO(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
	
	List<DiscussnongzuowuView> selectListView(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);

	List<DiscussnongzuowuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
	
	DiscussnongzuowuView selectView(@Param("ew") Wrapper<DiscussnongzuowuEntity> wrapper);
	
}
