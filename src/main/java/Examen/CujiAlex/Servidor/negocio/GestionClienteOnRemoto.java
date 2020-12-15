package Examen.CujiAlex.Servidor.negocio;

import javax.ejb.Remote;

import Examen.CujiAlex.Servidor.modelo.Cliente;

@Remote
public interface GestionClienteOnRemoto {

	public boolean registrarPersona(Cliente cliente);

	public Cliente buscarCliente(String identificacion);
}
