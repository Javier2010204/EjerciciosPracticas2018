import java.util.Scanner;

public class Saludo{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String nombre;

		System.out.println("Ingresa tu nombre");
		nombre = sc.next();
		System.out.println("Hola " + nombre);
	}
}