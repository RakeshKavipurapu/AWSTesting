package net.codejava;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClientBuilder;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

public class SNSPublisher {

	private static final String TOPICARN="arn:aws:sns:us-west-2:711075564712:SimpleNotification";
	
	
	

	
	
	public static void publishMessage(String message,String subject)
	{
		AWSCredentials credentials=new BasicAWSCredentials("AKIA2LD3IBSUKE6RUR42","qjnSWEJBoQyrNUEz/PsxmQHNlLvyAPUX5BbErruQ");
		AmazonSNSClient snsclient=(AmazonSNSClient) AmazonSNSClientBuilder.standard()
			    .withCredentials(new AWSStaticCredentialsProvider(credentials))
			    .withRegion("us-west-2")
			    .build();
		
		
		snsclient.publish(TOPICARN,message,subject);
		
	}
	
	
	
	
	
	
}
