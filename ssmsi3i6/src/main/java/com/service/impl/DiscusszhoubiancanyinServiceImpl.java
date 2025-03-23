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


import com.dao.DiscusszhoubiancanyinDao;
import com.entity.DiscusszhoubiancanyinEntity;
import com.service.DiscusszhoubiancanyinService;
import com.entity.vo.DiscusszhoubiancanyinVO;
import com.entity.view.DiscusszhoubiancanyinView;

@Service("discusszhoubiancanyinService")
public class DiscusszhoubiancanyinServiceImpl extends ServiceImpl<DiscusszhoubiancanyinDao, DiscusszhoubiancanyinEntity> implements DiscusszhoubiancanyinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhoubiancanyinEntity> page = this.selectPage(
                new Query<DiscusszhoubiancanyinEntity>(params).getPage(),
                new EntityWrapper<DiscusszhoubiancanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhoubiancanyinEntity> wrapper) {
		  Page<DiscusszhoubiancanyinView> page =new Query<DiscusszhoubiancanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhoubiancanyinVO> selectListVO(Wrapper<DiscusszhoubiancanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhoubiancanyinVO selectVO(Wrapper<DiscusszhoubiancanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhoubiancanyinView> selectListView(Wrapper<DiscusszhoubiancanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhoubiancanyinView selectView(Wrapper<DiscusszhoubiancanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
