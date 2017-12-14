package com.example.demo;


public class Comercial {
	private int id;
	private String nombre;
	private String apellidos;
	private int salario;
	
	//Constructor
	public Comercial() {
		
	}
	public Comercial(int id, String nombre, String apellidos, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	//Metodos
	public Venta venta() {
		Venta venta=new Venta(2, "Samsung Galaxy S8", 899);
		System.out.println("Ha vendido "+venta.getNombre()+" por "+nombre+" "+apellidos);
		System.out.println(venta.info());
		return venta;
	}
	public void devolucion(Venta venta) {
		System.out.println(venta.getNombre()+" ha sido devuelto por "+nombre+" "+apellidos+" su salario será suspendido.");
	}
	
	
	
	
}
