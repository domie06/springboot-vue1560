package com.dao;

import com.entity.DiscusszhoubiancanyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhoubiancanyinVO;
import com.entity.view.DiscusszhoubiancanyinView;


/**
 * 周边餐饮评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscusszhoubiancanyinDao extends BaseMapper<DiscusszhoubiancanyinEntity> {
	
	List<DiscusszhoubiancanyinVO> selectListVO(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
	
	DiscusszhoubiancanyinVO selectVO(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
	
	List<DiscusszhoubiancanyinView> selectListView(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);

	List<DiscusszhoubiancanyinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
	
	DiscusszhoubiancanyinView selectView(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
	
}
