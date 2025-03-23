package com.dao;

import com.entity.DiscusszhoubianzhusuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhoubianzhusuVO;
import com.entity.view.DiscusszhoubianzhusuView;


/**
 * 周边住宿评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscusszhoubianzhusuDao extends BaseMapper<DiscusszhoubianzhusuEntity> {
	
	List<DiscusszhoubianzhusuVO> selectListVO(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
	
	DiscusszhoubianzhusuVO selectVO(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
	
	List<DiscusszhoubianzhusuView> selectListView(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);

	List<DiscusszhoubianzhusuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
	
	DiscusszhoubianzhusuView selectView(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
	
}
