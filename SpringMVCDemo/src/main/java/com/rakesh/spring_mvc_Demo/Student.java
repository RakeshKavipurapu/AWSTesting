package com.rakesh.spring_mvc_Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

import lombok.Data;
import lombok.Getter;

@Data
public class Student {

	
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	@Getter
	private LinkedHashMap<String,String> countriesOptions;
  
	public Student()
	{
		countriesOptions=new LinkedHashMap<>();
		countriesOptions.put("IN", "INDIA");
		countriesOptions.put("JP", "JAPAN");
		countriesOptions.put("NZ", "NEW ZEALAND");
		countriesOptions.put("EU", "EUROPE");
		
	}
	
	
}
