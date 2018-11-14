public class Usuario extends Persona{

    private int idUsuario;
    private String nickName;

    public Usuario(){

    }

    public Usuario(String nombre, String sexo, int edad, int idUsuario, String nickName){

    }

    public void setIdUsuario(int id){
        this.idUsuario = id;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }


}