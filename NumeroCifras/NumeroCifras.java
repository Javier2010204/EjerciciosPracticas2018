import java.util.Scanner;


public class NumeroCifras{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		int numero=0;

		do{
			System.out.println("Ingrese un numero entero positivo");
			numero = scanner.nextInt();
		}while(numero<0);int contador=0;for(int i=numero;i>0;i/=10) {
			contador++;
		}

		if (contador==1) {
			System.out.println("El numero " + numero + " tiene " + contador + " cifras");
		}else{
			System.out.println("El numero " + numero + " tiene " + contador + " cifras");
		}
	}
}