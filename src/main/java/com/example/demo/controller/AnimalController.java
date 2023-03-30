package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Animal;
import com.example.demo.service.AnimalService;

@RestController
public class AnimalController {

	AnimalService animalService;
	
	@Autowired
	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}
	
	@GetMapping("animal")
	public Animal getAnimalById(@RequestParam long id) {
		return animalService.getAnimalById(id);
	}
	
}

