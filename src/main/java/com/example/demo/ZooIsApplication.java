package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.IEmpleadoRepository;
import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.Contrato;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IContratoService;

@SpringBootApplication
public class ZooIsApplication implements CommandLineRunner{

	@Autowired
	private IClienteService clienteService;
	
	@Autowired 
	private IContratoService contratoService;
	
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	
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
		this.clienteService.agregar(cliente1);
		
		Contrato contratoE1 = new Contrato();
		contratoE1.setNumero("120335");
		contratoE1.setFechaInicio(LocalDateTime.of(2023, 8, 12, 12, 00));
		contratoE1.setFechaFinalizacion(LocalDateTime.of(2025, 8, 12, 12, 00));
		this.contratoService.agregarContrato(contratoE1);
		
		Empleado empl1 = new Empleado();
		this.empleadoRepository.insertar(empl1);
		
		System.out.println(this.contratoService.mostrarListaContratosEmpleados());
		
		
	}
	
	

}
