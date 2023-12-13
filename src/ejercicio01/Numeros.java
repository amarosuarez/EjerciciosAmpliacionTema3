package ejercicio01;

public class Numeros {
	
	int numero;

	public Numeros() {}
	
	public Numeros(int numero) {
		this.numero = numero;
	}
	
	// Función que comprueba si es primo
	boolean esPrimo() {
		// Booleano que almacena si el número es primo o no
		boolean esPrimo = true;
		
		// Bucle que recorre los números desde el 2 hasta el numero - 1
		for (int i=2; i<numero; i++) {
			
			/* Comprueba si es divisible por otro número y en caso afirmativo,
			 * cambia el valor de esPrimo a false*/
			if (numero%i==0) {
				esPrimo = false;
				break;
			}
		}
		
		// Devuelve si es primo o no
		return esPrimo;
	}
	
	// Función que comprueba si es capicúa
	boolean esCapicua() {
		// Booleano que almacena si el número es capicúa o no
		boolean esCapicua = false;
		
		// Auxiliar para no modificar la variable numero
		int original = numero;
		
		// Variable donde se almacenará el número invertido
		int numInvertido = 0;
		
		while (original > 0) {
			// Obtenemos el último dígito
			int digito = original % 10;
			
			// Añadimos el dígito al número invertido
			numInvertido = numInvertido * 10 + digito;

			// Le quitamos al original el último dígito
			original /= 10;
		}
		
		// Comprueba si el número es igual al número invertido
		if (numero == numInvertido) esCapicua = true;
		
		// Devuelve si el número es capicúa o no
		return esCapicua;
	}
	
}
