package com.saurabh.controller;

import java.lang.reflect.Method;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.saurabh.entity.EmployeeInfo;

@Path("employee")
public class EmployeeController {
	
	@POST
	@Path("/load")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void loadJSON(List<EmployeeInfo> employee)
	{
		System.getenv("user-dir");
		
	}
	
	
	public void getManager()
	{
		
		
	}

}
