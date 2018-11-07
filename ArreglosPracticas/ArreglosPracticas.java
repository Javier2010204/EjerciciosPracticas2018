import java.util.Scanner;
import java.util.ArrayList;

public class ArreglosPracticas{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();

		String nombre;
		int afirmacion=0;

		do{
			afirmacion=0;
			System.out.println("Ingrese un nombre: ");
			nombre = scanner.next();

			lista.add(nombre);

			System.out.println("Ingrese 1 para salir");
			afirmacion = scanner.nextInt();
		}while(afirmacion != 1);

		System.out.println("los nombres son: " + lista.toString());
	}
}