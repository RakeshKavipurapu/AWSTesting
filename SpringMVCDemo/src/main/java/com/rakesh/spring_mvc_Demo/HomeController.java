package com.rakesh.spring_mvc_Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/")
public String showHomePage()
{
	return "mainmenu";
}
	
	
	
	}
	

