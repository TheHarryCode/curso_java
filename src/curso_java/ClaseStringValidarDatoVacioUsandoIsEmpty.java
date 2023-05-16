package curso_java;

import javax.swing.JOptionPane;

public class ClaseStringValidarDatoVacioUsandoIsEmpty {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		if(nombre.trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "El Nombre ingresado no es valido o esta vacio");
		}else {
			JOptionPane.showMessageDialog(null, "su nombre es: "+nombre);
		}
		
	}
}
