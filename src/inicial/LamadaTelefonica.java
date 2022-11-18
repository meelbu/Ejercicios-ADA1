package inicial;

import java.util.Scanner;

public class LamadaTelefonica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		float costoMinuto;
		float tiempo;
		float total;

		System.out.println("Ingrese el tiempo de la llamada en minutos");
		tiempo = in.nextFloat();

		System.out.println("Ingrese el costo del minuto de llamada");
		costoMinuto = in.nextFloat();

		total = costoMinuto * tiempo;

		System.out.println("El costo de la llamada es de " + total);

	}

}
