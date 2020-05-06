package com.wkp.biz.dao;

import java.util.List;

import com.wkp.biz.domain.House;
import com.wkp.biz.vo.HouseVO;

public interface HouseDao {

	int insertHouse(List<House> list);
	int insertHouse(House house);
	List<House> listhouse(HouseVO houseVO);
	
}
