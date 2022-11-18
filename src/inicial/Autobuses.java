package inicial;

import java.util.Scanner;

public class Autobuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int costoBoleto;
		int km;

		System.out.println("Ingrese los kilomentros a recorrer");
		km = in.nextInt();

		System.out.println("Ingrese el costo del boleto por kilometro");
		costoBoleto = in.nextInt();

		int total = km * costoBoleto;

		System.out.println("El costo por el viaje es " + total);

	}

}
