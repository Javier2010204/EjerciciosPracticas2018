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

		double cuadrado = Math.pow(b, 2);
		double cuatroAc = 4*a*c;
		double discriminante = cuadrado - cuatroAc;
		if(discriminante < 0){
			System.out.println("Operacion no valida");
		}else{
			//System.out.println(multiplicacionAC);
			double raiz = Math.sqrt(multiplicacionAC);
			//System.out.println(raiz);
			double divisor = 2*a;
			double negativo = -b;
			//System.out.println(divisor);
			//System.out.println(negativo);
			double X1 = (negativo + raiz)/divisor;
			double X2 = (negativo - raiz)/divisor;
			System.out.println(X1);
			System.out.println(X2);
		}

	}
}



// Math.sqrt(4); 