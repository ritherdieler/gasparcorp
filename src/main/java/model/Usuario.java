package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private int Idusuario;
	
	private String usuario;
	
	private String clave;
	
	
	
	public int getIdusuario() {
		return Idusuario;
	}

	public void setIdusuario(int idusuario) {
		Idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	
	
}
