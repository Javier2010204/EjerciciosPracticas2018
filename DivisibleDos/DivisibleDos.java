import java.util.Scanner;

public class DivisibleDos{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un numero");
		int numero = scanner.nextInt();
		if(numero%2 == 0){
			System.out.println("El numero se puede dividir dentro de 2");
		}else{
			System.out.println("El numero no se puede dividir dentro de 2");
		}
	}
}