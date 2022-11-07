package inicial;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Presentar 4 opciones: 1. Altas 2. Bajas 3. Listado 4.Salir
		//Se muestra en pantalla el menu mientras que no se seleccione el codigo para salir
		//en caso de que se elija una funcion se debera mostrar por pantalla el titulo del menu



		//generar una funcion menu para mostrar el menu de opciones y que devuelva la opcion seleccionada

		
		System.out.println("Seleccione la opción deseada: 1. Altas - 2. Bajas - 3. Listado - 4. Salir");
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        while (menu != 4) {
            switch (menu) {

            case 1:
                System.out.println("Altas");
                break;
            case 2:
                System.out.println("Bajas");
                break;
            case 3:
                System.out.println("Listado");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;

            }
            System.out.println("Seleccione la opción deseada: 1. Altas - 2. Bajas - 3. Listado - 4. Salir");
            menu = scanner.nextInt();
        }
    


	}

}
