package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Proveedor;
import com.example.demo.repository.modelo.dto.Proveedores;

public interface IProveedorService {
	
	public void agregar(Proveedor proveedor);
	public void actualizar(Proveedor proveedor);
	public Proveedor buscarId(Integer id);
	public void eliminarId(Integer id);
	public List<Proveedores> reporteProveedores();

}