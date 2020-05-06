package com.wkp.biz.service.impl;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wkp.biz.domain.House;
import com.wkp.biz.service.HouseService;
import com.wkp.common.utils.DateUtil;
import com.wkp.common.utils.RandomUtil;
import com.wkp.common.utils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class HouseServiceImplTest {

	@Resource
	private HouseService houseService;
	@Test
	public void testInsertHouse() {
		
		
		
			List<House> list =new ArrayList<House>();
			for (int i = 0; i < 100; i++) {
				
			
			House h=new House();
			
			Calendar a=Calendar.getInstance();
			a.set(2020, 5, 1);
			Calendar b=Calendar.getInstance();
			b.set(2020, 5, 6);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = sdf.format(DateUtil.random(a.getTime(), new Date()));
			h.setDate(format);
			h.setName(StringUtil.generateChineseName());
			h.setPhone(RandomUtil.random(11));
			h.setBz(StringUtil.randomChineseString(RandomUtil.random(1, 100)));
			h.setTid(RandomUtil.random(1, 3));
			
			list.add(h);
			}
			houseService.insertHouse(list);
	}

}
