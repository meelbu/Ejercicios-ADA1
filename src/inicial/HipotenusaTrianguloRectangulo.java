package inicial;

import java.util.Scanner;

public class HipotenusaTrianguloRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese el valor del primer cateto");
		int cateto1 = in.nextInt();

		System.out.println("Ingrese el valor del segundo cateto");
		int cateto2 = in.nextInt();

		int hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);

		System.out.println("La hipotenusa es " + hipotenusa);

	}

}
