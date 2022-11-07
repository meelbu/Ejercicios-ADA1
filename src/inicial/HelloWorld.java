package inicial;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {// 11
		// TODO Auto-generated method stub
		// comentario de una linea
		System.out.println("hola mundo");
		System.out.println();
		System.out.println("hola mundo");

		// declaracion de una variable
		// tipo de dato, nombre de variable = valor;

		int var1 = 1;
		System.out.println(var1);

		String cadena = "texto1";
		System.out.println(cadena + " " + cadena + " " + var1);

		System.out.print("Hola! Ingrese su nombre: ");

		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.next(); // leer

		System.out.println("Ingrese ciudad:");
		String ciudad = scanner.next();

		System.out.println("Bienvenidx: " + nombre);
		System.out.println("Ciudad: " + ciudad);

		// Ingrese por teclado su dni y su fecha de nacimientto,
		// luego mostrar ambos valores por consola

		System.out.println("Ingrese su DNI:");

		String dni = scanner.next();

		System.out.println("Ingrese su fecha de nacimiento: ");

		String fechaDeNacimiento = scanner.next();
		System.out.println("DNI:" + dni);
		System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
	//------------------------------------------------------------------
	System.out.println("Ingrese cantidad de personas del grupo familiar");
	int integrantes = scanner.nextInt();
	if (integrantes > 3) {
		System.out.println("Familia numerosa");
	} else if (integrantes == 1) {
		System.out.println("Familia unipersonal");
	} else {
		System.out.println("Familia no numerosa");
	}

	switch (integrantes) {
	case 1:
		System.out.println("Familia unipersonal case");
		break;
	case 2:
		System.out.println("Familia pareja");
		break;
	case 3:
		System.out.println("Familia pareja + 1 hijo/a");
		break;
	default:
		System.out.println("Familia numerosa");
		break;

	}
	// --- bucles de repeticion
	for (int i = 0; i < integrantes; i++) {
		System.out.println("Bienvenido Integrante: " + i);
	}

	while (integrantes < 1) {
		System.out.println("Ingreso incorrecto. Ingrese nuevamente integrantes");
		integrantes = scanner.nextInt();
	}
	do {
		System.out.println("do . . .");
		System.out.println("Ingrese nuevamente intgrantes ");
		integrantes = scanner.nextInt();
	} while (integrantes > 3);
}

    }


