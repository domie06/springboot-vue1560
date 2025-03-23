package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubiancanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubiancanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubiancanyinView;


/**
 * 周边餐饮
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhoubiancanyinService extends IService<ZhoubiancanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubiancanyinVO> selectListVO(Wrapper<ZhoubiancanyinEntity> wrapper);
   	
   	ZhoubiancanyinVO selectVO(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
   	
   	List<ZhoubiancanyinView> selectListView(Wrapper<ZhoubiancanyinEntity> wrapper);
   	
   	ZhoubiancanyinView selectView(@Param("ew") Wrapper<ZhoubiancanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubiancanyinEntity> wrapper);
   	
}

