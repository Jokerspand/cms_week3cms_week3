package com.wkp.biz.service;



import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wkp.biz.domain.House;
import com.wkp.biz.vo.HouseVO;

public interface HouseService  {

	int insertHouse(List<House> list);
	PageInfo<House> listhouse(HouseVO houseVO,Integer pageNum);
}
