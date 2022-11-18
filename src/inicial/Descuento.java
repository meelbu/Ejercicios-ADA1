package inicial;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		double precio, descuento, iva, precioDescuento, precioFin;

		System.out.println("Ingrese el precio del producto ");
		precio = in.nextDouble();

		descuento = precio * .20;

		precioDescuento = precio - descuento;

		iva = precioDescuento * .15;

		precioFin = precioDescuento + iva;

		System.out.println("El descuento realizado a su compra es de: $ " + descuento);

		System.out.println("El precio con el descuento es: $ " + precioDescuento);

		System.out.println("El recargo del iva es de: $ " + iva);

		System.out.println("El total a pagar es: $ " + precioFin);

	}

}
