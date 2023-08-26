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
import com.example.demo.repository.modelo.Asignacion;
import com.example.demo.repository.modelo.Cliente;
import com.example.demo.repository.modelo.ContratoEmpleados;
import com.example.demo.repository.modelo.ContratoProveedores;
import com.example.demo.repository.modelo.Donacion;
import com.example.demo.repository.modelo.Empleado;
import com.example.demo.repository.modelo.HistorialMedico;
import com.example.demo.repository.modelo.Horarios;
import com.example.demo.repository.modelo.Inventario;
import com.example.demo.repository.modelo.Jornada;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.repository.modelo.Proveedor;
import com.example.demo.repository.modelo.TipoCargo;
import com.example.demo.service.AsignacionService;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.IAnimalService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IContratoEService;
import com.example.demo.service.IContratoPService;
import com.example.demo.service.IDonacionService;
import com.example.demo.service.IHistorialMedicoService;
import com.example.demo.service.IHorariosService;
import com.example.demo.service.IProductoService;
import com.example.demo.service.IProveedorService;
import com.example.demo.service.InventarioService;

@SpringBootApplication
public class ZooIsApplication implements CommandLineRunner{

	@Autowired
	private IContratoEService contratoEService;
	
	@Autowired
	private IContratoPService contratoPService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private IProveedorService proveedorService;
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IHorariosService horariosService;
	
	@Autowired
	private AsignacionService asignacionService;
	
	@Autowired
	private InventarioService inventarioService;
	
	@Autowired
	private IAnimalService animalService;
	
	@Autowired
	private IHistorialMedicoService historialMedicoService;
	

	public static void main(String[] args) {
		SpringApplication.run(ZooIsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	Cliente cliente = new Cliente();
	cliente.setNombre("Cristina");
	cliente.setApellido("Rivera");
	cliente.setCedula("1726600537");
	cliente.setCorreo("crisR@hotmail.com");
	cliente.setContrasenia("hola");
	cliente.setFechaN(LocalDate.of(1998, 8, 4));
	cliente.setTelefono("0994448489");
	//this.clienteService.agregar(cliente);

	Cliente cliente2 = new Cliente();
	cliente2.setNombre("Carlos");
	cliente2.setApellido("Zurita");
	cliente2.setCedula("1725896033");
	cliente2.setCorreo("czurita@outlook.com");
	cliente2.setContrasenia("zurita123");
	cliente2.setFechaN(LocalDate.of(2001, 5, 17));
	cliente2.setTelefono("0997851023");
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
	empleado.setAsignaciones(null);
	empleado.setContrasenia("12345");
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
	
	//this.clienteService.autenticar("crisR@hotmail.com", "hola");
	//this.empleadoService.autenticar("mpam@hotmail.com", "12345");

	Asignacion asig = new Asignacion();
	asig.setEstado(true);
	asig.setDetalle("Limpiar jaula leones");
	asig.setEmpleado(empleado);
	
	Asignacion asig2 = new Asignacion();
	asig2.setEstado(true);
	asig2.setDetalle("Limpiar jaula monos");
	asig2.setEmpleado(empleado);
	
	List<Asignacion> listaAsignaciones = new ArrayList<>();
	listaAsignaciones.add(asig);
	listaAsignaciones.add(asig2);
	empleado.setAsignaciones(listaAsignaciones);
	
	//this.empleadoService.registrar(empleado);
	//this.asignacionService.guardar(asig);
	//this.asignacionService.guardar(asig2);
	
	//PROVEEDOR
	Proveedor prov = new Proveedor();
	prov.setNombreEmpresa("ZOO Ecuador");
	prov.setTelefono("3440478");
	prov.setCorreoElectronico("zoo_implent@gmail.com");
	prov.setTiempoEntrega(10);
	
	//this.proveedorService.reporteProveedor().stream().forEach(System.out::println);
	
	//inventario
	Inventario inv = new Inventario();
	inv.setIdEncargado(7);
	
	Producto prod = new Producto();
	prod.setCodigoId("1");
	prod.setNombre("Medicación");
	prod.setDescripcion("La administración de medicación en un zoológico es una tarea crucial para garantizar la salud y el bienestar de los animales bajo cuidado");
	prod.setStock(1);
	prod.setInventario(inv);
	prod.setProveedor(prov);
	
	Producto prod2 = new Producto();
	prod2.setCodigoId("2");
	prod2.setNombre("aaa");
	prod2.setDescripcion("sfa");
	prod2.setStock(1);
	prod2.setInventario(inv);
	prod2.setProveedor(prov);
	
	List<Producto> listaProductos = new ArrayList<>();
	listaProductos.add(prod);
	listaProductos.add(prod2);
	
	inv.setInvProductos(listaProductos);
	//this.proveedorService.agregar(prov);
	//this.inventarioService.agregar(inv);
	//this.productoService.agregar(prod);
	//this.productoService.agregar(prod2);
	
	ContratoProveedores proveedores = new ContratoProveedores();
	proveedores.setNumero("12456");
	proveedores.setFechaInicio(LocalDate.of(2023, 8, 15));
	proveedores.setFechaFinalizacion(LocalDate.of(2024, 8, 15));
	proveedores.setProveedor(prov);
	//this.contratoPService.agregarContrato(proveedores);
	
	HistorialMedico hist = new HistorialMedico();
	hist.setCodigoAnimal("L014");
	hist.setDetalle("Todo bien :)");
	hist.setFechaConsulta(LocalDateTime.now());
	hist.setFechaProximaCita(LocalDateTime.of(2023, 12, 2, 12, 00));
	hist.setNumeroHistorial("123");
	hist.setVeterinario(null);
	//this.historialMedicoService.guardar(hist);
	
	List<HistorialMedico> historialesMedicos = new ArrayList<>();
	historialesMedicos.add(hist);
	
	Animal animal = new Animal();
	animal.setCodigoRegistro("L014");
	animal.setComportamineto("agresivo");
	animal.setDieta("Carne");
	animal.setEdad("1 año");
	animal.setEstado("saludable");
	animal.setHistorialMedico(historialesMedicos);
	animal.setNombreCientifico("Lion");
	animal.setNombreComun("Leon");
	animal.setPeso(70.5);
	//this.animalService.guadar(animal);
	
	System.out.println(this.animalService.buscarEspecie("Lion"));
		
	
	}
}
