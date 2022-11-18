package inicial;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int base = 0;
		int altura = 0;
		int area = 0;

		System.out.println("Ingrese el vamor de la base");
		base = in.nextInt();

		System.out.println("Ingrese el vamor de la altura");
		altura = in.nextInt();

		area = base * altura;

		System.out.println("El área del rectángulo es: " + area);
		System.out.println("Fin del proceso ");

	}

}
