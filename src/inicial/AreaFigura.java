package inicial;

public class AreaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int baseTriangulo, hTriRect, radio, HipTriRect;
		double PI, R, AreaCirc, CatFalt, AreaTriangulo, Area;
		hTriRect = 96;
		radio = 56;
		R = hTriRect + radio;
		PI = 3.1416;
		HipTriRect = 91;

		CatFalt = (HipTriRect * HipTriRect - R * R);

		AreaTriangulo = 2 * (R * CatFalt) / 2;
		AreaCirc = (PI * R * R) / 2;

		Area = AreaTriangulo + AreaCirc;

		System.out.println("El area de la figura es: " + Area);
		System.out.println("Fin del proceso. ");

	}

}
