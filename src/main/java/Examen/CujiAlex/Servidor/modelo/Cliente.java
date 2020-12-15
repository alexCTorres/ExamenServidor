package Examen.CujiAlex.Servidor.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String identificacion;
	private String nombres;
	private String apellidos;
	private Date fechaNacimiento;

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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
