package solucion_errores;

import javax.swing.JOptionPane;

public class SolucionErrorNumberFormatExcep {

	//Solución (FIX): Java - java.lang.NumberFormatException: For input string: "XXX"
	public static void main(String[] args) {
		
		//1. eliminar los valores no numericos
		//2. Controlar el NumberFormatException
		//3. Validando con una expresion regular
		
		String dato = JOptionPane.showInputDialog("Ingrese un valor numerico");
		
		//Solución (FIX): Sonar - Java: Use concise character class syntax 'XX' instead of 'XX'.
		if(dato.matches("\\d*")) {
			int edad = Integer.parseInt(dato);
			JOptionPane.showMessageDialog(null,"Su edad es: "+edad);
		}else {
			JOptionPane.showMessageDialog(null,"El valor ingresado no es numerico");
		}
		

		//		try {
		//			int edad = Integer.parseInt(dato);
		//			System.err.println("Su edad es: "+edad);
		//		}catch(NumberFormatException e) {
		//			JOptionPane.showMessageDialog(null, "El valor ingresado no es numerico");
		//		}

	}
}
