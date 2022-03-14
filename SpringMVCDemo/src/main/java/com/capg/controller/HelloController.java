package com.capg.controller;
import com.capg.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView sayHello()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		
		return mv;
	}
	
	@RequestMapping("/getStudentData")
	public ModelAndView getData()
	{
		ModelAndView mv = new ModelAndView();
		Student stu = new Student();
		stu.setStid(200);
		stu.setStname("Adarsh");
		
		mv.addObject("capg", stu);
		
		mv.setViewName("retrieve");	
		
		
		return mv;
	}

}