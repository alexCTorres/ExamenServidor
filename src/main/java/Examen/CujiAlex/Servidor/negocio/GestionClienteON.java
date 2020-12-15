package Examen.CujiAlex.Servidor.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import Examen.CujiAlex.Servidor.dao.ClienteDAO;
import Examen.CujiAlex.Servidor.modelo.Cliente;

@Stateless
public class GestionClienteON implements GestionClienteOnRemoto{

	@Inject
	private ClienteDAO daoCliente;
	
	public boolean registrarPersona(Cliente cliente) {
		daoCliente.insertJPA(cliente);
		return true;
	}
	
	public Cliente buscarCliente(String identificacion) {
		Cliente c = daoCliente.readJPA(identificacion);
		return c;
	}
}
