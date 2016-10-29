package br.com.meuprontuario.ws;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.meuprontuario.modelo.Usuario;

@Path("/v1/usuarios")
@Stateless
public class UsuarioResource {

	@PersistenceContext(unitName = "meuProntuarioPU")
	private EntityManager entityManager;

	@GET
	@Produces("text/plain")
	public String helloWorld() throws NamingException, SQLException {

		Usuario usuario = new Usuario();
		usuario.setNome("Eduardo2");
		
		entityManager.persist(usuario);

		return "oi: " + entityManager;

	}

}
