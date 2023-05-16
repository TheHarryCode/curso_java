package curso_java;

import javax.swing.JOptionPane;

public class ClaseStringPonerMayusculaMinuscula {
	
	private static final String MENSAJE_OK = "EXITOSO";
	
	public static void main(String[] args) {
		
		String nombre = "TheHarryCode";
		System.err.println(nombre);
		System.err.println(nombre.toUpperCase());
		System.err.println(nombre.toLowerCase());
		
		String respuesta = JOptionPane.showInputDialog("Ingrese respuesta");
		//Replace these toUpperCase()/toLowerCase() and equals() calls with a single equalsIgnoreCase() call.
		if(MENSAJE_OK.equals(respuesta.toUpperCase())) {
			JOptionPane.showMessageDialog(null, "Se registro con exito");
		}else {
			JOptionPane.showMessageDialog(null, "NOOO Se registro con exito!");
		}
	}
}
