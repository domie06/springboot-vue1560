package com.dao;

import com.entity.NongzuowuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzuowuleixingVO;
import com.entity.view.NongzuowuleixingView;


/**
 * 农作物类型
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface NongzuowuleixingDao extends BaseMapper<NongzuowuleixingEntity> {
	
	List<NongzuowuleixingVO> selectListVO(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
	
	NongzuowuleixingVO selectVO(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
	
	List<NongzuowuleixingView> selectListView(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);

	List<NongzuowuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
	
	NongzuowuleixingView selectView(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
	
}
