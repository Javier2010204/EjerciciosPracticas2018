import java.util.Scanner;

public class EcuacionCuadratica{
	public static void main(String args[]){

		int a = 0;
		int b = 0;
		int c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el valor de a: ");
		a = sc.nextInt();
		System.out.println("Ingrese el valor de b: ");
		b = sc.nextInt();
		System.out.println("Ingrese el valor de c: ");
		c = sc.nextInt();

		int raiz = Math.sqlrt(int Math.pow(b, 2) - 4*a*c);
		System.out.println(raiz);


	}
}