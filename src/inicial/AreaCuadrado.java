package inicial;

import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int Area, B;

		System.out.println("Ingrese el valor de los lados");
		B = in.nextInt();

		Area = B * B;

		System.out.println("El area de un cuadrado es " + Area);

	}

}
