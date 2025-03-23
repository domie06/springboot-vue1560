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


import com.dao.FangzileixingDao;
import com.entity.FangzileixingEntity;
import com.service.FangzileixingService;
import com.entity.vo.FangzileixingVO;
import com.entity.view.FangzileixingView;

@Service("fangzileixingService")
public class FangzileixingServiceImpl extends ServiceImpl<FangzileixingDao, FangzileixingEntity> implements FangzileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangzileixingEntity> page = this.selectPage(
                new Query<FangzileixingEntity>(params).getPage(),
                new EntityWrapper<FangzileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangzileixingEntity> wrapper) {
		  Page<FangzileixingView> page =new Query<FangzileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangzileixingVO> selectListVO(Wrapper<FangzileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangzileixingVO selectVO(Wrapper<FangzileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangzileixingView> selectListView(Wrapper<FangzileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangzileixingView selectView(Wrapper<FangzileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
