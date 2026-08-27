package com.krakedev.alien.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class TestConstructorJUnit {

	@Test
	public void testConstructor() {
		Alien paul = new Alien(15, "verde");

		// Validar que los atributos se inicien correctamente;
		// Atributo tamanio
		assertEquals(15, paul.getTamanio(), 0.0001);
		// Atributo color
		assertEquals("verde", paul.getColor());
		//Restriciones de tamaño
		Alien paul2 = new Alien(40, "verde");
		
		assertEquals(30, paul2.getTamanio(), 0.0001);
		//
		Alien paul3 = new Alien(2, "verde");
		
		assertEquals(5, paul3.getTamanio(), 0.0001);
		//Validar precio cuerpo de personaje paul
		assertEquals(3, paul.getPrecioCuerpo(), 0.0001);
		//Validar precio Extremidad
		assertEquals(1.5, paul.getPrecioExtremidad(), 0.0001);
		//Validar precio ojo
		assertEquals(0.75, paul.getPrecioOjo(), 0.0001);
	

	}

}
