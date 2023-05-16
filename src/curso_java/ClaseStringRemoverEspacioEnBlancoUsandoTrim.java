package curso_java;

public class ClaseStringRemoverEspacioEnBlancoUsandoTrim {
	public static void main(String[] args) {
		String nombre = "TheHarryCode      ";
		System.err.println("Sin usar .trim()");
		System.err.println("El nombre del canal es: "+nombre);
		System.err.println("La cantidad de caracteres que tiene es: "+nombre.length());
		
		System.err.println("Usando .trim()");
		System.err.println("El nombre del canal es: "+nombre.trim());
		System.err.println("La cantidad de caracteres que tiene es: "+nombre.trim().length());
	}
}
