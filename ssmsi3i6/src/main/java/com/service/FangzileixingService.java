package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangzileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangzileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangzileixingView;


/**
 * 房子类型
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface FangzileixingService extends IService<FangzileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangzileixingVO> selectListVO(Wrapper<FangzileixingEntity> wrapper);
   	
   	FangzileixingVO selectVO(@Param("ew") Wrapper<FangzileixingEntity> wrapper);
   	
   	List<FangzileixingView> selectListView(Wrapper<FangzileixingEntity> wrapper);
   	
   	FangzileixingView selectView(@Param("ew") Wrapper<FangzileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangzileixingEntity> wrapper);
   	
}

