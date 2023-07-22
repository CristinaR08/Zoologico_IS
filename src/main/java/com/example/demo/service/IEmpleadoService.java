package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Empleado;

public interface IEmpleadoService {

	public void insertar(Empleado cliente);
	public List<Empleado> mostrarListaEmpleados(); 
	
}
