package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Animal;
import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.ContratoEmpleados;
import com.example.demo.repository.modelo.Donacion;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.HistorialMedico;
import com.example.demo.repository.modelo.Horarios;
import com.example.demo.repository.modelo.Jornada;
import com.example.demo.repository.modelo.Proveedor;
import com.example.demo.repository.modelo.TipoCargo;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.IAnimalService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IContratoEService;
import com.example.demo.service.IContratoPService;
import com.example.demo.service.IDonacionService;
import com.example.demo.service.IHistorialMedicoService;
import com.example.demo.service.IHorariosService;
import com.example.demo.service.IProveedorService;

@SpringBootApplication
public class ZooIsApplication implements CommandLineRunner{

	@Autowired
	private IContratoEService contratoEService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private IHorariosService horariosService;

	public static void main(String[] args) {
		SpringApplication.run(ZooIsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	Cliente cliente = new Cliente();
	cliente.setApellido("Rivera");
	cliente.setCedula("1726600537");
	cliente.setCorreo("casda");
	//this.clienteService.agregar(cliente);

	Cliente cliente2 = new Cliente();
	cliente2.setApellido("Zurita");
	cliente2.setCedula("174582");
	cliente2.setCorreo("dsfdgvcxs");
	//this.clienteService.agregar(cliente2);
	
	//EMPLEADO
	ContratoEmpleados contrato = new ContratoEmpleados();
	List<ContratoEmpleados> contratos = new ArrayList<>();
	Empleado empleado = new Empleado();
	empleado.setNombre("Marjorie");
	empleado.setApellido("Andrade");
	empleado.setCedula(1778965230);
	empleado.setEmail("mpam@hotmail.com");
	empleado.setFechaNacimiento(LocalDate.of(1995, 04, 24));
	empleado.setTelefono("0934927864");
	empleado.setTipoCargo(TipoCargo.BODEGA);
	
	contrato.setNumero("6734");
	contrato.setEmpleado(empleado);
	contrato.setFechaInicio(LocalDate.of(2021, 8, 23));
	contrato.setFechaFinalizacion(LocalDate.of(2025, 9, 10));
	contrato.setSueldo(new BigDecimal(450.00));
	contratos.add(contrato);
	empleado.setContrato_empleados(contratos);
	//this.empleadoService.registrar(empleado);
	System.out.println("Contratos empleados: \n"+this.contratoEService.mostrarListaContratos());
	
	ContratoEmpleados nuevoContrato = new ContratoEmpleados();
	nuevoContrato.setNumero("1275");
	nuevoContrato.setEmpleado(empleado);
	nuevoContrato.setSueldo(new BigDecimal(500.00));
	nuevoContrato.setFechaInicio(LocalDate.of(2026, 12, 13));
	nuevoContrato.setFechaFinalizacion(LocalDate.of(2027, 12, 13));
	
	//this.contratoEService.actualizar(1778965230, nuevoContrato);
	System.out.println("Contratos empleados: \n"+this.contratoEService.mostrarListaContratos());
	
	Horarios horarios = new Horarios();
	horarios.setEmpleado(empleado);
	horarios.setDiasSemana("Lunes, Miercoles, Viernes");
	horarios.setHoraEntrada(LocalTime.of(7, 0));
	horarios.setHoraSalida(LocalTime.of(15, 0));
	horarios.setJornada(Jornada.VESPERTINA);
	//this.horariosService.asignar(horarios);
	
	
	}
}
