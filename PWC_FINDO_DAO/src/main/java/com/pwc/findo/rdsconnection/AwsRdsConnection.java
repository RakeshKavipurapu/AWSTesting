package com.pwc.findo.rdsconnection;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClientBuilder;

public class AwsRdsConnection {

	public static void getConnection() {
	AWSCredentials credentials=new BasicAWSCredentials("AKIA2LD3IBSUKE6RUR42","qjnSWEJBoQyrNUEz/PsxmQHNlLvyAPUX5BbErruQ"); 
	AmazonRDS rds=AmazonRDSClientBuilder.standard()
    .withCredentials(new AWSStaticCredentialsProvider(credentials))
    .withRegion("us-west-2")
    .build();
	}
	
}
