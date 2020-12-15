package Examen.CujiAlex.Servidor.vista;

import javax.enterprise.context.RequestScoped;
import javax.faces.view.facelets.Facelet;
import javax.inject.Inject;
import javax.inject.Named;
import Examen.CujiAlex.Servidor.modelo.Cliente;
import Examen.CujiAlex.Servidor.negocio.GestionClienteON;

@Named
@RequestScoped
public class ClientesBeans {

	private String identificacion;
	private String nombres;
	private String apellidos;
	private String fechaNacimiento;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String doBuscar() {
		Cliente c = new Cliente();
		GestionClienteON clienteON = new GestionClienteON();
		c = clienteON.buscarCliente(identificacion);
		nombres = c.getNombres();
		apellidos = c.getApellidos();
		fechaNacimiento = c.getFechaNacimiento();
		return null;
	}
}
