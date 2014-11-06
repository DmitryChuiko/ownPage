package com.companies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.companies.beans.HomeViewBean;

@Controller
public class WebController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		HomeViewBean homeView = new HomeViewBean();
		homeView.setMessage("Hello from Set");
		mav.addObject("homeView", homeView);
		return mav;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		HomeViewBean homeView = new HomeViewBean();
		homeView.setMessage("Hello from Set");
		mav.addObject("homeView", homeView);
		return mav;
	}

}