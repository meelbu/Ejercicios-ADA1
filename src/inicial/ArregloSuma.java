package inicial;

import java.util.Scanner;

public class ArregloSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		// int contador = 0;
		int sumaTotal = 0;
				
		System.out.println("Ingrese 10 numeros");
		// while (contador < 10) {
		// System.out.println("Ingrese el valor " + (contador+1) + ": ");
		// sumaTotal = sumaTotal + scanner.nextInt();
		// contador ++;
		// }
		// System.out.println("La suma total es: " + sumaTotal);

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese el valor " + (i + 1) + ": ");
			sumaTotal = sumaTotal + scanner.nextInt();

		}
		System.out.println("La suma total es: " + sumaTotal);
	}

}


