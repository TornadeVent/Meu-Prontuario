package br.com.meuprontuario.ws;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.meuprontuario.modelo.Usuario;

@Path("/v1/usuarios")
public class UsuarioResource {

	@PersistenceContext(unitName = "meuProntuarioPU", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	@GET
	@Produces("text/plain")
	public String helloWorld() {

		
		Usuario usuario = new Usuario();
		entityManager.persist(usuario);
		
		
		return "oi: " + entityManager;

	}

}
