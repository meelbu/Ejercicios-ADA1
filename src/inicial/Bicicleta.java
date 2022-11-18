package inicial;

import java.util.Scanner;

public class Bicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		float tiempo;
		float distancia;
		float velocidad;

		System.out.println("Ingrese la distancia en kilometros a recorrer ");
		distancia = in.nextFloat();

		System.out.println("Ingrese la velocidad en kilometros por hora");
		velocidad = in.nextFloat();

		tiempo = distancia / velocidad;

		System.out.println("El tiempo que se tardará es " + tiempo);

	}

}
