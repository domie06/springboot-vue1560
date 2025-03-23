package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszhoubianzhusuDao;
import com.entity.DiscusszhoubianzhusuEntity;
import com.service.DiscusszhoubianzhusuService;
import com.entity.vo.DiscusszhoubianzhusuVO;
import com.entity.view.DiscusszhoubianzhusuView;

@Service("discusszhoubianzhusuService")
public class DiscusszhoubianzhusuServiceImpl extends ServiceImpl<DiscusszhoubianzhusuDao, DiscusszhoubianzhusuEntity> implements DiscusszhoubianzhusuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhoubianzhusuEntity> page = this.selectPage(
                new Query<DiscusszhoubianzhusuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhoubianzhusuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhoubianzhusuEntity> wrapper) {
		  Page<DiscusszhoubianzhusuView> page =new Query<DiscusszhoubianzhusuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhoubianzhusuVO> selectListVO(Wrapper<DiscusszhoubianzhusuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhoubianzhusuVO selectVO(Wrapper<DiscusszhoubianzhusuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhoubianzhusuView> selectListView(Wrapper<DiscusszhoubianzhusuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhoubianzhusuView selectView(Wrapper<DiscusszhoubianzhusuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
