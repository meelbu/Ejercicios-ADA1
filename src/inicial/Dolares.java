package inicial;

import java.util.Scanner;

public class Dolares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dol = new Scanner(System.in);

		float dolar, peso, conversion;

		System.out.println("Ingrese una cantidad en pesos");
		peso = dol.nextFloat();

		System.out.println("Ingrese el precio del dolar");
		dolar = dol.nextFloat();

		conversion = peso / dolar;

		System.out.println(peso + " convertido en dolares es " + conversion);

	}

}
