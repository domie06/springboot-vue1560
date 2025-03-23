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


import com.dao.DiscussnongzuowuDao;
import com.entity.DiscussnongzuowuEntity;
import com.service.DiscussnongzuowuService;
import com.entity.vo.DiscussnongzuowuVO;
import com.entity.view.DiscussnongzuowuView;

@Service("discussnongzuowuService")
public class DiscussnongzuowuServiceImpl extends ServiceImpl<DiscussnongzuowuDao, DiscussnongzuowuEntity> implements DiscussnongzuowuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongzuowuEntity> page = this.selectPage(
                new Query<DiscussnongzuowuEntity>(params).getPage(),
                new EntityWrapper<DiscussnongzuowuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongzuowuEntity> wrapper) {
		  Page<DiscussnongzuowuView> page =new Query<DiscussnongzuowuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongzuowuVO> selectListVO(Wrapper<DiscussnongzuowuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongzuowuVO selectVO(Wrapper<DiscussnongzuowuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongzuowuView> selectListView(Wrapper<DiscussnongzuowuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongzuowuView selectView(Wrapper<DiscussnongzuowuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
