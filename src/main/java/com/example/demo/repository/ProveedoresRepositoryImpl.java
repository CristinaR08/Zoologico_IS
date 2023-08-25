package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Proveedor;

import com.example.demo.repository.modelo.dto.Proveedores;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ProveedoresRepositoryImpl implements IProveedorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Proveedor proveedor) {
		this.entityManager.merge(proveedor);
		
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		this.entityManager.merge(proveedor);
		
	}

	@Override
	public Proveedor buscarId(Integer id) {
		return this.entityManager.find(Proveedor.class, id);
	}

	@Override
	public void eliminarId(Integer id) {
		Proveedor proveedor = this.entityManager.find(Proveedor.class, id);
	    if (proveedor != null) {
	        this.entityManager.remove(proveedor);
	    } else {
	        System.out.println("No se encuentra el proveedor con ID: "+id);
	    }
	}

	@Override
	public List<Proveedores> reporteProveedores() {
		TypedQuery<Proveedores> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.Proveedores(p.tipoAlimento, p.tipoMedicina, p.tipoImplementos) FROM Proveedor p",
				Proveedores.class);
		return myQuery.getResultList();

	}

}
