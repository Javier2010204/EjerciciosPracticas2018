import java.util.Scanner;

public class NumerosAleatorios{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int rangoInicial;
		int rangoFinal;

		System.out.println("Ingrese el rango inicial");
		rangoInicial = scanner.nextInt();
		System.out.println("Ingrese el rango final");
		rangoFinal = scanner.nextInt();
		System.out.println("Generando random entre " + rangoInicial + " y " + rangoFinal);
		System.out.print(".");
		System.out.print("..");
		System.out.println("...");
		for (int i = 0; i < 10 ; i++ ) {
			int numeroAleatorio = (int)Math.floor(Math.random()*(rangoInicial-rangoFinal)+rangoFinal);
			System.out.println(numeroAleatorio);
		}
	}
}