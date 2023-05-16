package curso_java;

import javax.swing.JOptionPane;

public class ClaseStringDiferenciasEntreIsEmptyAndIsBlank {
	public static void main(String[] args) {
		String numero = " ";//JOptionPane.showInputDialog("Ingrese su edad"); //0-9
		String nombre = " "; //0-9a-Z
		
		System.err.println("numero.isEmpty() "+numero.trim().isEmpty()); //false > .lenght >0
		//System.err.println("nombre.isBlank() "+nombre.isBlank()); //false-> eliminar los espacios vacios y luego valida el .lenght >0
	}
}
