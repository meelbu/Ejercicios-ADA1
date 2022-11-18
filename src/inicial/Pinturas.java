package inicial;

import java.util.Scanner;

public class Pinturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int metros;
		float precio, total;

		System.out.println("Ingrese los metros que desee pintar ");
		metros = in.nextInt();

		System.out.println("Ingrese el precio de los metros cuadrados ");
		precio = in.nextInt();

		total = metros * precio;

		System.out.println("El precio total es" + total);

	}

}
