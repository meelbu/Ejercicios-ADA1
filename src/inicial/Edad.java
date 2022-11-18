package inicial;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int añoNac = 0;
		int añoActual = 0;
		int edad = 0;

		System.out.println("Ingrese el año de tu nacimiento ");
		añoNac = in.nextInt();

		System.out.println("Ingrese el año actual ");
		añoActual = in.nextInt();

		edad = añoActual - añoNac;

		System.out.println("Tu edad es " + edad);

	}

}
