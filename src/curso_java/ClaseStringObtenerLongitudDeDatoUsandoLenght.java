package curso_java;

import javax.swing.JOptionPane;

//Curso Java | String | Como Obtener La Cantidad de Caracteres De un Dato Usando Lenght 
public class ClaseStringObtenerLongitudDeDatoUsandoLenght {

	public static void main(String[] args) {
				
		//Solución (FIX): Java: XXX cannot be resolved
		String numeroDocumento = JOptionPane.showInputDialog("Ingrese su documento");
		if(numeroDocumento.length()>10) {
			JOptionPane.showMessageDialog(null,"El numero de documento no puede contener mas de 10 digitos");
		}else {
			JOptionPane.showMessageDialog(null,"Su numero de documento es: "+numeroDocumento);
		}
		
		String tipoSangre = "O";
		
		//Solución (FIX): Sonar - Java: Missing curly brace
		if(tipoSangre.length()!=2) 
			JOptionPane.showMessageDialog(null,"Tipo de sangre indicado no es valido");

		
	}

}
