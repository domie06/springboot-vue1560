package com.dao;

import com.entity.ZhoubianzhusuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhoubianzhusuVO;
import com.entity.view.ZhoubianzhusuView;


/**
 * 周边住宿
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhoubianzhusuDao extends BaseMapper<ZhoubianzhusuEntity> {
	
	List<ZhoubianzhusuVO> selectListVO(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
	
	ZhoubianzhusuVO selectVO(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
	
	List<ZhoubianzhusuView> selectListView(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);

	List<ZhoubianzhusuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
	
	ZhoubianzhusuView selectView(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
	
}
