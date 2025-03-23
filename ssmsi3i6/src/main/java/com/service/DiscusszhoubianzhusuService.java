package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhoubianzhusuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhoubianzhusuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhoubianzhusuView;


/**
 * 周边住宿评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public interface DiscusszhoubianzhusuService extends IService<DiscusszhoubianzhusuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhoubianzhusuVO> selectListVO(Wrapper<DiscusszhoubianzhusuEntity> wrapper);
   	
   	DiscusszhoubianzhusuVO selectVO(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
   	
   	List<DiscusszhoubianzhusuView> selectListView(Wrapper<DiscusszhoubianzhusuEntity> wrapper);
   	
   	DiscusszhoubianzhusuView selectView(@Param("ew") Wrapper<DiscusszhoubianzhusuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhoubianzhusuEntity> wrapper);
   	
}

