package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {
	
	@Id
	@SequenceGenerator(name = "seq_detalle",sequenceName = "seq_detalle",allocationSize = 1)
	@GeneratedValue(generator = "seq_detalle",strategy = GenerationType.SEQUENCE)
	@Column(name = "deta_id")
	private Integer id;
	@Column(name = "deta_codigo")
	private String codigo;
	@Column(name = "deta_stock")
    private Integer deta;
	@Column(name = "inve_nombreProducto")
    private String nombreProducto;
	@Column(name = "deta_area")
    private String area;
	
	@ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventario inventario;

	@Override
	public String toString() {
		return "Detalle [id=" + id + ", codigo=" + codigo + ", deta=" + deta + ", nombreProducto=" + nombreProducto
				+ ", area=" + area + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getDeta() {
		return deta;
	}

	public void setDeta(Integer deta) {
		this.deta = deta;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	
}
