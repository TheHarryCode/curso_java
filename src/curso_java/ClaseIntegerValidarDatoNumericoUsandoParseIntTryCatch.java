package curso_java;

public class ClaseIntegerValidarDatoNumericoUsandoParseIntTryCatch {

	//Curso Java | Como Validar si un dato es numerico usando Integer.parse y Try Catch
	public static void main(String[] args) {
		String dato = "1m";
		System.err.println("El Dato es numero: "+isNumeric(dato));
	}

	private static final boolean isNumeric(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

}
