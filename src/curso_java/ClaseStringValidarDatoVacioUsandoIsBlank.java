package curso_java;

public class ClaseStringValidarDatoVacioUsandoIsBlank {
	public static void main(String[] args) {
		String nombre = "";
		System.err.println("nombre.isBlank "+nombre.isBlank());
		System.err.println("nombre.isEmpty "+nombre.trim().isEmpty());
	}
}
