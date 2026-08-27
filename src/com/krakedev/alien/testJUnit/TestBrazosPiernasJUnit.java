package com.krakedev.alien.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import com.krakedev.alien.Alien;

public class TestBrazosPiernasJUnit {
	
	@Test
	public void testBrazos() {
		Alien paul = new Alien(15, "verde");
		boolean resultado;
		//test true
		resultado=paul.agregarBrazos(7);
		assertTrue(resultado);
		//test false
		resultado=paul.agregarBrazos(4);
		assertFalse(resultado);	
	}
	@Test
	void testPiernas() {
		Alien paul = new Alien(15, "verde");
		boolean resultado;
		//test true
		resultado=paul.agregarPiernas(10);
		assertTrue(resultado);
		//test false
		resultado=paul.agregarPiernas(1);
		assertFalse(resultado);	
	}
	
	@Test
	void casosConvinadosBrazosYPiernas() {
		//test true
		Alien paul = new Alien(15, "verde");
		boolean resultado;
		resultado=paul.agregarBrazos(7);
		resultado=paul.agregarPiernas(3);
		assertTrue(resultado);
		
		//test false 
		Alien paul2 = new Alien(20, "Azul");
		boolean resultado2;
		resultado2=paul2.agregarBrazos(8);
		resultado2=paul2.agregarPiernas(3);
		assertFalse(resultado2); //valida agregarPierna
		
	}
	

}
