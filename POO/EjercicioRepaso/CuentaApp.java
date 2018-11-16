public class CuentaApp{
    public static void main(String args[]){

        Cuenta cuenta_1 = new Cuenta("Javier");
        Cuenta cuenta_2 = new Cuenta("Fernando", 500);

        cuenta_1.ingresar(20000);
        cuenta_2.ingresar(400);

        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
}