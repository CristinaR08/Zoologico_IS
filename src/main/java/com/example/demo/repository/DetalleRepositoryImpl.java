package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Detalle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleRepositoryImpl implements IDetalleRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Detalle detalle) {
		this.entityManager.persist(detalle);
		
	}

	@Override
	public void actualizar(Detalle detalle) {
		this.entityManager.merge(detalle);		
	}

}
