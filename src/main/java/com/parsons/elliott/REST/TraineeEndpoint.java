package com.parsons.elliott.REST;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.parsons.elliott.business.BusinessTraineeRules;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	private BusinessTraineeRules service;
	
	@Path("/getAllTrainees")
	@GET
	@Produces({"application/json"})
	public String getAllClassrooms() {
		
		return service.getAllTrainee();
	}
	
	@Path("/getATrainee/{id}")
	@GET
	@Produces({"application/json"})
	public String findAnClassroom(@PathParam("id")Long id) {
		
		return service.getATrainee(id);
	}
	
	@Path("/createATrainee")
	@POST
	@Produces({"application/json"})
	public String createAnClassroom(String trainee) {
		
		return service.createATrainee(trainee);	
	}
	
	@Path("/updateATrainee/{id}")
	@POST
	@Produces({"application/json"})
	public String updateAnClassroom(@PathParam("id")Long id, String account) {
		
		return service.updateTrainee(id, account);
	}
	
	@Path("/deleteATrainee/{id}")
	@DELETE
	@Produces({"application/json"})
	public String deleteAnClassroom(@PathParam("id")Long id) {
		
		return service.deleteTrainee(id);
	}


}
