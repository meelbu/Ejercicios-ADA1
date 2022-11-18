package inicial;

public class Alberca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Altura = 1;
		int largo = 5;
		int ancho = 3;
		int costomc=200;
		
		int volumen= largo * ancho * Altura;
		
		int pago = volumen * costomc;
		
		System.out.println("El pago a realizar es de " + pago);
	}

}
