import java.util.Scanner;

public class DiaLaboral{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String dia;

		System.out.println("Ingrese un dia de la semana");
		dia = scanner.next();

		switch(dia){
			case "lunes": 
				System.out.println("Dia laboral");
				break;
			case "martes":
				System.out.println("Dia laboral");
				break;
			case "miercoles":
				System.out.println("Dia laboral");
				break;
			case "jueves":
				System.out.println("Dia laboral");
				break;
			case "viernes":
				System.out.println("Dia laboral");
				break;
			case "sabado":
				System.out.println("Dia libre");
				break;
			case "domingo":
				System.out.println("Dia libre");
				break;
			default:
				System.out.println("Ingresaste datos incorrectos");
				break;

		}

	}
}