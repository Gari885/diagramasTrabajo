package org.cuatrovientos.dam.entorno.ejercicio6;

import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		
		System.out.println("Gestor De Cuenta");
		System.out.println("Que desea hacer?");
		do {
			System.out.println("Que desea hacer?");
			System.out.println("1...Crear Cuenta");
			System.out.println("2...Mostar Cuentas");
			System.out.println("3...Salir");
			opcion = scanner.nextInt();
			if (opcion == 1) {
				System.out.println("Elije el tipo de cuenta que quieres crear") ;
				System.out.println("1-Cuenta Ordinaria");
				System.out.println("2-Cuenta de ahorro");
				System.out.println("3-CuentaCorriente");
				opcion = scanner.nextInt();
				if (opcion == 1) {
					//Aqui crearia la cuenta//
				}
					
				
			}
			if (opcion == 2 ) {
				//Aqui mostaria las cuentas que tiene//
			}
			
		}	while (opcion != 3);

			
	}

}
