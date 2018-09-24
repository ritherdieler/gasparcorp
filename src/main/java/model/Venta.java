package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the VENTA database table.
 * 
 */
@Entity
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idventa;

	private Timestamp fecha;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="IDEMPLEADO")
	private Empleado empleado;

	//bi-directional many-to-one association to Mesa
	@ManyToOne
	@JoinColumn(name="IDMESA")
	private Mesa mesa;

	//bi-directional many-to-one association to VentaDet
	@OneToMany(mappedBy="venta")
	private List<VentaDet> ventaDets;

	public Venta() {
	}

	public long getIdventa() {
		return this.idventa;
	}

	public void setIdventa(long idventa) {
		this.idventa = idventa;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Mesa getMesa() {
		return this.mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public List<VentaDet> getVentaDets() {
		return this.ventaDets;
	}

	public void setVentaDets(List<VentaDet> ventaDets) {
		this.ventaDets = ventaDets;
	}

	public VentaDet addVentaDet(VentaDet ventaDet) {
		getVentaDets().add(ventaDet);
		ventaDet.setVenta(this);

		return ventaDet;
	}

	public VentaDet removeVentaDet(VentaDet ventaDet) {
		getVentaDets().remove(ventaDet);
		ventaDet.setVenta(null);

		return ventaDet;
	}

}