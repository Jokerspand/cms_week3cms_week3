package com.wkp.biz.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wkp.biz.domain.House;
import com.wkp.biz.service.HouseService;
import com.wkp.biz.vo.HouseVO;

@Controller
public class HouseController {

	@Resource
	private HouseService houseService;
	
	@RequestMapping("list")
	public String list(Model model,HouseVO houseVO,@RequestParam(defaultValue = "1") Integer pageNum) {
		
		PageInfo<House> info = houseService.listhouse(houseVO, pageNum);
		
		model.addAttribute( "info",info);
		model.addAttribute( "houseVO",houseVO);
		
		
		return "list";
	}
}
