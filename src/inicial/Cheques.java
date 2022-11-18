package inicial;

import java.util.Scanner;

public class Cheques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Una empresa desea determinar el monto de un cheque que debe proporcionar
		// a uno de sus empleados que tendrá que ir por equis número de días a la
		// ciudad de Monterrey; los gastos que cubre la empresa son: hotel, comida y
		// 100.00 pesos diarios para otros gastos.
		// El monto debe estar desglosado para cada concepto.

		Scanner in = new Scanner(System.in);

		Double montoCh, dias, hotel, comida, gastoHotel, gastoComida, otrosGastos;

		System.out.println("Ingrese la cantidad de dias del viaje");
		dias = in.nextDouble();

		System.out.println("Ingrese el monto del hotel por día");
		hotel = in.nextDouble();

		System.out.println("Ingrese el gasto en comida por día");
		comida = in.nextDouble();

		gastoHotel = dias * hotel;

		gastoComida = dias * comida;

		otrosGastos = dias * 100;

		montoCh = gastoHotel + gastoComida + otrosGastos;

		System.out.println("El gasto en el hotel es: $" + gastoHotel);
		System.out.println("El gasto en comida es de: $" + gastoComida);
		System.out.println("El monto del dinero para otros gastos es de: $" + otrosGastos);
		System.out.println("El monto total del cheque debe ser de: $" + montoCh);

	}

}
