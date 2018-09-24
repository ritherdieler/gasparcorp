package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the VENTA_DET database table.
 * 
 */
@Entity
@Table(name="VENTA_DET")
@NamedQuery(name="VentaDet.findAll", query="SELECT v FROM VentaDet v")
public class VentaDet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDVENTA_DET")
	private long idventaDet;

	private BigDecimal cantidad;

	//bi-directional many-to-one association to PlatoDet
	@ManyToOne
	@JoinColumn(name="IDPLATO_DET")
	private PlatoDet platoDet;

	//bi-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="IDVENTA")
	private Venta venta;

	public VentaDet() {
	}

	public long getIdventaDet() {
		return this.idventaDet;
	}

	public void setIdventaDet(long idventaDet) {
		this.idventaDet = idventaDet;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public PlatoDet getPlatoDet() {
		return this.platoDet;
	}

	public void setPlatoDet(PlatoDet platoDet) {
		this.platoDet = platoDet;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}