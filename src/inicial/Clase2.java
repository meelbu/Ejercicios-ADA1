package inicial;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tipo de Datos Primitivos - entros - decimales - objetos

		Scanner in = new Scanner(System.in);

		/*
		 * String nombre = "Maru"; int num3 = 9; double num4 = 333.99; char prueba =
		 * 'F'; boolean prueba2 = true;
		 * 
		 * String nom; int valor;
		 * 
		 * nom = "Juan"; valor = 2;
		 * 
		 * int a = 2; int b = 5; int resultado = 0;
		 * 
		 * resultado = a + b; System.out.println("resultado:" + resultado);
		 */

		int num = 0;
		int num2 = 0;
		int resultado = 0;

		System.out.println("Dame el primer valor");
		num = in.nextInt();

		System.out.println("Dame el segundo valor");
		num2 = in.nextInt();

		resultado = num + num2;
		System.out.println("El valor es: " + resultado);
	}

}
