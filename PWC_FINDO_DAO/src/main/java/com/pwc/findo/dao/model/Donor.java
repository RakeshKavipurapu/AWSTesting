package com.pwc.findo.dao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="donor_details")
public class Donor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int donorid;

@NonNull
private String name;
@NonNull
private String address;
@NonNull
private String emailid;

@NonNull
private String loginpassword;
	

	
}
