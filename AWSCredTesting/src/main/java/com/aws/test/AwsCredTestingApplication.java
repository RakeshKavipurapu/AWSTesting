package com.aws.test;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aws.test.trial1.AWSTesting;

@SpringBootApplication
public class AwsCredTestingApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(AwsCredTestingApplication.class, args);
	
	  AWSTesting test=ctx.getBean(AWSTesting.class,"test"); 
	  //creating a new bucket
	  test.createBucket();
	  try {
		  //connecting to rds instance
		test.getRemoteConnection();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 
	
	
	
	}

}
