package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhusuyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhusuyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhusuyudingView;


/**
 * 住宿预订
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface ZhusuyudingService extends IService<ZhusuyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhusuyudingVO> selectListVO(Wrapper<ZhusuyudingEntity> wrapper);
   	
   	ZhusuyudingVO selectVO(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
   	
   	List<ZhusuyudingView> selectListView(Wrapper<ZhusuyudingEntity> wrapper);
   	
   	ZhusuyudingView selectView(@Param("ew") Wrapper<ZhusuyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhusuyudingEntity> wrapper);
   	
}

