package Examen.CujiAlex.Servidor.dao;

import java.sql.Connection;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import Examen.CujiAlex.Servidor.modelo.Cliente;

@Stateless
public class ClienteDAO {

	@Inject
	private EntityManager em;
	
	@Inject
	private Connection con;
	
	public boolean insertJPA(Cliente cliente) {
		em.persist(cliente);
		return true;
	}
	
	public Cliente readJPA(String identificacion) {
		Cliente c = em.find(Cliente.class, identificacion);
		return c;
	}
}
