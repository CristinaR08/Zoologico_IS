package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.Contrato;
import com.example.demo.repository.modelo.Donacion;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IContratoService;
import com.example.demo.service.IDonacionService;
import com.example.demo.service.IEmpleadoService;

@SpringBootApplication
public class ZooIsApplication implements CommandLineRunner{

	@Autowired
	private IClienteService clienteService;
	
	@Autowired 
	private IContratoService contratoService;
	
	@Autowired
	private IDonacionService donacionService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ZooIsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Teresa");
		cliente1.setApellido("Vaez");
		cliente1.setCedula("1758963200");
		cliente1.setCorreo("tere-v_1984@hotmail.com");
		cliente1.setFechaN(LocalDateTime.of(1984, 5, 12, 14, 25));
		//this.clienteService.agregar(cliente1);
		
		Contrato contratoE1 = new Contrato();
		contratoE1.setNumero("120335");
		contratoE1.setFechaInicio(LocalDateTime.of(2023, 8, 12, 12, 00));
		contratoE1.setFechaFinalizacion(LocalDateTime.of(2025, 8, 12, 12, 00));
		//this.contratoService.agregarContrato(contratoE1);

		Donacion donacion = new Donacion();
		donacion.setMonto(new BigDecimal(120.00));
		donacion.setDonante("Anónimo");
		
		Donacion donacion2 = new Donacion();
		donacion2.setMonto(new BigDecimal(500.30));
		donacion2.setDonante("Anónimo");
		
		Donacion donacion3 = new Donacion();
		donacion3.setMonto(new BigDecimal(168.15));
		donacion3.setDonante("Anónimo");

		//this.donacionService.guardarDonacion(donacion);
		//this.donacionService.guardarDonacion(donacion2);
		//this.donacionService.guardarDonacion(donacion3);
		
		System.out.println("encontrar:" +this.donacionService.encontrarDonacionPorId(2));
		
		
		System.out.println("Lista Donaciones: "+this.donacionService.listaDonaciones());
		
		
		System.out.println("Suma: "+this.donacionService.montoTotalDonaciones());
		
		
	}
	
	

}
