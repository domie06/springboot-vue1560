package com.dao;

import com.entity.FangzileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangzileixingVO;
import com.entity.view.FangzileixingView;


/**
 * 房子类型
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface FangzileixingDao extends BaseMapper<FangzileixingEntity> {
	
	List<FangzileixingVO> selectListVO(@Param("ew") Wrapper<FangzileixingEntity> wrapper);
	
	FangzileixingVO selectVO(@Param("ew") Wrapper<FangzileixingEntity> wrapper);
	
	List<FangzileixingView> selectListView(@Param("ew") Wrapper<FangzileixingEntity> wrapper);

	List<FangzileixingView> selectListView(Pagination page,@Param("ew") Wrapper<FangzileixingEntity> wrapper);
	
	FangzileixingView selectView(@Param("ew") Wrapper<FangzileixingEntity> wrapper);
	
}
