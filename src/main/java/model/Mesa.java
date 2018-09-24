package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the MESA database table.
 * 
 */
@Entity
@NamedQuery(name="Mesa.findAll", query="SELECT m FROM Mesa m")
public class Mesa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idmesa;

	private BigDecimal numero;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="mesa")
	private List<Venta> ventas;

	public Mesa() {
	}

	public long getIdmesa() {
		return this.idmesa;
	}

	public void setIdmesa(long idmesa) {
		this.idmesa = idmesa;
	}

	public BigDecimal getNumero() {
		return this.numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setMesa(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setMesa(null);

		return venta;
	}

}