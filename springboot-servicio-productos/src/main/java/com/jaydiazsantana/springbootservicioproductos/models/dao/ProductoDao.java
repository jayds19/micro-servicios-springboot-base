package com.jaydiazsantana.springbootservicioproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jaydiazsantana.springbootservicioproductos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {
	
}
