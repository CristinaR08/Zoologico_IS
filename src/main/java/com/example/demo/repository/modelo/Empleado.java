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
@Table(name="empleado")
public class Empleado {

	@Id
	@SequenceGenerator(name = "seq_empleado",sequenceName = "seq_empleado",allocationSize = 1)
	@GeneratedValue(generator = "seq_empleado",strategy = GenerationType.SEQUENCE)
	@Column(name = "empl_id")
	private Integer id;
	
	//atributos
	
	//relacion con contrato
	@OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL)
	private Contrato contrato;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	
	
}
