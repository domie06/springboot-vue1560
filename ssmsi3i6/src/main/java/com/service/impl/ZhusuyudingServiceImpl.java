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


import com.dao.ZhusuyudingDao;
import com.entity.ZhusuyudingEntity;
import com.service.ZhusuyudingService;
import com.entity.vo.ZhusuyudingVO;
import com.entity.view.ZhusuyudingView;

@Service("zhusuyudingService")
public class ZhusuyudingServiceImpl extends ServiceImpl<ZhusuyudingDao, ZhusuyudingEntity> implements ZhusuyudingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhusuyudingEntity> page = this.selectPage(
                new Query<ZhusuyudingEntity>(params).getPage(),
                new EntityWrapper<ZhusuyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhusuyudingEntity> wrapper) {
		  Page<ZhusuyudingView> page =new Query<ZhusuyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhusuyudingVO> selectListVO(Wrapper<ZhusuyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhusuyudingVO selectVO(Wrapper<ZhusuyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhusuyudingView> selectListView(Wrapper<ZhusuyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhusuyudingView selectView(Wrapper<ZhusuyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
