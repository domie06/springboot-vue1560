package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhoubiancanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhoubiancanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhoubiancanyinView;


/**
 * 周边餐饮评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscusszhoubiancanyinService extends IService<DiscusszhoubiancanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhoubiancanyinVO> selectListVO(Wrapper<DiscusszhoubiancanyinEntity> wrapper);
   	
   	DiscusszhoubiancanyinVO selectVO(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
   	
   	List<DiscusszhoubiancanyinView> selectListView(Wrapper<DiscusszhoubiancanyinEntity> wrapper);
   	
   	DiscusszhoubiancanyinView selectView(@Param("ew") Wrapper<DiscusszhoubiancanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhoubiancanyinEntity> wrapper);
   	
}

