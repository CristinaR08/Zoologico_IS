package com.example.demo.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@SequenceGenerator(name = "seq_proveedor", sequenceName = "seq_proveedor", allocationSize = 1)
	@GeneratedValue(generator = "seq_proveedor", strategy = GenerationType.SEQUENCE)
	@Column(name = "prov_id")
	private Integer id;

	@Column(name = "prov_nombre_empresa")
	private String nombreEmpresa;

	@Column(name = "prov_telefono")
	private String telefono;

	@Column(name = "prov_correo_electronico")
	private String correoElectronico;

	@Column(name = "prov_tipo_alimento")
	private String tipoAlimento;

	@Column(name = "prov_tipo_medicina")
	private String tipoMedicina;

	@Column(name = "prov_tipo_implementos")
	private String tipoImplementos;

	// relacion con contrato
	@OneToOne(mappedBy = "proveedor", cascade = CascadeType.ALL)
	private ContratoProveedores proveedores;

	// set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public String getTipoMedicina() {
		return tipoMedicina;
	}

	public void setTipoMedicina(String tipoMedicina) {
		this.tipoMedicina = tipoMedicina;
	}

	public String getTipoImplementos() {
		return tipoImplementos;
	}

	public void setTipoImplementos(String tipoImplementos) {
		this.tipoImplementos = tipoImplementos;
	}
	

	public ContratoProveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(ContratoProveedores proveedores) {
		this.proveedores = proveedores;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", telefono=" + telefono
				+ ", correoElectronico=" + correoElectronico + ", tipoAlimento=" + tipoAlimento + ", tipoMedicina="
				+ tipoMedicina + ", tipoImplementos=" + tipoImplementos + ", contrato_proveedores="
				+"]";
	}


	

}
