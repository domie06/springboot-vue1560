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


import com.dao.ZhoubianzhusuDao;
import com.entity.ZhoubianzhusuEntity;
import com.service.ZhoubianzhusuService;
import com.entity.vo.ZhoubianzhusuVO;
import com.entity.view.ZhoubianzhusuView;

@Service("zhoubianzhusuService")
public class ZhoubianzhusuServiceImpl extends ServiceImpl<ZhoubianzhusuDao, ZhoubianzhusuEntity> implements ZhoubianzhusuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhoubianzhusuEntity> page = this.selectPage(
                new Query<ZhoubianzhusuEntity>(params).getPage(),
                new EntityWrapper<ZhoubianzhusuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhoubianzhusuEntity> wrapper) {
		  Page<ZhoubianzhusuView> page =new Query<ZhoubianzhusuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhoubianzhusuVO> selectListVO(Wrapper<ZhoubianzhusuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhoubianzhusuVO selectVO(Wrapper<ZhoubianzhusuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhoubianzhusuView> selectListView(Wrapper<ZhoubianzhusuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhoubianzhusuView selectView(Wrapper<ZhoubianzhusuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
