import java.util.Scanner;

public class ConversorAscciCaracteres{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca un caracter para ver su codigo ASCII");
		char caracter = scanner.next().charAt(0);

		int codigo = (int) caracter;
		System.out.println("Caracter ingresado: " + caracter);
		System.out.println("Codigo ASCII: " + codigo);
	}
}