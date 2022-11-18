package inicial;

import java.util.Scanner;

public class HotelCamaArena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int dias;
		double costo, total;

		System.out.println("Ingrese la cantidad de días de la estancia");
		dias = in.nextInt();

		System.out.println("Ingrese el costo de la estancia por día ");
		costo = in.nextDouble();

		total = dias * costo;

		System.out.println("El precio a pagar por la estancia de " + dias + "días es " + total);

	}

}
