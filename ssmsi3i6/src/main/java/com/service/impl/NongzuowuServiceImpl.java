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


import com.dao.NongzuowuDao;
import com.entity.NongzuowuEntity;
import com.service.NongzuowuService;
import com.entity.vo.NongzuowuVO;
import com.entity.view.NongzuowuView;

@Service("nongzuowuService")
public class NongzuowuServiceImpl extends ServiceImpl<NongzuowuDao, NongzuowuEntity> implements NongzuowuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongzuowuEntity> page = this.selectPage(
                new Query<NongzuowuEntity>(params).getPage(),
                new EntityWrapper<NongzuowuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongzuowuEntity> wrapper) {
		  Page<NongzuowuView> page =new Query<NongzuowuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongzuowuVO> selectListVO(Wrapper<NongzuowuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongzuowuVO selectVO(Wrapper<NongzuowuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongzuowuView> selectListView(Wrapper<NongzuowuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongzuowuView selectView(Wrapper<NongzuowuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
