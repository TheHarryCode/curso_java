package curso_java;

import model.Persona;

public class ClaseStringConvertirOtrosTiposDeDatosAString {
	public static void main(String[] args) {
		Integer documento = 123456789;
		Boolean tieneHijos = false;
		Double peso = 80.1;
		Long celular = 144984l;

		//Solución (FIX): Java: The method xX(String) in the type XX is not applicable for the arguments (XX)
		Persona per = new Persona();
		per.setDocumento(String.valueOf(documento));
		per.setTieneHijos(String.valueOf(tieneHijos));
		per.setPeso(String.valueOf(peso));
		per.setCelular(celular.toString());
	}
}
