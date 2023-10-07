package com.jaydiazsantana.springbootservicioitem.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaydiazsantana.springbootservicioitem.clientes.ProductoClienteRest;
import com.jaydiazsantana.springbootservicioitem.models.Item;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {

	@Autowired
	ProductoClienteRest clienteRest;

	@Override
	public List<Item> findAll() {
		return clienteRest.listar().stream().map(p-> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteRest.detalle(id),cantidad);
	}
}
