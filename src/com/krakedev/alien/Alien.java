package com.krakedev.alien;

public class Alien {

	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;

	// constructor
	public Alien(int tamanio, String color) {

		this.color = color;
		if (tamanio >= 5 && tamanio <= 30) {
			this.tamanio = tamanio;
		} else if (tamanio > 30) {
			this.tamanio = 30;

		} else if (tamanio < 5) {
			this.tamanio = 5;
		}
		this.precioCuerpo = this.tamanio * 0.20;// Precio del cuerpo: 20% del tamaño
		this.precioExtremidad = this.tamanio * 0.10;// Precio de extremidades: 10% del tamaño
		this.precioOjo = this.tamanio * 0.05;// Precio de ojos: 5% del tamaño
	}

	// Crear métodos get para todos los atributos. No crear métodos set.

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	// Metodo Imprimir

	public void imprimir() {
		// ANSI códigos
        String RESET = "\u001B[0m";
        String BLACK_BG = "\u001B[40m";
        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String PURPLE = "\u001B[35m";
        
     
        System.out.println(BLACK_BG + RED + "        °   °" + RESET);
        System.out.println(BLACK_BG + RED + "        |   |" + RESET);
        System.out.println(BLACK_BG + PURPLE + "      .-\"\"\"\"-." + RESET);
        System.out.println(BLACK_BG + PURPLE + "     /        \\" + RESET);
        System.out.println(BLACK_BG + GREEN  + "    |  .--. .--.|" + RESET);
        System.out.println(BLACK_BG + RED    + "    | (👁️  )( 👁️)|" + RESET);
        System.out.println(BLACK_BG + GREEN  + "    |     ^^    |" + RESET);
        System.out.println(BLACK_BG + RED + "       \\  --  /" + RESET);
        System.out.println(BLACK_BG + GREEN  + "    |  '----'   |" + RESET);
        System.out.println(BLACK_BG + PURPLE + "     \\________/" + RESET);
        System.out.println(BLACK_BG + PURPLE + "      /  ||  \\" + RESET);
        System.out.println(BLACK_BG + PURPLE + "     |   ||   |" + RESET);
        System.out.println(BLACK_BG + PURPLE + "     |   ||   |" + RESET);
        System.out.println(BLACK_BG + PURPLE + "     |   ||   |" + RESET);
        System.out.println(BLACK_BG + PURPLE + "     '--------'" + RESET);

        

        
		//
		String datos="\nTamaño: "+tamanio+
						"\nColor: "+color+
						"\nNúmero de ojos: "+ numeroOjos+
						"\nNúmero de brazos 🦾: "+ numeroBrazos+
						"\nNúmero de pies: "+numeroPies+
						"\nPrecio por extremidad: $"+ precioExtremidad+
						"\nPrecio por ojo: $"+precioOjo+
						"\nPrecio del cuerpo: $"+precioCuerpo;
		System.out.println("*******************"+datos+"\n||||||||||||||||||");
	}
	
	//🦾 PARTE 7: EXTREMIDADES
	//Método agregar brazos
	public boolean agregarBrazos(int numeroBrazos) {
		this.numeroBrazos+=numeroBrazos;
		int brazosYpiernas=this.numeroBrazos+this.numeroPies;
		if(brazosYpiernas>0 && brazosYpiernas<=10) {
			
			return true;
			
		}else {
			this.numeroBrazos-=numeroBrazos;
			return false;
		}
	}
	
	//Método agregar piernas
	public boolean agregarPiernas(int numeroPies) {
		this.numeroPies+=numeroPies;
		int brazosYpiernas=this.numeroBrazos+this.numeroPies;
		if(brazosYpiernas>0 && brazosYpiernas<=10) {
			
			return true;
			
		}else {
			this.numeroPies-=numeroPies;
			return false;
		}
	}
	
	//👁️ PARTE 8: OJOS
	//Método Agregar Ojos
	
	public boolean agregarOjos(int numeroOjos) {
		
		int tamanioAlien=this.tamanio;
		if(numeroOjos>0 && numeroOjos<=3 && tamanioAlien>=5 && tamanioAlien<=10) {
			this.numeroOjos=numeroOjos;
			return true;
		}else if(numeroOjos>=4 && numeroOjos<=5 && tamanioAlien>10 && tamanioAlien<=20) {
			this.numeroOjos=numeroOjos;
			return true;
		}else if(numeroOjos>=6 && numeroOjos<=7 && tamanioAlien>20 && tamanioAlien<=30) {
			this.numeroOjos=numeroOjos;
			return true;
		}else {
			return false;
		}
	}
	

}
