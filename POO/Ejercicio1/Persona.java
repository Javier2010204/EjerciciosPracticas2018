public class Persona{

	// declaracion de atributos

	int id;
	String nombre;
	int edad;
	String trabajo;
	String correo;

	//constructor de la clase 

	public Persona(int id, String nombre, int edad, 
		String trabajo, String correo){
			this.id = id;
			this.nombre = nombre;
			this.edad = edad;
			this.trabajo = trabajo;
			this.correo = correo;
	}

	// getters y setters 
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getEdad(){
		return edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getTrabajo(){
		return trabajo;
	}

	public void setTrabajo(String trabajo){
		this.trabajo = trabajo;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}
}