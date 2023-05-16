package reglas_sonar;

public class SolucionReplaceTheseToUpperLowerCaseAndEquals {
	public static void main(String[] args) {

		String respuesta = "Ok";
		//Solución (FIX): Sonar - Java: Replace these toUpperCase()/toLowerCase() and equals() calls with a single equalsIgnoreCase() call.
		if("Ok".equalsIgnoreCase(respuesta)) {
			System.err.println("Se registro con exito");
		}else {
			System.err.println("NOOO Se registro con exito!");
		}
	}
}
