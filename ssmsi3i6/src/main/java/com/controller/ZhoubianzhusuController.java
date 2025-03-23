package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhoubianzhusuEntity;
import com.entity.view.ZhoubianzhusuView;

import com.service.ZhoubianzhusuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 周边住宿
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@RestController
@RequestMapping("/zhoubianzhusu")
public class ZhoubianzhusuController {
    @Autowired
    private ZhoubianzhusuService zhoubianzhusuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhoubianzhusuEntity zhoubianzhusu, 
		HttpServletRequest request){

        EntityWrapper<ZhoubianzhusuEntity> ew = new EntityWrapper<ZhoubianzhusuEntity>();
		PageUtils page = zhoubianzhusuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhoubianzhusu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhoubianzhusuEntity zhoubianzhusu, HttpServletRequest request){
        EntityWrapper<ZhoubianzhusuEntity> ew = new EntityWrapper<ZhoubianzhusuEntity>();
		PageUtils page = zhoubianzhusuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhoubianzhusu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhoubianzhusuEntity zhoubianzhusu){
       	EntityWrapper<ZhoubianzhusuEntity> ew = new EntityWrapper<ZhoubianzhusuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhoubianzhusu, "zhoubianzhusu")); 
        return R.ok().put("data", zhoubianzhusuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhoubianzhusuEntity zhoubianzhusu){
        EntityWrapper< ZhoubianzhusuEntity> ew = new EntityWrapper< ZhoubianzhusuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhoubianzhusu, "zhoubianzhusu")); 
		ZhoubianzhusuView zhoubianzhusuView =  zhoubianzhusuService.selectView(ew);
		return R.ok("查询周边住宿成功").put("data", zhoubianzhusuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhoubianzhusuEntity zhoubianzhusu = zhoubianzhusuService.selectById(id);
        return R.ok().put("data", zhoubianzhusu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhoubianzhusuEntity zhoubianzhusu = zhoubianzhusuService.selectById(id);
        return R.ok().put("data", zhoubianzhusu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        ZhoubianzhusuEntity zhoubianzhusu = zhoubianzhusuService.selectById(id);
        if(type.equals("1")) {
        	zhoubianzhusu.setThumbsupnum(zhoubianzhusu.getThumbsupnum()+1);
        } else {
        	zhoubianzhusu.setCrazilynum(zhoubianzhusu.getCrazilynum()+1);
        }
        zhoubianzhusuService.updateById(zhoubianzhusu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhoubianzhusuEntity zhoubianzhusu, HttpServletRequest request){
    	zhoubianzhusu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhoubianzhusu);

        zhoubianzhusuService.insert(zhoubianzhusu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhoubianzhusuEntity zhoubianzhusu, HttpServletRequest request){
    	zhoubianzhusu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhoubianzhusu);

        zhoubianzhusuService.insert(zhoubianzhusu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhoubianzhusuEntity zhoubianzhusu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhoubianzhusu);
        zhoubianzhusuService.updateById(zhoubianzhusu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhoubianzhusuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhoubianzhusuEntity> wrapper = new EntityWrapper<ZhoubianzhusuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhoubianzhusuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
