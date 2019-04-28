package com.example.serviceprovider.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/service")
public class WireServiceImpl implements WireService {

	 public static final String CLICHED_MESSAGE = "Hello World!";
	 
	 @GET
	 @Path("/add")
	 @Produces("text/plain")
	     public String add() {
	         return CLICHED_MESSAGE;
	 }
	 
	 
}
