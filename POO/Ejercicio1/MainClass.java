import java.util.Scanner;
import java.util.ArrayList;

public class MainClass{
	public static void main(String args[]){

		// int id;
		// String nombre;
		// int edad;
		// String trabajo;
		// String correo;

		Scanner scanner = new Scanner(System.in);
		ArrayList<Persona> usuarios = new ArrayList<Persona>();
		int id;
		String nombre;
		int edad;
		String trabajo;
		String correo;
		int salir;

		do{
			System.out.println("Menu");
			System.out.println("1. Ingresar un usuario");
			System.out.println("2. Ver lista de usuarios");
			System.out.println("3. Editar un usuario");
			System.out.println("4. Eliminar un usuario");
			System.out.println("0. Salir");
			salir = scanner.nextInt();
			if(salir==1){
				Persona usuario = new Persona(0, "", 0, "", "");
				System.out.println("Id: ");
				id = scanner.nextInt();
				usuario.setId(id);
				System.out.println("Nombre: ");
				nombre = scanner.next();
				usuario.setNombre(nombre);
				System.out.println("Edad: ");
				edad = scanner.nextInt();
				usuario.setEdad(edad);
				System.out.println("Trabajo: ");
				trabajo = scanner.next();
				usuario.setTrabajo(trabajo);
				System.out.println("Correo electronico: ");
				correo = scanner.next();
				usuario.setCorreo(correo);
				usuarios.add(usuario);
			}else if(salir==2){
				for (Persona persona : usuarios) {
					System.out.println("");
					System.out.println("------------------------------------");
					System.out.print("Id: ");
					System.out.println(persona.getId());
					System.out.print("Nombre: ");
					System.out.println(persona.getNombre());
					System.out.print("Edad: ");
					System.out.println(persona.getEdad());
					System.out.print("Trabajo: ");
					System.out.println(persona.getTrabajo());
					System.out.print("Correo: ");
					System.out.println(persona.getCorreo());
				}
			}else if(salir==3){
				System.out.println("Editar");
			}else if(salir == 4){
				System.out.println("Eliminar");
			}
		}while(salir != 0);

		System.out.println("Hola mundo");

	}
}