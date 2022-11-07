package inicial;

import java.util.Scanner;

public class SumaVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector1, vector2, vector3;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de elementos de los vectores :");
		int dimension = scanner.nextInt();

		vector1 = new int[dimension];
		vector2 = new int[dimension];
		vector3 = new int[dimension];

		for (int i = 0; i < dimension; i++) {
			System.out.println("Ingrese un numero para el vector 1: ");
			int numero = scanner.nextInt();
			vector1[i] = numero;

		}

		for (int i = 0; i < dimension; i++) {
			System.out.println("Ingrese un numero para el vector 2: ");
			int numero = scanner.nextInt();
			vector2[i] = numero;
		}

		for (int i = 0; i < dimension; i++) {
			vector3[i] = vector1[i] + vector2[i];

		}

		for (int i = 0; i < dimension; i++) {
			System.out.println("El elemento " + (i + 1) + " para la suma del vector 1 y 2: " + vector3[i]);

		}

	}


	}


