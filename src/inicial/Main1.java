package inicial;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner libreria para introducir datos por teclado, numeros, palabras etc
		// in ejemplo de nombre del dato
		// system.in es el metodo para poder invocar el scanner
		Scanner in = new Scanner(System.in);
		// declarar valores de los nuemros a utilizar
		int numUno = 0, numDos = 0, resultado = 0;

		System.out.println("Dame el primer valor: ");
		numUno = in.nextInt();
		// numUno= in.nextDouble();
		// nombre= in.nextString();

		System.out.println("Dame el segundo valor: ");
		numDos = in.nextInt();

		resultado = numUno + numDos;

		System.out.println("El resultado de la suma es: " + resultado);

	}
}
