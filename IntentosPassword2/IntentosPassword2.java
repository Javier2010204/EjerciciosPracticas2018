import java.util.Scanner;

public class IntentosPassword2{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		final int INTENTOS = 3;
		boolean acierto = false;
		String password = "hola1234";

		for (int i=0;i < INTENTOS;i++) {
			System.out.println("Ingrese el password.");
			System.out.print(">");
			String texto = scanner.next();
			if(texto.equals(password) && !acierto){
				System.out.println("Enhorabuena");
				acierto = true;
				i = 3;
			}
		}
	}
}