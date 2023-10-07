package com.jaydiazsantana.springbootservicioproductos.models.service;

import java.util.List;

import com.jaydiazsantana.springbootservicioproductos.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
}
