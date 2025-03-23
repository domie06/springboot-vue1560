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


import com.dao.CanyinleixingDao;
import com.entity.CanyinleixingEntity;
import com.service.CanyinleixingService;
import com.entity.vo.CanyinleixingVO;
import com.entity.view.CanyinleixingView;

@Service("canyinleixingService")
public class CanyinleixingServiceImpl extends ServiceImpl<CanyinleixingDao, CanyinleixingEntity> implements CanyinleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanyinleixingEntity> page = this.selectPage(
                new Query<CanyinleixingEntity>(params).getPage(),
                new EntityWrapper<CanyinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanyinleixingEntity> wrapper) {
		  Page<CanyinleixingView> page =new Query<CanyinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanyinleixingVO> selectListVO(Wrapper<CanyinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanyinleixingVO selectVO(Wrapper<CanyinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanyinleixingView> selectListView(Wrapper<CanyinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanyinleixingView selectView(Wrapper<CanyinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
