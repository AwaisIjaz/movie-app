package com.qa.interoperability;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.business.repository.IMovieRepository;
import com.qa.business.service.IMovieService;
import com.qa.business.service.MovieService;

@Path("/movie")
public class MovieEndpoint {

	@Inject
	private IMovieService service;

	@Path("/json")
	@GET
	@Produces({ "application/json" })
	public String getAllMovies() {

		return service.getAllMovies();
	}
}
