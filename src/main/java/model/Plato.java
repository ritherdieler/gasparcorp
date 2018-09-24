package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PLATO database table.
 * 
 */
@Entity
@NamedQuery(name="Plato.findAll", query="SELECT p FROM Plato p")
public class Plato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idplato;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="IDCATEGORIA")
	private Categoria categoria;

	//bi-directional many-to-one association to PlatoDet
	@OneToMany(mappedBy="plato")
	private List<PlatoDet> platoDets;

	public Plato() {
	}

	public long getIdplato() {
		return this.idplato;
	}

	public void setIdplato(long idplato) {
		this.idplato = idplato;
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

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<PlatoDet> getPlatoDets() {
		return this.platoDets;
	}

	public void setPlatoDets(List<PlatoDet> platoDets) {
		this.platoDets = platoDets;
	}

	public PlatoDet addPlatoDet(PlatoDet platoDet) {
		getPlatoDets().add(platoDet);
		platoDet.setPlato(this);

		return platoDet;
	}

	public PlatoDet removePlatoDet(PlatoDet platoDet) {
		getPlatoDets().remove(platoDet);
		platoDet.setPlato(null);

		return platoDet;
	}

}