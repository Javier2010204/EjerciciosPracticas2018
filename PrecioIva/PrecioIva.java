import java.util.Scanner;

public class PrecioIva{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		final float iva = 0.21f;

		System.out.println("Ingrese el precio de un producto");
		float precio = scanner.nextFloat();
		float precioIva = precio * iva;

		System.out.println("El precio con iva es:" + (precioIva + precio));
	}
}