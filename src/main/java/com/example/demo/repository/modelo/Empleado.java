package com.example.demo.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@GeneratedValue(generator = "seq_empleado", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado", allocationSize = 1)
	@Id
	@Column(name = "empl_id")
	private Integer id;

	@Column(name = "empl_nombre")
	private String nombre;
	
	@Column(name = "empl_apellido")
	private String apellido;

	@Column(name = "empl_cedula")
	private Integer cedula;

	@Column(name = "empl_fecha_nacimiento")
	private LocalDate fechaNacimiento;

	@Column(name = "empl_email")
	private String email;

	@Column(name = "empl_telefono")
	private String telefono;

	@Enumerated(EnumType.STRING)
	@Column(name = "empl_cargo_tipo")
	private TipoCargo tipoCargo;

	@OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
	private List<ContratoEmpleados> contrato_empleados;
	
	@OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL)
	private Horarios horarios;

	@ManyToOne
	@JoinColumn(name = "empleadoEncargado")
	private Inventario inventario;
	
	@OneToMany(mappedBy = "empleado", cascade = CascadeType.DETACH)
	private List<Asignacion> asignaciones;

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", telefono=" + telefono
				+ ", tipoCargo=" + tipoCargo + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public TipoCargo getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(TipoCargo tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public List<ContratoEmpleados> getContrato_empleados() {
		return contrato_empleados;
	}

	public void setContrato_empleados(List<ContratoEmpleados> contrato_empleados) {
		this.contrato_empleados = contrato_empleados;
	}

	public Horarios getHorarios() {
		return horarios;
	}

	public void setHorarios(Horarios horarios) {
		this.horarios = horarios;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	
}
