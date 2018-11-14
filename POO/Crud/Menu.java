import java.io.IOException;

public class Menu{

    public String opcion = "";
    Entrada lectura = new Entrada();
    private String cmd = "";
    private String cmd1 = "";
    ManejadorUsuario manejador = new ManejadorUsuario();

    public void menu(){
        System.out.println(" ");
        System.out.println("---------- MENU ----------");
        System.out.println("-----> 1. Agregar");
        System.out.println("-----> 2. Modificar");
        System.out.println("-----> 3. Listar");
        System.out.println("-----> 4. Eliminar");
        System.out.println("-----> Salir ");
        System.out.println(" ");
    }

    public void iniciar(){
        do{
            menu();
            System.out.print(":>_");
            opcion = lectura.ingreso();

            switch(opcion){
                case "1":
                    addUser();
                    break;
                case "2":
                    updateUser();
                    break;
                case "3":
                    userList();
                    break;
                case "4":
                    deleteUser();
                    break;
                default:
                    if(opcion.equals("salir")){
                        break;
                    }
                    System.out.println("El comando " + opcion + " no se reconoce");
                    break;
            }
        }while(!opcion.equals("salir"));
    }

    public void addUser(){
        String nombre,nick,sexo;
        int edad;
        
        System.out.print("Nombre >:_");
        nombre = lectura.ingreso();

        System.out.print("NickName >:_");
        nick = lectura.ingreso();

        System.out.print("Sexo >:_");
        sexo = lectura.ingreso();

        System.out.print("Edad >:_");
        try{
            edad = Integer.parseInt(lectura.ingreso());
            manejador.getInstancia().agregarUsuario(nombre, nick, sexo, edad);
        }catch(Exception exc){
            System.out.println("Ingreso una letra se esperaba un numero");
        }

    }

    public void updateUser(){
        System.out.print("Id >:_");
        cmd = lectura.ingreso();
        System.out.println("Nuevo Nick >:_");
        cmd1 = lectura.ingreso();

        manejador.getInstancia().modificarUsuario(Integer.parseInt(cmd), cmd1);
    }

    public void userList(){
        manejador.getInstancia().mostrarUsuarios();
    }

    public void deleteUser(){
        System.out.print("Id >:_");
        cmd = lectura.ingreso();
        manejador.getInstancia().eliminarUsuario(Integer.parseInt(cmd));
    }


}