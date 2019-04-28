package com.example.serviceprovider.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/work")
public class WireService {

	 public static final String CLICHED_MESSAGE = "Hello World!";
	 
	 @GET
	 @Path("/build")
	 @Produces("text/plain")
	     public String getHello() {
	         return CLICHED_MESSAGE;
	 }
	 
}
