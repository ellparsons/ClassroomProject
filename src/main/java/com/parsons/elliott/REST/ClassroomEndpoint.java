package com.parsons.elliott.REST;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.parsons.elliott.business.BusinessClassroomRules;


@Path("/classroom")
public class ClassroomEndpoint {

		@Inject
		private BusinessClassroomRules service;
		
		@Path("/getAllClassrooms")
		@GET
		@Produces({"application/json"})
		public String getAllClassrooms() {
			
			return service.getAllClassroom();
		}
		
		@Path("/getAClassroom/{id}")
		@GET
		@Produces({"application/json"})
		public String findAnClassroom(@PathParam("id")Long id) {
			
			return service.getAClassroom(id);
		}
		
		@Path("/createAClassroom")
		@POST
		@Produces({"application/json"})
		public String createAnClassroom(String classroom) {
			
			return service.createAClassroom(classroom);	
		}
		
		@Path("/updateAClassroom/{id}")
		@POST
		@Produces({"application/json"})
		public String updateAnClassroom(@PathParam("id")Long id, String classroom) {
			
			return service.updateClassroom(id, classroom);
		}
		
		@Path("/deleteAClassroom/{id}")
		@DELETE
		@Produces({"application/json"})
		public String deleteAnClassroom(@PathParam("id")Long id) {
			
			return service.deleteClassroom(id);
		}
}
