package inicial;

import java.util.Scanner;

public class EnergíaElectrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double kw;
		double costo;

		System.out.println("Ingrese los kilowatts consumidos ");
		kw = in.nextDouble();

		System.out.println("Ingrese el costo por un kilowatt ");
		costo = in.nextDouble();

		Double total = kw * costo;

		System.out.println("El pago a realizar es de " + total);

	}

}
