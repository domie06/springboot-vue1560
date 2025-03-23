package com.dao;

import com.entity.NongzuowuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzuowuVO;
import com.entity.view.NongzuowuView;


/**
 * 农作物
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface NongzuowuDao extends BaseMapper<NongzuowuEntity> {
	
	List<NongzuowuVO> selectListVO(@Param("ew") Wrapper<NongzuowuEntity> wrapper);
	
	NongzuowuVO selectVO(@Param("ew") Wrapper<NongzuowuEntity> wrapper);
	
	List<NongzuowuView> selectListView(@Param("ew") Wrapper<NongzuowuEntity> wrapper);

	List<NongzuowuView> selectListView(Pagination page,@Param("ew") Wrapper<NongzuowuEntity> wrapper);
	
	NongzuowuView selectView(@Param("ew") Wrapper<NongzuowuEntity> wrapper);
	
}
