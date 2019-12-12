package gestiónNotasAlumnos;

public class principal implements Constantes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alumno A1 = new alumno("Iker",NOTABLE);
		alumno A2 = new alumno("Maitane",SOBRESALIENTE);	
		alumno A3 = new alumno("Oier",SUSPENSO);	
		alumno A4 = new alumno("Nekane",APROBADO);	
		alumno A5 = new alumno("Itxaso",SUSPENSO);	
		
		
			Uttilidades.mostrarAlumno(A1);
			Uttilidades.mostrarAlumno(A2);
			Uttilidades.mostrarAlumno(A3);
			Uttilidades.mostrarAlumno(A4);
			Uttilidades.mostrarAlumno(A5);
		
		
		System.out.println(A1.getNombre() + " - " +  A1.getNota() );
		System.out.println(A2.getNombre() + " - " +  A2.getNota() );
		System.out.println(A3.getNombre() + " - " +  A3.getNota() );
		System.out.println(A4.getNombre() + " - " +  A4.getNota() );
		System.out.println(A5.getNombre() + " - " +  A5.getNota() );
		
	}

}
