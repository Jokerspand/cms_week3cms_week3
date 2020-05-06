package com.wkp.biz.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wkp.biz.dao.HouseDao;
import com.wkp.biz.domain.House;
import com.wkp.biz.service.HouseService;
import com.wkp.biz.vo.HouseVO;

@Service
public class HouseServiceImpl implements HouseService {

	@Resource
	
	private HouseDao houseDao;
	@Override
	public PageInfo<House> listhouse(HouseVO houseVO,Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		
		List<House> listhouse = houseDao.listhouse(houseVO);
		
		return new PageInfo<House>(listhouse);
	}
	@Override
	public int insertHouse(List<House> list) {
		// TODO Auto-generated method stub
		return houseDao.insertHouse(list);
	}

}
