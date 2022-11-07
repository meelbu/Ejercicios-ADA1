package inicial;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int suma = 0;
		int promedio = 0;

		System.out.println("Ingrese la calificacion 1:");
		int N1 = scanner.nextInt();
		System.out.println("Ingrese la calificacion 2:");
		int N2 = scanner.nextInt();
		System.out.println("Ingrese la calificacion 3:");
		int N3 = scanner.nextInt();
		System.out.println("Ingrese la calificacion 4:");
		int N4 = scanner.nextInt();

		suma = N1 + N2 + N3 + N4;
		promedio = suma / 4;

		System.out.println("El promedio de las calificaciones es: " + promedio);
	}

}
