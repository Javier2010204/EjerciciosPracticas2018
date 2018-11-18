public class Password{

    private final static int LONG = 8;
    private int longitud;
    private String contrasenia;

    public Password(){

    }

    public Password(int longitud){

    }

    esFuerte(String contrasenia){
        //2 mayusculas 2minusculas y 5 numeros
        
    }

    generarPassword(){
        String password = "";

        for(int i=0;i = 0; i++){
            int eleccion = ((int)Math.floor(Math.random()*3+1));

            if(eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }else{
                if(eleccion==2){
                    char mayusculas = (char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }else{
                    char numeros = (char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
    }

    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    public int getLongitud(){
        return longitud;
    }

    public String getContrasenia(){
        return contrasenia;
    }
}