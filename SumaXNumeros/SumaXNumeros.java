import java.util.Scanner;
import java.util.ArrayList;

public class SumaXNumeros{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int cantidad;
		String salir;

		do{
			System.out.println("Ingrese un numero");
			cantidad = scanner.nextInt();
			System.out.println("Desea salir? (Y/N)");
			salir = scanner.next();
		}while(!salir.equals("Y"));

	}
}