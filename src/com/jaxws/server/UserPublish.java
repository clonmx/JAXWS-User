package com.jaxws.server;
import javax.xml.ws.Endpoint;


public class UserPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:1515/ws/User", new UserImp());
		
	}

}
