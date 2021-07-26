package com.pwc.findo.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PwcFindoDaoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=	SpringApplication.run(PwcFindoDaoApplication.class, args);
		
	FindoDao dao=ctx.getBean(FindoDao.class, "fdao");
		
	//dao.saveDonorDetails();
	//dao.getDonorDetailsbyId(1);
	//dao.updateDonorDetails(1, "Arul", "arunaaa@123");
	//dao.deleteDonorDetails(1);
	dao.getAllDonorDetails();
	}

}
