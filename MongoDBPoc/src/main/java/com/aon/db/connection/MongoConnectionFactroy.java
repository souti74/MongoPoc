package com.aon.db.connection;

import com.mongodb.MongoClient;

public class MongoConnectionFactroy implements Connection<MongoClient>{

	private MongoClient client;
	
	
	
	public MongoConnectionFactroy() {
		
			client =new MongoClient();
	
	
	}


	public MongoClient getConnection() {
		
		if (client == null)
			throw new RuntimeException("Mongo DB connection not initialize.");
			
		
		return client;
		
	}

}
