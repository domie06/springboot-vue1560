package com.dao;

import com.entity.NongjialehuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjialehuodongVO;
import com.entity.view.NongjialehuodongView;


/**
 * 农家乐活动
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface NongjialehuodongDao extends BaseMapper<NongjialehuodongEntity> {
	
	List<NongjialehuodongVO> selectListVO(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
	
	NongjialehuodongVO selectVO(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
	
	List<NongjialehuodongView> selectListView(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);

	List<NongjialehuodongView> selectListView(Pagination page,@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
	
	NongjialehuodongView selectView(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
	
}
