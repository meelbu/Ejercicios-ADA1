package inicial;

public class Terrenos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radio;
		double PI, areaCircunferencia, areaTriangulo, areaRectangulo, area;

		PI = 3.1416;
		radio = 985;
		areaCircunferencia = 782;

		areaTriangulo = (radio * (PI - areaCircunferencia) / 2);

		areaRectangulo = radio * PI;

		area = areaTriangulo + areaRectangulo;

		System.out.println("El área del terreno es: " + area);
		System.out.println("Fin del proceso ");

	}

}
