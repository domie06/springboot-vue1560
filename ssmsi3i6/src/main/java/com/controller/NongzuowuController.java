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

import com.entity.NongzuowuEntity;
import com.entity.view.NongzuowuView;

import com.service.NongzuowuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 农作物
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
@RestController
@RequestMapping("/nongzuowu")
public class NongzuowuController {
    @Autowired
    private NongzuowuService nongzuowuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongzuowuEntity nongzuowu, 
		HttpServletRequest request){

        EntityWrapper<NongzuowuEntity> ew = new EntityWrapper<NongzuowuEntity>();
		PageUtils page = nongzuowuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongzuowu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongzuowuEntity nongzuowu, HttpServletRequest request){
        EntityWrapper<NongzuowuEntity> ew = new EntityWrapper<NongzuowuEntity>();
		PageUtils page = nongzuowuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongzuowu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongzuowuEntity nongzuowu){
       	EntityWrapper<NongzuowuEntity> ew = new EntityWrapper<NongzuowuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongzuowu, "nongzuowu")); 
        return R.ok().put("data", nongzuowuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongzuowuEntity nongzuowu){
        EntityWrapper< NongzuowuEntity> ew = new EntityWrapper< NongzuowuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongzuowu, "nongzuowu")); 
		NongzuowuView nongzuowuView =  nongzuowuService.selectView(ew);
		return R.ok("查询农作物成功").put("data", nongzuowuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongzuowuEntity nongzuowu = nongzuowuService.selectById(id);
        return R.ok().put("data", nongzuowu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongzuowuEntity nongzuowu = nongzuowuService.selectById(id);
        return R.ok().put("data", nongzuowu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        NongzuowuEntity nongzuowu = nongzuowuService.selectById(id);
        if(type.equals("1")) {
        	nongzuowu.setThumbsupnum(nongzuowu.getThumbsupnum()+1);
        } else {
        	nongzuowu.setCrazilynum(nongzuowu.getCrazilynum()+1);
        }
        nongzuowuService.updateById(nongzuowu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongzuowuEntity nongzuowu, HttpServletRequest request){
    	nongzuowu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongzuowu);

        nongzuowuService.insert(nongzuowu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NongzuowuEntity nongzuowu, HttpServletRequest request){
    	nongzuowu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongzuowu);

        nongzuowuService.insert(nongzuowu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody NongzuowuEntity nongzuowu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongzuowu);
        nongzuowuService.updateById(nongzuowu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongzuowuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<NongzuowuEntity> wrapper = new EntityWrapper<NongzuowuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = nongzuowuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
