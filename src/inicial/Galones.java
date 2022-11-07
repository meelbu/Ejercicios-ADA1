package inicial;

public class Galones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double litros, ganancia, precio, cantidad;

		litros = 96.000;
		precio = 18.925;

		cantidad = litros / 3.785;
		ganancia = precio * cantidad;

		System.out.println(
				"El productor de leche recibirá $ " + ganancia + " por la entrega de su produccion de un dia. ");
		System.out.println("Fin del proceso. ");
	}

}
