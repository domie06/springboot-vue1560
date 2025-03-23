package com.dao;

import com.entity.ZhoubiancanyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubiancanyinVO;
import com.entity.view.ZhoubiancanyinView;


/**
 * 周边餐饮
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhoubiancanyinDao extends BaseMapper<ZhoubiancanyinEntity> {
	
	List<ZhoubiancanyinVO> selectListVO(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
	
	ZhoubiancanyinVO selectVO(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
	
	List<ZhoubiancanyinView> selectListView(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);

	List<ZhoubiancanyinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
	
	ZhoubiancanyinView selectView(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
	
}
