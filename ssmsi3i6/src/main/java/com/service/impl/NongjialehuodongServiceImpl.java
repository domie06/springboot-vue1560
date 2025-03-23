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


import com.dao.NongjialehuodongDao;
import com.entity.NongjialehuodongEntity;
import com.service.NongjialehuodongService;
import com.entity.vo.NongjialehuodongVO;
import com.entity.view.NongjialehuodongView;

@Service("nongjialehuodongService")
public class NongjialehuodongServiceImpl extends ServiceImpl<NongjialehuodongDao, NongjialehuodongEntity> implements NongjialehuodongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjialehuodongEntity> page = this.selectPage(
                new Query<NongjialehuodongEntity>(params).getPage(),
                new EntityWrapper<NongjialehuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjialehuodongEntity> wrapper) {
		  Page<NongjialehuodongView> page =new Query<NongjialehuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjialehuodongVO> selectListVO(Wrapper<NongjialehuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjialehuodongVO selectVO(Wrapper<NongjialehuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjialehuodongView> selectListView(Wrapper<NongjialehuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjialehuodongView selectView(Wrapper<NongjialehuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
