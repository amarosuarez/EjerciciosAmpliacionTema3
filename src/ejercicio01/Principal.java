package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Variable donde se almacenará la opción del menú
		int opcion;
		
		// Variable donde se almacenará el número introducido por el usuario
		int numero;
		
		// Obtenemos la opción del menú
		opcion = menu();
		
		if (opcion != 0) {
			// Obtenemos el número introducido
			numero = pideNumero();
			
			// Creamos un nuevo objeto número con el número obtenido
			Numeros numeros = new Numeros(numero);
			
			// Según la opción elegida mostramos el mensaje y el resultado
			switch (opcion) {
				case 1:
					if (numeros.esPrimo()) {
						System.out.print("El " + numero + " es primo");
					} else {
						System.out.print("El " + numero + " no es primo");
					}
					break;
				case 2:
					if (numeros.esCapicua()) {
						System.out.println("El " + numero + " es capicúa");
					} else {
						System.out.println("El " + numero + " no es capicúa");
					}
					break;
			}
		} else {
			System.out.println("Hasta luego");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
	static int menu() {
		// Variable donde se almacenará la opción del menú
		int opcion = -1;
		
		do {
			
			try {
				
				// Mostramos las opciones
				System.out.println("¿Qué deseas hacer?"
						+ "\n1. Comprobar si es primo"
						+ "\n2. Comprobar si es capicúa"
						+ "\n0. Salir");
				
				// Guardamos la opción
				opcion = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("Valor mal introducido");
				sc.nextLine();
			}
			
		} while (opcion < 0 || opcion > 2);
		
		// Retornamos la opción
		return opcion;
	}
	
	static int pideNumero() {
		// Variable donde se almacenará el número introducido
		int numero = -1;
		
		do {
		
			try {
				
				// Pedimos y almacenamos el número
				System.out.println("Introduzca un número");
				numero = sc.nextInt();
				
				
			} catch (InputMismatchException e) {
				System.out.println("Valor mal introducido");
				sc.nextLine();
			}
			
		} while (numero < 0);
		
		// Retornamos el número
		return numero;
	}
	
}
