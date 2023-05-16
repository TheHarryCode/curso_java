package reglas_sonar;

import javax.swing.JOptionPane;

public class SolucionReplacerThisIfThenElseStatementBySingleReturn {
	public static void main(String[] args) {
		String respuesta="OK";
		JOptionPane.showMessageDialog(null, "La respuesta fue exitosa : "+validarRespuestaExitosa(respuesta));
	}
	
	private static boolean validarRespuestaExitosa(String respuesta) {
		//Solución (FIX): Sonar - Java: Replace this if-then-else statement by a single return statement.		
		return respuesta.equalsIgnoreCase("OK");
	}
}
