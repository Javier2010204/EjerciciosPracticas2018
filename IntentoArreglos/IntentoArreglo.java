import java.util.Scanner;
import java.util.ArrayList;

public class IntentoArreglo{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String nombre;
		ArrayList<String> listaAmigos = new ArrayList<String>();

		System.out.println("Ingrese los nombres de sus amigos, cuando desee salir presione 0");

		do{

			System.out.println("Ingrese un nombre: ");
			nombre = scanner.next();
			
			if (!"0".equals(nombre)) {
				listaAmigos.add(nombre);	
			}

		}while(!"0".equals(nombre));

		System.out.println("-----------------------------------------");
		System.out.println("********** Listado de amigos ************");
		for(String amigo:listaAmigos){
			System.out.println("> " + amigo);
		}
		System.out.println("-----------------------------------------");

	}
}