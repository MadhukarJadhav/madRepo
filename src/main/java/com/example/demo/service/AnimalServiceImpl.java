package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import com.example.demo.model.Animal;

@Service
public class AnimalServiceImpl implements AnimalService{
	ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
			new Animal(1, "Bear", 18),
			new Animal(2, "Dog", 1),
			new Animal(3, "Cat", 13),
			new Animal(4, "Bird", 12)
		));
	
	public Animal getAnimalById(long id) {
		
		//for(int i=0; i < animals.size(); i++) {
		//	if(animals.get(i).getId() == id) {
		//		return animals.get(i);
		//	}
		for(Animal animal : animals)
			if(animal.getId() == id) {
				return animal;
		}
		return null;
	}
}
