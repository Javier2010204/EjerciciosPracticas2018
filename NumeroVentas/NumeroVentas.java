import java.util.Scanner;

public class NumeroVentas{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduzca el numero de ventas a realizar: ");
		int numeroVentas = scanner.nextInt();

		for (int i = 0;i <= numeroVentas ; i++ ) {
			System.out.println("Introduzca el monto de la venta No." + i);
			int monto = scanner.nextInt();
			int suma = 0;
			suma = monto + suma;
			System.out.println("Suma " + suma);
		}
	}
}