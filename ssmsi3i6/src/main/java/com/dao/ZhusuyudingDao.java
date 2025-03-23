package com.dao;

import com.entity.ZhusuyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhusuyudingVO;
import com.entity.view.ZhusuyudingView;


/**
 * 住宿预订
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhusuyudingDao extends BaseMapper<ZhusuyudingEntity> {
	
	List<ZhusuyudingVO> selectListVO(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
	
	ZhusuyudingVO selectVO(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
	
	List<ZhusuyudingView> selectListView(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);

	List<ZhusuyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
	
	ZhusuyudingView selectView(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
	
}
