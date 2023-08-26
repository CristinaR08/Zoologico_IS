package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {

	public void agregar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscarId(String codigoId);
	public void borrarId(String codigoId);
}
