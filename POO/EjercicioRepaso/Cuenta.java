public class Cuenta{

    String titular;
    double cantidad;

    public Cuenta(String titular){
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if(cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad = cantidad;
        }
        
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }else{
            this.cantidad -= cantidad;
        }
    }

    @Override
    public String toString(){
        return "el titular " + titular + " tiene " + cantidad + " de dolares en la cuenta";
    }
}