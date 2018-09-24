package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CATEGORIA database table.
 * 
 */
@Entity
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idcategoria;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Plato
	@OneToMany(mappedBy="categoria")
	private List<Plato> platos;

	public Categoria() {
	}

	public long getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Plato> getPlatos() {
		return this.platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	public Plato addPlato(Plato plato) {
		getPlatos().add(plato);
		plato.setCategoria(this);

		return plato;
	}

	public Plato removePlato(Plato plato) {
		getPlatos().remove(plato);
		plato.setCategoria(null);

		return plato;
	}

}