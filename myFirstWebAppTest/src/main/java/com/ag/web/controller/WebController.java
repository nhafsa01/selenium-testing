package com.ag.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {

	 @RequestMapping("/")  
	    public ModelAndView welcome() {  
	  
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("home");
		 return mv;
		}  
}
