package inicial;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int N1 = 0;
		int N2 = 0;
		int N3 = 0;
		int N4 = 0;
		int suma = 0;
		int promedio = 0;

		System.out.println("Ingrese la calificacion 1:");
		N1 = scanner.nextInt();

		System.out.println("Ingrese la calificacion 2:");
		N2 = scanner.nextInt();

		System.out.println("Ingrese la calificacion 3:");
		N3 = scanner.nextInt();

		System.out.println("Ingrese la calificacion 4:");
		N4 = scanner.nextInt();

		suma = N1 + N2 + N3 + N4;
		promedio = suma / 4;

		System.out.println("El promedio de las calificaciones es: " + promedio);
	}

}
