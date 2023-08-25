package com.example.demo.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IAnimalRepository;
import com.example.demo.repository.modelo.Animal;

@Service
public class AnimalServiceImpl implements IAnimalService {
	
	@Autowired
	private IAnimalRepository animalRepository;

	@Override
	public void guadar(Animal animal) {
		// TODO Auto-generated method stub
		this.animalRepository.insertar(animal);
	}

	@Override
	public void actualizar(Animal animal) {
		// TODO Auto-generated method stub
		this.animalRepository.actualizar(animal);
	}

	@Override
	public Animal buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.animalRepository.buscarId(id);
	}

	@Override
	public void eliminarId(Integer id) {
		// TODO Auto-generated method stub
		this.animalRepository.eliminarId(id);
	}

	@Override
	public List<Animal> reporteAnimales() {
		// TODO Auto-generated method stub
		return this.animalRepository.verListaAnimales();
	}

	@Override
	public BigDecimal dietaAnimal(BigDecimal peso, BigDecimal factorActvidad) {
		// Requerimiento Calórico Diario (en  kilocalorías) = 
				//Peso corporal (en kilogramos) ^ 0.75 * Factor de Actividad(1.5-2.0)
		
		BigDecimal exponente=factorActvidad.multiply(new BigDecimal(0.75));
	
		BigDecimal caloricoDiario= peso.pow(exponente.intValueExact(),MathContext.DECIMAL128);
		
		return caloricoDiario;
		
	}

	
	
	
	

}
