package com.ipartek.principal;

import java.util.Scanner;

import com.ipartek.clases.Patinete;

public class Principal {
	
	static String opcion = ""; 
	static Scanner sc = null;
	
	static final String OP_ARRANCAR = "1";
	static final String OP_ACELERAR = "2";
	static final String OP_FRENAR = "3";
	static final String OP_PARAR = "4";
	static final String OP_SALIR = "S";
	
	public static void main(String[] args) {
		
		
		Patinete patinete = new Patinete();
		boolean salir = false;

		
		
		do {
			
			
		
			switch (opcion.toUpperCase()) { 
			//switch (opcion) {
			case OP_ARRANCAR:
				patinete.Arrancar();
				break;
			case OP_ACELERAR:
				System.out.println("Introduzca el incremento de velocidad");
				patinete.Acelerar(Integer.parseInt(sc.nextLine()));
				break;	
			case OP_FRENAR:
				System.out.println("Introduzca la disminucion de velocidad");
				patinete.Acelerar(Integer.parseInt(sc.nextLine()));
				break;
			case OP_PARAR:

				break;

			case OP_SALIR:
				salir = true;
				System.out.println("***********  Hasta luego, Lucasss   **************");
				break;
			default:

					System.out.println("Escoge una opcion correcta");

			}
		}while(!salir);
		
	}
	
	private static void crearMenu() {
		System.out.println("************************************");
		System.out.println(" 1.- Arrancar");
		System.out.println(" 2.- Acelerar");
		System.out.println(" 3.- Frenar");
		System.out.println(" 4.- Parar");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		
		System.out.println("\n Selecciona una opcion del menu:");
		//TODO gestionar errores
		opcion = sc.nextLine();	
	}

}
