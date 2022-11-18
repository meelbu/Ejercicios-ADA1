package inicial;

import java.util.Scanner;

public class CircuitoElectrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double potencia, I, R, V;

		System.out.println("Ingrese la corriente electrica");
		I = in.nextDouble();

		R = 4;

		V = I * R;

		potencia = V * I;

		System.out.println("La potencia electrica del circuito es " + potencia);

	}

}
