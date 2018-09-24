package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PLATO_DET database table.
 * 
 */
@Entity
@Table(name="PLATO_DET")
@NamedQuery(name="PlatoDet.findAll", query="SELECT p FROM PlatoDet p")
public class PlatoDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDPLATO_DET")
	private long idplatoDet;

	private BigDecimal estado;

	private BigDecimal precio;

	//bi-directional many-to-one association to Plato
	@ManyToOne
	@JoinColumn(name="IDPLATO")
	private Plato plato;

	//bi-directional many-to-one association to VentaDet
	@OneToMany(mappedBy="platoDet")
	private List<VentaDet> ventaDets;

	public PlatoDet() {
	}

	public long getIdplatoDet() {
		return this.idplatoDet;
	}

	public void setIdplatoDet(long idplatoDet) {
		this.idplatoDet = idplatoDet;
	}

	public BigDecimal getEstado() {
		return this.estado;
	}

	public void setEstado(BigDecimal estado) {
		this.estado = estado;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Plato getPlato() {
		return this.plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public List<VentaDet> getVentaDets() {
		return this.ventaDets;
	}

	public void setVentaDets(List<VentaDet> ventaDets) {
		this.ventaDets = ventaDets;
	}

	public VentaDet addVentaDet(VentaDet ventaDet) {
		getVentaDets().add(ventaDet);
		ventaDet.setPlatoDet(this);

		return ventaDet;
	}

	public VentaDet removeVentaDet(VentaDet ventaDet) {
		getVentaDets().remove(ventaDet);
		ventaDet.setPlatoDet(null);

		return ventaDet;
	}

}