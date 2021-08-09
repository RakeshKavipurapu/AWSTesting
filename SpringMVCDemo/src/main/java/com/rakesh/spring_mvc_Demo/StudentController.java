package com.rakesh.spring_mvc_Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	
	//create a controller to show the student form
	@RequestMapping("/showForm")
	public String showStudentForm(Model model)
	{
		//create a student object
		Student theStudent=new Student();
		//add the object to the model attribute
		model.addAttribute("student",theStudent);
		
		return "student-form";
	}
	
	
	//create a controller to process the form 
	@RequestMapping("/processForm")
	public String processStudentForm(Student student)
	{
		
		//get the input form data
		System.out.println("The student details are::"+student.getFirstName()+" "+student.getLastName()+" "+student.getCountry());
		
		
		return "student-confirmation";
		
	}
	
	
	
	
}
