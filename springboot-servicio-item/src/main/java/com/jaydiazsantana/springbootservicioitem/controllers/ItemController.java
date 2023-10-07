package com.jaydiazsantana.springbootservicioitem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jaydiazsantana.springbootservicioitem.models.Item;
import com.jaydiazsantana.springbootservicioitem.models.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("serviceRestTemplate")
	ItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> findAll() {
		return itemService.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item findById(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}
}
