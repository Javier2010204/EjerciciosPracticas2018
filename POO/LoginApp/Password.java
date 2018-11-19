public class Password{

    private final static int LONG = 8;
    private int longitud;
    private String contrasenia;

    public Password(){
        this(LONG);
    }

    public Password(int longitud){
        this.longitud = longitud;
        contrasenia = generarPassword();
    }

    public String generarPassword(){
        String password = "";

        for(int i=0;i<longitud; i++){
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

    public boolean esFuerte(){
        //2 mayusculas 2minusculas y 5 numeros
        int cuentaNumeros = 0;
        int cuentaMayusculas = 0;
        int cuentaMinusculas = 0;

        // busca el tipo de caracter segun la tabla ASCII
        for(int i=0; i<contrasenia.length(); i++){
            if(contrasenia.charAt(i)>=97 && contrasenia.charAt(i)<=122){
                cuentaMinusculas += 1;
            }else if(contrasenia.charAt(i)>=65 && contrasenia.charAt(i)<=90){
                cuentaMayusculas += 1;
            }else{
                cuentaNumeros += 1;
            }
        }
        //verificacion para saber si la contraseña es fuerte o no
        if(cuentaNumeros>=5 && cuentaMayusculas >= 2 && cuentaMinusculas >= 1){
            return true;
        }else{
            return false;
        }
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