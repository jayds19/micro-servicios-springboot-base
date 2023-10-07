package com.jaydiazsantana.springbootservicioitem.models.service;

import java.util.List;

import com.jaydiazsantana.springbootservicioitem.models.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
