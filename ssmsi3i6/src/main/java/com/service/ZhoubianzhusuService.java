package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhoubianzhusuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhoubianzhusuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhoubianzhusuView;


/**
 * 周边住宿
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhoubianzhusuService extends IService<ZhoubianzhusuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhoubianzhusuVO> selectListVO(Wrapper<ZhoubianzhusuEntity> wrapper);
   	
   	ZhoubianzhusuVO selectVO(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
   	
   	List<ZhoubianzhusuView> selectListView(Wrapper<ZhoubianzhusuEntity> wrapper);
   	
   	ZhoubianzhusuView selectView(@Param("ew") Wrapper<ZhoubianzhusuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhoubianzhusuEntity> wrapper);
   	
}

