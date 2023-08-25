package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@SequenceGenerator(name = "seq_producto",sequenceName = "seq_producto",allocationSize = 1)
	@GeneratedValue(generator = "seq_producto",strategy = GenerationType.SEQUENCE)
	@Column(name = "prod_id")
	private Integer id;
	
	@Column(name = "prod_nombre")
	private String nombre;
	
	@Column(name = "prod_tipo")
	private String tipo;
	
	@Column(name = "prod_codigo")
	private String codigo;
	
	
	
}
