import java.util.Scanner;

public class EcuacionCuadratica{
	public static void main(String args[]){

		double a = 0;
		double b = 0;
		double c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el valor de a: ");
		a = sc.nextDouble();
		System.out.println("Ingrese el valor de b: ");
		b = sc.nextDouble();
		System.out.println("Ingrese el valor de c: ");
		c = sc.nextDouble();

		double discriminante = Math.pow(b, 2)-(4*a*c);
		if(discriminante > 0){
			//System.out.println(multiplicacionAC);
			double raiz = Math.sqrt(discriminante);
			//System.out.println(raiz);
			double divisor = 2*a;
			//System.out.println(divisor);
			//System.out.println(negativo);
			double X1 = ((b*-1)+raiz)/(2*a);
			double X2 = ((b*-1)-raiz)/(2*a);
			System.out.println(X1);
			System.out.println(X2);
		}else{
			System.out.println("Operacion no valida");
		}

	}
}



// Math.sqrt(4); 