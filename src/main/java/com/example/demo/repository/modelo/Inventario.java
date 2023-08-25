package com.example.demo.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
	
	@Id
	@SequenceGenerator(name = "seq_inventario",sequenceName = "seq_inventario",allocationSize = 1)
	@GeneratedValue(generator = "seq_inventario",strategy = GenerationType.SEQUENCE)
	@Column(name = "inve_id")
	private Integer id;
	
	@OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    private List<Detalle> detalles;

	
	@Override
	public String toString() {
		return "Inventario [id=" + id + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	

}
