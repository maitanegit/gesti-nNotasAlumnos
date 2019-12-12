package gestiónNotasAlumnos;

public class alumno implements Constantes{
	
	private String Nombre;
	private int Nota;
	public alumno(String nombre, int nota) {
		super();
		Nombre = nombre;
		Nota = nota;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNota() {
		return Nota;
	}
	public void setNota(int nota) {
		Nota = nota;
	}
	
	

}
