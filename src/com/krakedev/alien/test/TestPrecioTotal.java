package com.krakedev.alien.test;

import com.krakedev.alien.Alien;

public class TestPrecioTotal {

	public static void main(String[] args) {
		Alien paul = new Alien(15,"verde");
		System.out.println("---Inicio---");
		paul.imprimir();
		paul.agregarBrazos(2);
		paul.agregarOjos(2);
		paul.agregarPiernas(2);
		System.out.println("---Alien Completo---");
		paul.imprimir();

	}

}
