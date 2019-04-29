package com.app.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.boot.dto.Boot;
import com.app.boot.service.BootService;

@Controller
public class BootController {
	
	@Autowired
	BootService service;

	@RequestMapping("/")
	public @ResponseBody List<Boot> rootTest() {
		return service.select();
	}
	
	@RequestMapping("/jsp")
	public String jsp() throws Exception {
		return "main";
	}
	
	@RequestMapping("/mav")
	public ModelAndView mav() throws Exception {
		ModelAndView mav = new ModelAndView("mav");

		mav.addObject("key", "fruits");

		List<String> fruitList = new ArrayList<String>();

		fruitList.add("apple");
		fruitList.add("orange");
		fruitList.add("banana");

		mav.addObject("value", fruitList);

		return mav;
	}
}
