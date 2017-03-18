package com.abel.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {
	    @RequestMapping("/index")
	    @ResponseBody
		public String getTest(){
			return "Welcome, this a demo app!";
		}
}
