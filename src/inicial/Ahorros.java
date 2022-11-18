package inicial;

import java.util.Scanner;

public class Ahorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		Double sueldo, ahorroSemanal, ahorroMes, ahorroAño;

		System.out.println("Ingrese el monto total de su sueldo mensual");
		sueldo = in.nextDouble();

		ahorroSemanal = sueldo * .15;
		ahorroMes = ahorroSemanal * 4;
		ahorroAño = ahorroMes * 12;

		System.out.println("Tu ahorro semanal es de: $" + ahorroSemanal);

		System.out.println("Tu ahorro anual es de: $" + ahorroAño);

	}

}
