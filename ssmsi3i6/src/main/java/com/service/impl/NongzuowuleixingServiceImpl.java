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


import com.dao.NongzuowuleixingDao;
import com.entity.NongzuowuleixingEntity;
import com.service.NongzuowuleixingService;
import com.entity.vo.NongzuowuleixingVO;
import com.entity.view.NongzuowuleixingView;

@Service("nongzuowuleixingService")
public class NongzuowuleixingServiceImpl extends ServiceImpl<NongzuowuleixingDao, NongzuowuleixingEntity> implements NongzuowuleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongzuowuleixingEntity> page = this.selectPage(
                new Query<NongzuowuleixingEntity>(params).getPage(),
                new EntityWrapper<NongzuowuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongzuowuleixingEntity> wrapper) {
		  Page<NongzuowuleixingView> page =new Query<NongzuowuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongzuowuleixingVO> selectListVO(Wrapper<NongzuowuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongzuowuleixingVO selectVO(Wrapper<NongzuowuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongzuowuleixingView> selectListView(Wrapper<NongzuowuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongzuowuleixingView selectView(Wrapper<NongzuowuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
