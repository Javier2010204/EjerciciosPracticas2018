import java.util.Locale;
import java.util.Scanner;

public class PersonaApp{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        scanner.useLocale(Locale.US);

        System.out.println("Nombre: ");
        System.out.print(">:_");
        String nombre = scanner.next();

        System.out.println("Edad: ");
        System.out.print(">:_");
        int edad = scanner.nextInt();

        System.out.println("Sexo: ");
        System.out.print(">:_");
        char sexo = scanner.next().charAt(0);

        System.out.println("Peso: ");
        System.out.print(">:_");
        double peso = scanner.nextDouble();

        System.out.println("Altura: ");
        System.out.print(">:_");
        double altura = scanner.nextDouble();
    }
}