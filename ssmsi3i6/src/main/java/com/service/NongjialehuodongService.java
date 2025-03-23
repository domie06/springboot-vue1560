package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjialehuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjialehuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjialehuodongView;


/**
 * 农家乐活动
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface NongjialehuodongService extends IService<NongjialehuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjialehuodongVO> selectListVO(Wrapper<NongjialehuodongEntity> wrapper);
   	
   	NongjialehuodongVO selectVO(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
   	
   	List<NongjialehuodongView> selectListView(Wrapper<NongjialehuodongEntity> wrapper);
   	
   	NongjialehuodongView selectView(@Param("ew") Wrapper<NongjialehuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjialehuodongEntity> wrapper);
   	
}

