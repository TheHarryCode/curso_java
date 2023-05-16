package curso_java;

public class ClaseStringValidarDatoNumericoUsandoMatches {
	
	//Curso Java | Como Validar si un dato es numerico usando String.matches
	public static void main(String[] args) {
		String dato = "48";
		System.err.println("El valor es numerico: "+dato.matches("\\d*"));
	}
}
