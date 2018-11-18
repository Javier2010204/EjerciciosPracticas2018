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

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        persona1.setNombre("Javier");
        persona1.setEdad(22);
        persona1.setSexo('H');
        persona1.setPeso(120);
        persona1.setAltura(1.75);

        persona2.setPeso(90.5);
        persona2.setAltura(1.50);

        System.out.println("Persona 1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());

    }

    public static void MuestraMensajePeso(Persona persona){
        int IMC = persona.calcularIMC();

        switch(IMC){
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBRE_PESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona persona){
        if(persona.esMayorDeEdad()){
            System.out.print("la persona es mayor de edad");
        }else{
            System.out.println("La persona no es mayor de edad");
        }
    }
}