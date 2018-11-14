import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada{

    public String ingreso(){

        String lectura = null;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try{
            lectura = buffer.readLine();
        }catch(IOException ioe){
            System.out.println("Error en la entrada de datos");
        }

        return lectura;

    }
}