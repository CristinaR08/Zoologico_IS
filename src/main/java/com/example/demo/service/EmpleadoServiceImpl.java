package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepository;
import com.example.demo.repository.IContratoERepository;
import com.example.demo.repository.modelo.ContratoEmpleados;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private IContratoERepository contratoERepository;

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void registrar(Empleado empleado) {
		this.empleadoRepository.insertar(empleado);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar(Empleado empleado) {
		this.empleadoRepository.actualizar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.empleadoRepository.seleccionar(id);
	}

	@Override
	public Empleado seleccinarCedula(Integer cedula) {
		return this.empleadoRepository.seleccinarCedula(cedula);
	}

	@Override
	public void actualizarContrato(Empleado empleado, ContratoEmpleados contratoEmpleados) {
		this.contratoERepository.actualizar(empleado, contratoEmpleados);
		
	}

}
