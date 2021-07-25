package com.aws.test.trial1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClientBuilder;
import com.amazonaws.services.rds.model.DBInstance;
import com.amazonaws.services.rds.model.DescribeDBInstancesResult;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

@Component("test")
public class AWSTesting {

  
	
	
	public static void getRemoteConnection() throws SQLException
	{
		
		System.out.println("testing purpose 2");
		AWSCredentials credentials=new BasicAWSCredentials("AKIA2LD3IBSUEPJTUOPH","mCJq1j2HwZTGfocBnuobNVtU7BNrb+fmxOS4bVEc"); 
		AmazonRDS rds=AmazonRDSClientBuilder.standard()
        .withCredentials(new AWSStaticCredentialsProvider(credentials))
        .withRegion("us-west-2")
        .build();
		System.out.println(rds.describeDBInstances());

		/*
		 * String jdbcUrl=
		 * "jdbc:mysql://database-2-instance-1.c73prefr56bq.us-east-2.rds.amazonaws.com:3306/myaurora";
		 * String username="root"; String password="root1234"; Connection
		 * con=DriverManager.getConnection(jdbcUrl, username, password);
		 * System.out.println(con.getSchema());
		 */
		
		
		
	}
	
	
	
	public void createBucket() {
	
    AWSCredentials credentials = null;
    try {
        credentials = new BasicAWSCredentials("AKIA2LD3IBSUEPJTUOPH","mCJq1j2HwZTGfocBnuobNVtU7BNrb+fmxOS4bVEc");
    } catch (Exception e) {
        throw new AmazonClientException(
                "Cannot load the credentials from the credential profiles file. " +
                "Please make sure that your credentials file is at the correct " +
                "location (C:\\Users\\Rakesh\\.aws\\credentials), and is in valid format.",
                e);
    }

    AmazonS3 s3 = AmazonS3ClientBuilder.standard()
        .withCredentials(new AWSStaticCredentialsProvider(credentials))
        .withRegion("us-west-2")
        .build();

    String bucketName = "my-first-s3-bucket-indianajones12";
  
    System.out.println("===========================================");
    System.out.println("Getting Started with Amazon S3");
    System.out.println("===========================================\n");

    try {
        /*
         * Create a new S3 bucket - Amazon S3 bucket names are globally unique,
         * so once a bucket name has been taken by any user, you can't create
         * another bucket with that same name.
         *
         * You can optionally specify a location for your bucket if you want to
         * keep your data closer to your applications or users.
         */
        System.out.println("Creating bucket " + bucketName + "\n");
        s3.createBucket(bucketName);

        /*
         * List the buckets in your account
         */
        System.out.println("Listing buckets");
        for (Bucket bucket : s3.listBuckets()) {
            System.out.println(" - " + bucket.getName());
        }
        System.out.println();
	
	
}
    catch(Exception ex)
    {
    	ex.printStackTrace();
    }
}
}

