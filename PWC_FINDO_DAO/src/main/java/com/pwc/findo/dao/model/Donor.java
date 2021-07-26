package com.pwc.findo.dao.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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
	
@OneToOne(cascade = CascadeType.ALL,targetEntity = CampaignDonations.class)
@JoinColumn(name = "cddonorid",referencedColumnName = "donorid")
private CampaignDonations donations;	
}
