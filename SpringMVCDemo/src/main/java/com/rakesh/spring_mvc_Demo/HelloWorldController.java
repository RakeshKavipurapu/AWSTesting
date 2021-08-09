package com.rakesh.spring_mvc_Demo;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
//create a controller for showForm
	
@RequestMapping("/showForm")	
public String showForm()
{
	return "helloworld-form";
}
//create a controller to process the data

@RequestMapping("/processForm")
public String processForm()
{
	return "helloworld-process";
}


//create a controller to read the form data and 
//add it to the model
@RequestMapping("/processFormVersion2")
public String convertToUpper(HttpServletRequest request,Model model)
{
	//read the form data using the request object
	
	String Name=request.getParameter("studentName");
	
	
	//convert the gathered data to all caps
	
	Name=Name.toUpperCase();
	
	//create the required message to be sent
	
	List<String> listOfNames=Arrays.asList("Rakesh","Bhartiya","Ravikiran","Rahul");
	
	String result="Yo! My man " + Name;
	//add the message to the model container
	model.addAttribute("message",result);
	model.addAttribute("list",listOfNames);
	return "helloworld-process";
}




@RequestMapping("/processFormVersion3")
public String processFormVersion3(@RequestParam("studentName")String Name,Model model)
{
	
	
	//convert the gathered data to all caps
	
	Name=Name.toUpperCase();
	
	//create the required message to be sent
	
	List<String> listOfNames=Arrays.asList("Rakesh","Ravikiran","Rahul");
	
	String result="Hello From V3 " + Name;
	//add the message to the model container
	model.addAttribute("message",result);
	model.addAttribute("list",listOfNames);
	return "helloworld-process";
}









	
}
