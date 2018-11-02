import java.util.Scanner;

public class IntentosPassword{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String password = "hola1234";
		int intento = 0;
		String ingreso;

		do{
			System.out.println("Ingresa el password para ingresar");
			ingreso = scanner.next();
			if(ingreso.equals(password)){
				System.out.println("*****************************");
				System.out.println("");
				System.out.println("Enhorabuena");
				System.out.println("");
				System.out.println("*****************************");
				intento = 3;
			}else{
				System.out.println("Intenta de nuevo");
				intento++;
			}
		}while(intento<3);
	}
}