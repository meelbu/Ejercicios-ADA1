package inicial;

import java.util.Scanner;

public class ConsumoAgua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner h2o = new Scanner(System.in);

		double mc;
		double pago;

		System.out.println("Ingrese los metros cubicos de agua consumidos ");
		mc = h2o.nextDouble();

		System.out.println("Ingrese el costo por un metro cubico de agua ");
		pago = h2o.nextDouble();

		Double total = mc * pago;

		System.out.println("El pago a realizar es de " + total);

	}

}
