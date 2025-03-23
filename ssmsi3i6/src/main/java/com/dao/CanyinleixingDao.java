package com.dao;

import com.entity.CanyinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanyinleixingVO;
import com.entity.view.CanyinleixingView;


/**
 * 餐饮类型
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface CanyinleixingDao extends BaseMapper<CanyinleixingEntity> {
	
	List<CanyinleixingVO> selectListVO(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
	
	CanyinleixingVO selectVO(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
	
	List<CanyinleixingView> selectListView(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);

	List<CanyinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
	
	CanyinleixingView selectView(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
	
}
