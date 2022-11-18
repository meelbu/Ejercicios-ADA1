package inicial;

import java.util.Scanner;

public class Estacionamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		float precio = 0;
		float total = 0;
		float horas = 0;

		System.out.println("Ingrese el precio por hora ");
		precio = in.nextFloat();

		System.out.println("Ingrese las horas de estacionamiento");
		horas = in.nextFloat();

		total = horas * precio;

		System.out.println("El precio a pagar es " + total);

	}

}
