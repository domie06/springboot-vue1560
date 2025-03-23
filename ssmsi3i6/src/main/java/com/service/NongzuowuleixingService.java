package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongzuowuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongzuowuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongzuowuleixingView;


/**
 * 农作物类型
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface NongzuowuleixingService extends IService<NongzuowuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongzuowuleixingVO> selectListVO(Wrapper<NongzuowuleixingEntity> wrapper);
   	
   	NongzuowuleixingVO selectVO(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
   	
   	List<NongzuowuleixingView> selectListView(Wrapper<NongzuowuleixingEntity> wrapper);
   	
   	NongzuowuleixingView selectView(@Param("ew") Wrapper<NongzuowuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongzuowuleixingEntity> wrapper);
   	
}

