import java.util.Scanner;
import java.util.ArrayList;

public class MainClass{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		ArrayList<Persona> usuarios = new ArrayList<Persona>();
		String nombre;
		String salir;
		do{
			Persona usuario = new Persona();
			System.out.println("Ingrese un nombre");
			nombre = scanner.next();
			usuario.setNombre(nombre);
			usuarios.add(usuario);
			System.out.println("Si desea salir escriba salir");
			System.out.print(">");
			salir = scanner.next();
		}while(!salir.equals("salir"));

		for (Persona persona : usuarios) {
			System.out.println(persona.getNombre());
		}


	}
}