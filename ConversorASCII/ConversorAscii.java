import java.util.Scanner;

public class ConversorAscii{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String texto;
		System.out.println("Introduzca un numero y averigua el caracter que pertenece");
		texto = scanner.next();
		int codigo = Integer.parseInt(texto);

		char caracter = (char)codigo;

		System.out.println(caracter);

	}
}