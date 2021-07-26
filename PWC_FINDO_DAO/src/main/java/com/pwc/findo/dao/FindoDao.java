package com.pwc.findo.dao;

import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pwc.findo.dao.model.Donor;
import com.pwc.findo.dao.repository.DonorRepository;
import com.pwc.findo.rdsconnection.AwsRdsConnection;

@Component("fdao")
public class FindoDao {
@Autowired	
private DonorRepository repo;

static {
AwsRdsConnection.getConnection();
}

public void saveDonorDetails()
{
	

	Donor donor1=new Donor("Anil","Goa","Anil@gmail.com","anil@123");
    repo.save(donor1);
	
}



public void getDonorDetailsbyId(int id)
{
	Optional<Donor> optionaldonor=repo.findById(id);
	
	
	Donor donor=optionaldonor.get();
	
	System.out.println(donor);
	
}


public void updateDonorDetails(int id,String updatedname,String updatedPassword)
{
	Optional<Donor> optionaldonor=repo.findById(id);
	Donor updateDonor=optionaldonor.get();
	updateDonor.setName(updatedname);
	updateDonor.setLoginpassword(updatedPassword);
	repo.save(updateDonor);
}


public void deleteDonorDetails(int id)
{
	repo.deleteById(id);
	System.out.println("Donor with id::"+id+"has been deleted");
}


public ArrayList<Donor> getAllDonorDetails()
{
	ArrayList<Donor> donors=(ArrayList<Donor>) repo.findAll();
	
	donors.forEach(System.out::println);
	
	return donors;
	
	
}




}
