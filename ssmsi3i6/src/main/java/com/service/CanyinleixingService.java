package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanyinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanyinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanyinleixingView;


/**
 * 餐饮类型
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface CanyinleixingService extends IService<CanyinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanyinleixingVO> selectListVO(Wrapper<CanyinleixingEntity> wrapper);
   	
   	CanyinleixingVO selectVO(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
   	
   	List<CanyinleixingView> selectListView(Wrapper<CanyinleixingEntity> wrapper);
   	
   	CanyinleixingView selectView(@Param("ew") Wrapper<CanyinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanyinleixingEntity> wrapper);
   	
}

