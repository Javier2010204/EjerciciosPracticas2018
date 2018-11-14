import java.util.ArrayList;
import java.io.IOException;

public class ManejadorUsuario{

    private ArrayList<Usuario> listaUsuarios;
    private int idUsuario = 2018000;
    private static ManejadorUsuario instancia;

    public ManejadorUsuario(){
        listaUsuarios = new ArrayList<Usuario>();
    }

    public static ManejadorUsuario getInstancia(){
        if(instancia == null){
            instancia = new ManejadorUsuario();
        }
        return instancia;
    }

    public void setListaUsuarios(Usuario usuario){
        this.listaUsuarios.add(usuario);
        System.out.println("Agregado con exito!");
        System.out.println(" ");
    }

    public ArrayList<Usuario> getListaUsuarios(){
        return listaUsuarios;
    }

    public void agregarUsuario(String nombre, String nombreUsuario, String sexo, int edad){
        Usuario usuario = new Usuario();
        idUsuario = idUsuario + 1;
        usuario.setIdUsuario(idUsuario);
        usuario.setNickName(nombreUsuario);
        usuario.setSexo(sexo);
        usuario.setNombre(nombre);
        usuario.setEdad(edad);
        setListaUsuarios(usuario);
    }

    public void mostrarUsuarios(){
        System.out.println("------ Lista de Usuarios -------");
        for(Usuario user : listaUsuarios){
            System.out.println("Id: " + user.getIdUsuario());
            System.out.println("Nombre: " + user.getNombre());
            System.out.println("NickName: " + user.getNickName());
            System.out.println("Edad: " + user.getEdad());
            System.out.println("Sexo: " + user.getSexo());
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

    public void modificarUsuario(int id, String nuevoNombre){
        for(Usuario user:listaUsuarios){
            if(user.getIdUsuario() == id){
                user.setNickName(nuevoNombre);
                break;
            }
        }
    }

    public void eliminarUsuario(int id){
        for(Usuario user:listaUsuarios){
            if(user.getIdUsuario() == id){
                listaUsuarios.remove(user);
                System.out.println("Eliminado!");
                break;
            }
        }
    }

}