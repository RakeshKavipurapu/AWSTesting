package net.codejava.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="donation_details")
public class DonationDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int receiptId;
	@NonNull
	private Date date;	
	@NonNull
	private double donationValue;
	@NonNull
	private String paymentMethod;
		
	
	
}
