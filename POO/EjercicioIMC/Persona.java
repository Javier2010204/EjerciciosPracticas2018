public class Persona{

    private final static char SEXO = 'H';
    private final static int INFRAPESO = -1;
    private final static int PESO_IDEAL = 0;
    private final static int SOBRE_PESO = 1;

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;


    public Persona(){
        this("",0, SEXO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo){
        this(nombre,edad,sexo,0,0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        comprobarSexo();
    }

    private void comprobarSexo(){
        if(sexo != 'H' && sexo != 'M'){
            this.sexo = SEXO;
        }
    }

    private void generarDNI(){
        final int divisor = 23;
        int numDNI = ((int)Math.floor(Math.random() * (100000000 - 10000000)+ 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        char letraDNI = generaLetraDNI(res);

        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res){
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }
}