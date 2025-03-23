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


import com.dao.DiscussnongjialehuodongDao;
import com.entity.DiscussnongjialehuodongEntity;
import com.service.DiscussnongjialehuodongService;
import com.entity.vo.DiscussnongjialehuodongVO;
import com.entity.view.DiscussnongjialehuodongView;

@Service("discussnongjialehuodongService")
public class DiscussnongjialehuodongServiceImpl extends ServiceImpl<DiscussnongjialehuodongDao, DiscussnongjialehuodongEntity> implements DiscussnongjialehuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongjialehuodongEntity> page = this.selectPage(
                new Query<DiscussnongjialehuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussnongjialehuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongjialehuodongEntity> wrapper) {
		  Page<DiscussnongjialehuodongView> page =new Query<DiscussnongjialehuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongjialehuodongVO> selectListVO(Wrapper<DiscussnongjialehuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongjialehuodongVO selectVO(Wrapper<DiscussnongjialehuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongjialehuodongView> selectListView(Wrapper<DiscussnongjialehuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongjialehuodongView selectView(Wrapper<DiscussnongjialehuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
