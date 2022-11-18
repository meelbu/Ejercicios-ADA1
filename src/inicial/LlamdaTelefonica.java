package inicial;

import java.util.Scanner;

public class LlamdaTelefonica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double costo, total;
		int minutos;

		System.out.println("Ingrese la duracion de la llamada en minutos ");
		minutos = in.nextInt();

		System.out.println("Ingrese el costo por minuto ");
		costo = in.nextDouble();

		total = minutos * costo;

		System.out.println("El costo a pagar por " + minutos + "minutos de la llamada es " + total);

	}

}
