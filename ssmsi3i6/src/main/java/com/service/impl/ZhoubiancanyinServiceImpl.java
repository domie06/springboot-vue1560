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


import com.dao.ZhoubiancanyinDao;
import com.entity.ZhoubiancanyinEntity;
import com.service.ZhoubiancanyinService;
import com.entity.vo.ZhoubiancanyinVO;
import com.entity.view.ZhoubiancanyinView;

@Service("zhoubiancanyinService")
public class ZhoubiancanyinServiceImpl extends ServiceImpl<ZhoubiancanyinDao, ZhoubiancanyinEntity> implements ZhoubiancanyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubiancanyinEntity> page = this.selectPage(
                new Query<ZhoubiancanyinEntity>(params).getPage(),
                new EntityWrapper<ZhoubiancanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubiancanyinEntity> wrapper) {
		  Page<ZhoubiancanyinView> page =new Query<ZhoubiancanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubiancanyinVO> selectListVO(Wrapper<ZhoubiancanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubiancanyinVO selectVO(Wrapper<ZhoubiancanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubiancanyinView> selectListView(Wrapper<ZhoubiancanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubiancanyinView selectView(Wrapper<ZhoubiancanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
