package edu.cibertec.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.Pokemon;
import edu.cibertec.service.PokemonService;

@Path("service")
public class RecursoPokemon {

	PokemonService service = new PokemonService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pokemon")
	public List<Pokemon> listaPokemon(@QueryParam("name")String name, @QueryParam("offset")int offset) {
		//List<Pokemon> listado = service.listadoPokemon(name);
		return service.listadoPokemon(name,offset);
	}
	
	
	
	
}
