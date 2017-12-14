package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialApplication.class, args);
		
		Comercial comercial1=new Comercial(3, "Ana", "Martín García", 1200);
		Comercial comercial2=new Comercial();
		
		comercial2.setNombre("Jose");
		comercial2.setApellidos("García");
		
		
		Venta venta1=comercial1.venta();
		comercial2.devolucion(venta1);
		
		
		
	}
}
