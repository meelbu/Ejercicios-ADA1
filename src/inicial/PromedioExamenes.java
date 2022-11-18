package inicial;

import java.util.Scanner;

public class PromedioExamenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double nota1, nota2, nota3;

		System.out.println("Ingrese la nota del Examen 1");
		nota1 = in.nextDouble();

		System.out.println("Ingrese la nota del Examen 2");
		nota2 = in.nextDouble();

		System.out.println("Ingrese la nota del Examen 3");
		nota3 = in.nextDouble();

		System.out.println("El 25% del Examen 1 es " + nota1 * .25);

		System.out.println("El 25% del Examen 2 es " + nota2 * .25);

		System.out.println("El 50% del Examen 3 es " + nota3 * .50);


		System.out.println("El promedio final es " + (nota1 * .25 + nota2 * .25 + nota3 * .50));

	}

}
