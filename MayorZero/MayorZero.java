import java.util.Scanner;

public class MayorZero{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int numero;
		do{
			System.out.println("Ingrese un numero");
			numero = scanner.nextInt();
		}while(numero <= 0);
		System.out.println(numero);
	}
}