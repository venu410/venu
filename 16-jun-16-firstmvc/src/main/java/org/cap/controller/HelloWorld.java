package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
	
	@RequestMapping("/helloworld")
	public ModelAndView sayHello(){
		
		String msg="Hello,Welcome to Springs";
		
		return new ModelAndView("hello","yourmsg",msg);
		
		
	}

}
