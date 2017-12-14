package com.example.demo;

public class Venta {
	private int id;
	private String nombre;
	private double valor;
	
	//Constructor
	public Venta() {
		
	}
	public Venta(int id, String nombre, int valor) {
		this.id = id;
		this.nombre = nombre;
		this.valor = valor;
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
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//Metodos
	public String info() {
		return "ID: "+id+"\nNombre: "+nombre+"\nPrecio: "+valor;
	}
}
