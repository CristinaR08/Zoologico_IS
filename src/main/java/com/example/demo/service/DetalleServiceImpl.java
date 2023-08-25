package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDetalleRepository;
import com.example.demo.repository.modelo.Detalle;

@Service
public class DetalleServiceImpl implements IDetalleService{

	@Autowired
	private IDetalleRepository detalleRepository;

	@Override
	public void agregar(Detalle detalle) {
		this.detalleRepository.insertar(detalle);
		
	}

	@Override
	public void actualizar(Detalle detalle) {
		this.detalleRepository.actualizar(detalle);
		
	}
	
}
