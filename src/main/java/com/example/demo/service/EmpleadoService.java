package com.example.demo.service;

import com.example.demo.repository.modelo.ContratoEmpleados;
import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {

	public void registrar(Empleado empleado);
	public Empleado seleccinarCedula(Integer cedula);
	public void actualizar(Empleado empleado);
	public void actualizarContrato(Empleado empleado, ContratoEmpleados contratoEmpleados);
	public Empleado buscar(Integer id);

}
