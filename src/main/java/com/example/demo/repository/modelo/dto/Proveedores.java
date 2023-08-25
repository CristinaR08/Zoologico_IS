package com.example.demo.repository.modelo.dto;

public class Proveedores {
	
	
	private String tipoAlimento;
	private String tipoMedicina;
	private String tipoImplementos;
	
	public Proveedores(){
		
	}

	public Proveedores(String tipoAlimento, String tipoMedicina, String tipoImplementos) {
		super();
		this.tipoAlimento = tipoAlimento;
		this.tipoMedicina = tipoMedicina;
		this.tipoImplementos = tipoImplementos;
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

	@Override
	public String toString() {
		return "Proveedores [tipoAlimento=" + tipoAlimento + ", tipoMedicina=" + tipoMedicina + ", tipoImplementos="
				+ tipoImplementos + "]";
	}
	
	

}
